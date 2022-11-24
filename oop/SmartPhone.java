package com.yedam.oop;

public class SmartPhone {

	//필드
	//객체의 정보를 저장하는 곳
	//변수를 선언하고 {} 안에서는 마음데로 쓸 수 있음.
	String name;
	String maker; //= "Apple"; 이걸 적는다면 생성사에서 maker 파트는 빼줘야한다.// 계속 Apple 것만 만든다면 일일이 넣어줄 필요 없이 이렇게 한번적고 계속 쓴다.
	int price;
	//생성자(무조건 쓰는 공식이 있음 class 이름과 동일하게 만들어주어야함.)
	//자바에서 생성자가 클래스 내부에 "하나도 없을때" 알아서 기본 생성자를 만들고 객체를 생성.
	//기본생성자.
	/*public SmartPhone() {
		
	}*/
	//this => 나 자신, 클래스
	//매개변수가 들어간 생산자. 내가 가지고 들어온 데이터와 매개변수가 매칭이 될까? => 매개함수에 정의한 매개변수의 이름과 필드 이름이 같아야하는 이유
	public SmartPhone() {
		this.name = "iphone14Pro";
	}
	public SmartPhone(String name) {
			//객체를 만들 때 원하는 행동 또는 데이터 저장 등등할때 여기에 내용을 구현해 주면 된다.
	}
	public SmartPhone(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	// 매개변수의 갯수, 매개변수의 타입. 으로 다른 생성자임을 판별한다.
	//생성자를 여러개 만들어낼 수 있다.
	public SmartPhone(int price) {
		
	}
	public SmartPhone(String name, String maker, int price) {
		
	}

	/*public SmartPhone(String name, String maker, int price) { //매개변수 3개를 넣어햐 사용할 수 있음.
		this.name = name; //필드 내부에 있는 name 을 가지고 오는것. this.를 붙여주어야한다.
		this.maker = maker;
		this.price = price;
		call();}*/
		
	//메소드
	//객체의 기능을 정의 하는 곳.
	void call() {
		System.out.println(name + " 전화를 겁니다.");
	}
	void hangup() {
		System.out.println(name + " 전화를 끊습니다.");
	}
	
	//1) 리턴 타입이 없는 경우 : void
	//안에 실행문을 실행하고 끝난다.
	     //메소드 이름
				//매개변수
	void getInfo(int no) {
		System.out.println("매개 변수 : " + no);
	}
	
	//2) 리턴 타입이 있는 경우
	//1. 기본 타입 : int, double, long, etc.
	//2. 참조 타입 : String, 배열, 클래스, etc.
	//2-1 리턴 타입이 기본 타입일 경우
	int getInfo(String temp) {
		
		return 0; // 다시 되돌아가는 것 return type = int; 
	}
	
	
	//2-2)리턴 타입이 참조 타입일 경우
	String[] getInfo(String[] temp) {
		
		return temp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
