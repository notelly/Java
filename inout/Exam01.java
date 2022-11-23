package com.yedam.inout;

import java.io.IOException;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) throws Exception {
		int value = 123;
		String name = "상품";
		double price = 1000.10;
		System.out.printf("상품의 가격 : %d\n", value);
		System.out.printf("%s의 가격 : %d\n", name, value);
		System.out.printf("%s의 가격 : %d원, %f\n", name, value, price);
		
		//1) 정수 사용
		value = 11;
		System.out.printf("%d\n", value);
		System.out.printf("%6d\n", value);
		System.out.printf("%-6d\n", value);
		System.out.printf("%06d\n", value);
		//2) 실수 사용
		price = 123.4567;
		System.out.printf("%f\n", (double)value/5);
		System.out.printf("%10.2f\n", price);
		System.out.printf("%-10.2f\n", price);
		System.out.printf("%010.2f\n", price);
		//3) 문자열 사용
		System.out.printf("%s\n", "문자열사용");
		System.out.printf("%6s\n", "문자열사용");
		System.out.printf("%-6s\n", "문자열사용");
		
		System.out.print("아무것도 없는 print");
		
		
		//입력
//		int keyCode;
//	
//		System.out.println("원하는 값 입력>");
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);
//		
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);
//		
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);
//		
		//스캐너(scanner)
		
		Scanner sc = new Scanner(System.in); //바로 못 쓰기 때문에 외부의 힘을 빌려야함. >> 일단 외우고 차후에 배울때 디테일하게 sc는 변수 암거나 쓰면 됨
		System.out.println("데이터입력>");
		
		String word = sc.nextLine(); //변수.nextLine : 입력받은 데이터를 다 문자열로 받아들인다.
		
		System.out.println(word);
		
		if(word.equals("test")) {
			System.out.println("equal: 입력한 문자열과 비교 문자열이 같음.");
		}
		if(word == "test") {
			System.out.println("== : 입력하신 문자열과 비교 문자열이 같음.");
		}
		
		
	}

}
