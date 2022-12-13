package com.coffee.exe;

import java.util.Scanner;

import com.coffee.logic.CoffeeService;

public class ExeApp {
	
	Scanner sc = new Scanner(System.in);
	int menuNo = 0;
	CoffeeService cs = new CoffeeService();
	
	public ExeApp() {
		start();
		
	}
	
	private void start() {
		while(menuNo != 7) { //switch for 암거나 써도 상관 X
			System.out.println("1. 메뉴 조회 | 2. 메뉴 상세 조회 | 3. 등록 | 4. 판매 | 5. 삭제 | 6. 매출 | 7. 종료 ");
			System.out.println("메뉴 입력 >>");
			menuNo = Integer.parseInt(sc.nextLine());
			if(menuNo == 1) {
				cs.getCoffeeList();
			}else if(menuNo == 2) {
				cs.getCoffee();
			}else if(menuNo == 3) {
				cs.insertCoffee();
			}else if(menuNo == 4) {
				cs.salesCoffee();
			}else if(menuNo == 5) {
				cs.deleteMenu();
			}else if(menuNo == 6) {
				cs.storeSales();
			}else if(menuNo == 7) {
				
			}else {
				System.out.println("1~7 사이 데이터만 기입하세요.");
			}
		}
		
		
		
		
		
		
		
		
	}
}
