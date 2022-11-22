package com.yedam.loop;

public class Exam01 {
	public static void main(String[] args) {
		int sum = 0;
		//1) 규칙
		/*sum = sum +1; // sum = 0 + 1
		sum = sum +2; // sum = 1 + 2
		sum = sum +3; // sum = 3 + 3
		sum = sum +4;
		sum = sum +5;*/
		
		
		// 1~5가지의 합을 구하는 반복문.
		for(int i = 0; i<=5; i++) {
			sum = sum + i;
		}
		
		//1~100 사이에서 짝수 구하는 반복문
		//1) 규칙
		// i % 2 == 0
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) { //짝수
//			System.out.println(i);
			}
		}
		
		// 1~100 사이에서 홀수 구하는 반복문
		//1) 규칙
		for(int i =1; i <= 100; i++) {
			if(i%2 != 0) {
//			System.out.println(i);
			}
		}
		
		//1~100사이에서 2의 배수 또는 3의 배수 찾기 (||)
		//1~100사이에서 2의 배수 이거나 3의 배수 찾기 (&&) => 6의 배수
		//i % 2 == 0 && i % 3 == 0 2의 배수 이고 3의 배수 이면 6의 배수
		//2의 배수  2 4 6 8 10 12......
		//3의 배수  3 6 9 12 15 ....
		for(int i = 0; i<=100; i++) {
			if(i % 2 == 0 || i % 3 == 0); 
//			System.out.println(i);
		}
		
		//구구단 출력하기
		//만약, 2단 출력
		//2*1, 2*2, 2*3, 2*4.....2*9
		//2*i
		for(int i = 1; i <= 9; i++) {
//			System.out.println("2 X " +i+ " = " + 2*i);
		}
		
		//for문 안에 for문
		//초기화식에 들어가는 변수를 두개를 고려
		//구구단 출력(2~9단)
		for(int i = 2; i <= 9; i++) {
//			System.out.println(i + "단");
			// i = 2일때, 한바퀴 돌고 i = 3
			// 아래 반복문은 9번 돌아감.
			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
		
		//공포의 별 찍기 ★
		
		//******
		//******
		//******
		//******
		//******
		
		//한칸씩 내려 갈 때 쓰는 반복문
		for(int i = 0; i<5; i++){
			String star = ""; // 데이터를 비워준다. int a = 0과 동일
			// 별을 만드는 반복문
			for(int j = 0; j<5; j++) { // 딱풀 연산자 활용
				//+ 연산자를 활용하여 *****를 만듦
				star = star + "★";
				//*
				//**
				//****
			}
			System.out.println(star);
		}
		
		//*
		//**
		//***
		//****
		//*****
		
		for(int i = 0; i < 5; i++) {
			String star ="";
			for(int j = 0; j < 5; j++) {
				if(i >= j){
					star = star + "☆";
				}else {
					star = star + "";
				}
			}
			System.out.println(star);
		}
		
		for(int i = 0; i <=5; i++) {
			String star ="";
			for(int j = 0; j < i; j++) {
				star = star + "☆";
			}
			System.out.println(star);
		}
		
		//거꾸로 별찍기
		for(int i = 0; i < 5; i++) {
			String star ="";
			for(int j = 0; j < 5; j++) {
				if(i <= j){
					star = star + "☆";
				}else {
					star = star + "";
				}
			}
			System.out.println(star);
		}
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		for(int i = 5 ; i > 0 ; i--){
			String star = "";
			for(int j = 1; j <=5; j++) {
				if(i > j) {
					star = star + " ";
				}else {
					star = star + "*";
				}
			}
			System.out.println(star);
		}
		
		//
		
		
		
		
	}
}
