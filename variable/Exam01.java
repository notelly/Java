package com.yedam.variable;

public class Exam01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value;  //value를 변수로 선언 /메모리의 하나의 방을쓰는 가명을 지어주는 것.
		value = 10;  //초기값
		System.out.println(value);
		
		int value2 = 20; //바로 변수 초기값 선언.
		
		int value3;
		//int result = value3 + 10; 이러면 안됨 오류남
		
		
		//변수 값 복사
		int x = 3;
		int y = 5;
		int temp; //temp 임시적으로 쓰는 것
		//데이터 변경 전
		System.out.println("x: " + x + ", " + "y: "+ y);
		
		temp = x;
		x = y;
		y = temp;
		
		//데이터 변경 후
		System.out.println("x: " + x + ", " + "y: "+ y);
		
		static int v4;
			int v1 = 15;
			
			if(v1 > 10) {
				int v2;
				v2 = v1 - 10;
			}
			int v3 = v1 + v2 + 5;
	}
	v1 =5;
}
