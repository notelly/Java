package com.yedam.oop;

public class Calculator {
	//필드
	
	
	//생성자
	
	
	//메소드
	int sum(int a, int b) {
		return a+b;
	}
	
	double sub(int a, int b) {
		return a-b; //자동으로 double로 타입이 바뀜.
	}
	
	//매개변수의 데이터 타입 차이에 따른 오버로딩
	//int -> double
	double sub(double a, double b) {
		return a-b; //자동으로 double로 타입이 바뀜.
	}
	//매개변수의 갯수에 따른 오버로딩
	//매개변수가 2->1
	int sum(int a) {
		return a;
	}
	//매개변수의 데이터 타입 차이에 따른 오버로딩.
	//int, int -> double, int 
	double sum(double a, int b) {
		return a+b;
	}
	//매개변수의 순서 차이에 따른 오버로딩
	//double int -> int double
	double sum(int b, double a) {
		return a+b;
	}
	
	/*return문
	 * String result(String value) {
		String temp = "value return 테스트 : " +value;
		return temp;*/
	//return 없이
	void result(String value) {
		System.out.println("value return 테스트 : " +value);
	}//메소드를 실행함과 동시에 내용을 출력하는 것.
	
	void lotto() {
		//로또 번호 출력
		//추첨
		//로또 번호 생성 횟수 제한
		
		//한곳에 쓰면 너무 복잡해진다. 오류 찾기도 힘듬
		
		// 자주쓰는 기능을 분류해서 불러오기
		//재 사용성을 올려줌.
	}
	void randomLotto() {
		//추첨
	}
	//추첨

	
	
	
}
