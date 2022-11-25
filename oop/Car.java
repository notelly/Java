package com.yedam.oop;

public class Car {
	
	//필드
	String model;
	int speed;
	//생성자
	Car(String model){
		this.model = model;
	}
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		//반복문을 만듭니다.
		//단 조건 : i = 10 부터 시작하게 해주세요.
		//      : i는 50보다 작을때 까지 반복해주세요.
		//		: 반복문을 한번 실행하고 나면 i의 값은 10씩 증가 시켜주세요.
		for(int i = 10; i <=50; i+=10) {
			this.setSpeed(i); //class 내부에서 다른 메소드를 가지고 와서 쓰는 것 this.speed 를 가지고 오는 것 i를 'int speed'에 넣어줌 this.speed에 i 값을 넣어줌.
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
			
		}
	}
}
