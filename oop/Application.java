package com.yedam.oop;

public class Application {
	public static void main(String[] args) {
		//설계도를 토대로 객체를 만들고 객체를 작동?
		//SmartPhone 클래스(설계도)를 토대로 iPhone14Pro를 만들었다.
		SmartPhone iphone14Pro = new SmartPhone("iphone14Pro", "Apple", 500000);
		// SmartPhone 필드랑 메소드를 사용하려면 . 을 사용해야한다.
		//실질적으로 사람들이 보는 것은 = "" 에 담겨 있는 정보.
		/*iphone14Pro.maker = "Apple";
		iphone14Pro.name = "iphone14Pro";
		iphone14Pro.price = 100000;*/
		
		iphone14Pro.call();
		iphone14Pro.hangup();
		
		//iphone14Pro.price = 5000; //값은 재사용 가능하다.
		
		//필드 정보 읽기
		System.out.println(iphone14Pro.maker);
		System.out.println(iphone14Pro.name);
		System.out.println(iphone14Pro.price);
		
		//SmartPhone 클래스(설계도) 여러가지 물건을 만들 수 있음.
		
		SmartPhone zfilp4 = new SmartPhone();
		zfilp4.maker = "samsung";
		zfilp4.name = "zfilp4";
		zfilp4.price = 100000;
		
		zfilp4.call();
		zfilp4.hangup();
		
		//System.out.println(iphone14Pro.maker);

		SmartPhone sony = new SmartPhone();
			
		//리턴 타입이 없는 메소드
		/*int a = >> 있으면 오류남.*/ sony.getInfo(0);
		//리턴 타입이 int인 메소드
		int b = sony.getInfo("int"); //retutn 0; b = 0
		//리턴 타입이 String[]인 배열
		String[] temp = sony.getInfo(args); //복귀할때 데이터 타입과 받을 데이터 타입이 동일해야한다.
		
		
		

		
		
		
	}
}
