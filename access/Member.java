package com.yedam.access;

public class Member {

	//필드
	private String id;
	private String pw;
	private String name;
	private int age;
	//나이가 거꾸로 갈리는 없음. 음수라는 데이터가 들어가지 않게 미연에 방지
	//setter, getter 이용.
	
	//생성자
	
	//메소드
	//setter, getter -> 데이터의 무결성을 지키기 위해서 사용.
	//setter
	//이상한 데이터가 들어오는 것을 막기위함.
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("잘못된 나이 입니다.");
			//this.age = 0; //이렇게 써도 가능,
			// 잘못 입력하면 잘못된 나이를 띄우고 리턴 없이 값에 0을 집어넣음.
			//음수가 들어오면 0으로 처리하겠다.
			return; //일부러 쓴것. void는 원래 return 안쓰는데 여기서 유일하게 씀.
					//return; -> return; 을 만나면 하던 것을 멈추고 메소드를 종료한 후, 메소드 호출한 곳으로 이동함.
					//return. 만나는 순간 setAge 부른 곳으로 돌아간다.
		}else {
			this.age = age; //매개변수가 음수일 경우 출력되지 않도록.
		}
		System.out.println("return 적용 안됨.");
	}
	//getter
	//private과 같이 전달 불가능한 것을 외부로 필드값을 전달하는 것이 목적 or 가공해서 외부로 전달가능.
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id.length() < 8) { //id.length 문자열의 길이. 아이디 비번, 글자수 정해줄 때
			System.out.println("8글자 미만입니다. 다시 입력해 주세요.");
			return;
		}
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		//미국의 나이와 한국의 나이는 한살차이 나므로
		//아래의 내용을 실행한다.
		age = age + 1;
		return age;
	}
	
}
