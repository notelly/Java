package com.coffee.logic;

import java.util.ArrayList;
import java.util.List;

import com.coffee.common.DAO;

public class CoffeeDAO extends DAO {
	// java -> JDBC -> DB -> Coffee Table에 접근 -> 데이터 조회, 추가, 수정

	// SingleTon(싱글톤) 여러개 만들 필요가 없기 때문에
	// coffeeDao 하나를 만들어두고 계속 쓰는 것.
	// 만약 싱글톤을 쓰지 않는 다면 만명이 접속 했을 때
	// 만개의 객체를 만들어야함 -> 비효율적임
	// 단 하나의 객체 존재하기 위해서 만들어진 녀석
	private static CoffeeDAO coffeeDao = null;

	private CoffeeDAO() {

	}

	// 객체를 생성해라 : coffeeDAO는 static이기 때문에
	// 안쓰면 굳이 메모리에 올릴 필요가 없음.
	// 그래서 if를 사용해 만들만한 상황이면 만들어줌.
	public static CoffeeDAO getInstance() {
		if (coffeeDao == null) {
			coffeeDao = new CoffeeDAO();
		}
		return coffeeDao;
	}

	// coffeeDAO : DB에서 coffee Table 에 접근하기 위해서 쓰는 객체
	// 전체 조회, 단건 조회, 정보 입력, 수정, 삭제
	// CRUD : Create / Read / Update / Delete

	// 1. 전체 조회 list로 가지고 온다.
	public List<Coffee> getCoffeeList() {
		// 전체 조회 -> Select 문의 결과를 다 가지고 와야함.
		// 배열은 불가 크기가 정해져 있음
		// List, Set, Map
		// Set, Map -> 순서가 없음.
		// SELECT order by 해서 데이더를 가지고 오면 의미X
		// 그래서 List를 사용함. ->
		List<Coffee> list = new ArrayList<>();
		// list[0] => 첫번째 row의 데이터
		// list[1] => 두번쨰 row의 데이터.......
		
		Coffee coffee = null; // 이건

		try {
			conn();
			String sql = "select * from coffee";
			// 1. statement - where 조건 있으면 쓰기가 불편(where 조건없는 select)
			// 2. preparedstatment - where 조건이 있어도 쓰기가 편함.

			// statement로 사용하기 위해서 연결하는 것
			stmt = conn.createStatement(); // 연결하고 정보를 보냄.

			// Query문(SQL) 실행 및 결과 반환
			// 디벨로퍼에서 실행한 결과 값이 그대로 들어간다.
			rs = stmt.executeQuery(sql);

			// next() 메소드 - 다음 row에 데이터가 존재하면 true, 아니면 false
			// 다음에 데이터가 존재하면 T 아니면 F
			// while문 조건이 된다.
			// getString, getInt() 메소드
			// 여러개의 정보, 반복해서 전부다 읽어낸다.
			while (rs.next()) {
				// 서로 다른 row를 서로 다른 객체에 저장하기 위해서 구현.
				coffee = new Coffee(); // 똑같은 객체를 쓸 수 없으니까. 계속 새로운 객체를 생성해줌. 서로다른 row의 값을 서로다른 객체에 넣어주는 개념.

				// 내가 조회한 컬럼명과 매치함.
				// 세로가 아니라 가로로 읽어옴. 그러면 rs.getInt("컬럼명") 세로중에 어떤 정보를 읽어오겠는냐 1행의 coffee_id를
				// 읽어오겠다.
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));
				coffee.setCoffeeSales(rs.getInt("coffee_sales"));

				list.add(coffee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	// 2. 단건 조회 >> 로그인 할때, 아이디 중복검사할 때
	public Coffee getCoffee(String menu) {
		Coffee coffee = null; // 데이터가 없으면 if 문을 타지 않는다.
		// 데이터가 없으면 null을 가지고 옴으로 null이 떴다면 뭔가 오류가 있다는 것.
		try {
			conn();
			String sql = "select * from coffee where coffee_menu = ?"; //prepardStatment매개변수가 있다면 ?로 하면 됨.
			pstmt = conn.prepareStatement(sql); // 연결할 하면서 동시에 쿼리문을 같이 보내줌
			pstmt.setString(1, menu);
			// executeQuery() SELECT문에서만 사용
			
			//statement경우
			//String sql = "select * from coffee where coffee_menu ='"+ menu +"'";
			//stmt = conn.createStatement();
			//rs = stmt.executeQuery(sql);
			//동적으로 변하는 것이 여러가지이면 +menu 일일이 붙여줘야한다.
			
			
			
			rs = pstmt.executeQuery(); // 실행해라
			if (rs.next()) { // 단건이라서 while을 쓰지 않는다.
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));
				coffee.setCoffeeSales(rs.getInt("coffee_sales"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return coffee;
	}
	
	// DB에서 자바로 거꾸로 코딩하는 것이 편하다. 자료 가지고 오는 것부터
	// 3. 등록 // 디벨로퍼에서 행이 입력 되었을 때 '1 행 이(가) 삽입되었습니다.'
	//여기서 저 1을 활용 할것이기 때문에 n으로 표시
	//매개변수로 객체를 받아와서 객체에 담긴 정보로 인서트를 해 줄 것임.
	public int insertCoffee(Coffee coffee) {
		int result = 0;
		//뭐할때 try를 쓴다고?
		try {
			//DB연결
			conn();
			String sql = "INSERT INTO coffee VALUES (?, ?, ?, ?)"; //들어갈 데이터 부분에 ?입력하기 "" 가지고 올때 ; 두고 오기
			//입력할 정보 내용 안내
			//입력한 정보를 가지고 와서 하나하나 입력해줌.
			//insert 부분을 자동 커밋시켜준다고 생각하면 된다.
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffee.getCoffeeMenu());
			pstmt.setInt(2, coffee.getCoffeePrice());
			pstmt.setString(3, coffee.getCoffeeExplain());
			pstmt.setInt(4, coffee.getCoffeeSales());
			
			//DML 사용할 때 쓰는 query 메소드
			result = pstmt.executeUpdate();
			//Select -> executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return result;
	}
	// 4. 판매
	public int salesCoffee(Coffee coffee) {
		int result = 0;
		try {
			conn();
			String sql =  "UPDATE coffee SET coffee_sales = coffee_sales + ? WHERE coffee_menu = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, coffee.getCoffeeSales());
			pstmt.setString(2, coffee.getCoffeeMenu());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return result;
	}
	
	// 5. 삭제
	// 두가지가 있다. >> 아예 삭제할 것인지. 잠시 멈춰두고 보관할 건지.
	// 여기서는 진짜 지우는 것
	public int deleteMenu(String menu) {
		int result = 0 ;
		try {
			conn();
			String sql =  "DELETE FROM coffee WHERE coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, menu);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		
		return result;
	}
	
	
}
