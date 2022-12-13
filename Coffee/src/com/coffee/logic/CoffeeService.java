package com.coffee.logic;

import java.util.List;
import java.util.Scanner;

public class CoffeeService {
	
	Scanner sc = new Scanner(System.in);
	
	//1. 전체 조회
	public void getCoffeeList() { //CoffeeDAO 커피테이블에서 DB를 가지고 올 수 있는것
		List<Coffee> list = CoffeeDAO.getInstance().getCoffeeList(); //getCoffeeList() 이름을 같이 하면 편하다. 왜지...
		//list 안에는 Coffee 타입의 객체가 여러 건 존재.
		for(Coffee coffee : list) {
			System.out.println("메뉴 :  " + coffee.getCoffeeMenu());
			System.out.println("가격 :  " + coffee.getCoffeePrice());
			System.out.println("설명 :  " + coffee.getCoffeeExplain());
		}
	}
	//2. 단건 조회
	public void getCoffee() {
		System.out.println("조회 메뉴 입력 >");
		String menu = sc.nextLine();
		
		//검색 결과
		Coffee coffee = CoffeeDAO.getInstance().getCoffee(menu);
		//조회할 메뉴를 menu 메개 변수에 넣는다. CoffeeDAO의 단건 조회의 String menu = menu -> 메소드를 실행한다.
		//coffee == null 데이터가 올바르게 들어오지 않았다.
		if(coffee == null) {
			System.out.println("등록되지 않는 메뉴입니다.");
		}else {
			System.out.println("메뉴 : " + coffee.getCoffeeMenu());
			System.out.println("가격 : " + coffee.getCoffeePrice());
			System.out.println("설명 : " + coffee.getCoffeeExplain());
		}
	}

	//3. 등록  CoffeeDAO에서 넘어옴
	public void insertCoffee() {
		Coffee coffee = new Coffee();
		String menu = "";
		int price = 0;
		
		
		String explain = "";
		
		System.out.println("메뉴 등록 > ");
		System.out.println("메뉴 > ");
		menu = sc.nextLine();
		System.out.println("가격 > ");
		price = Integer.parseInt(sc.nextLine());
		System.out.println("설명 > ");
		explain = sc.nextLine();
		
		coffee.setCoffeeMenu(menu);
		coffee.setCoffeePrice(price);
		coffee.setCoffeeExplain(explain);
		coffee.setCoffeeSales(0);
		
		int result = CoffeeDAO.getInstance().insertCoffee(coffee);
		
		//내가 넣은 데이터를 가지고 insert하러 감.
		//coffee 매개변수로 던지면 CoffeeDAO 의 insertCoffee(Coffee coffee)로 넘어감.
		
		if(result == 1 ) {
			System.out.println("정상적으로 메뉴 등록이 되었습니다.");
		}else {
			System.out.println("메뉴가 등록되지 않았습니다.");
		}	
	}
	//4. 판매
	public void salesCoffee() {
		Coffee coffee = new Coffee();
		String menu = "";
		int salesCount = 0;
		
		System.out.println("판매 메뉴 >>");
		menu = sc.nextLine();
		System.out.println("판매 수량 >>");
		salesCount = Integer.parseInt(sc.nextLine());
		
		coffee.setCoffeeMenu(menu);
		coffee.setCoffeeSales(salesCount);
		
		int result = CoffeeDAO.getInstance().salesCoffee(coffee);
		if(result >= 1) {
			System.out.println(menu + " " +salesCount + "건 판매 완료");
		}else {
			System.out.println("판매 실패");
		}
		
	}
	
	
	//5. 삭제
	public void deleteMenu() {
		String menu = "";
		System.out.println("삭제 메뉴 입력 >");
		menu = sc.nextLine();
		
		int result = CoffeeDAO.getInstance().deleteMenu(menu);
		
		if (result >= 1) {
			System.out.println("정상적으로 메뉴가 삭제 되었습니다.");
		}else {
			System.out.println("메뉴가 삭제되지 않았습니다.");
		}
	}
	
	//6. 매출
	public void storeSales() {
		System.out.println("===또치의 커피샵 매출 내역서===");
		//바로 전체 조회 가지고 오기
		List<Coffee> list = CoffeeDAO.getInstance().getCoffeeList();
		int totalSales = 0;
		
		System.out.println("===================================================");
		
		for (Coffee coffee : list) {
			System.out.println("메뉴 : "+ coffee.getCoffeeMenu());
			System.out.println("가격 : "+ coffee.getCoffeePrice());
			System.out.println("판매수량 : "+ coffee.getCoffeeSales());
			System.out.println("판매금액 : "+ coffee.getCoffeePrice() * coffee.getCoffeeSales() + "원");
			totalSales += (coffee.getCoffeePrice()* coffee.getCoffeeSales());
			
		}
		System.out.println("===================================================");
		System.out.println("총 판매 금액 : " + totalSales + "원");
		
	}
	
	
	
	
		
}
