package com.yedam.reference;

public class Exam02 {
	public static void main(String[] args) {
		String strVal1 = "yedam";
		String strVal2 = "yedmam";
		//참조 타입의 ==는 데이터를 비교하는게 아니고
		//데이터가 위치한 메모리 주소를 비교하는 것
		if (strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2의 메모리 주소는  같다.");
		}else {
			System.out.println("starVal1과 strVal2의 메모리 주소는 다르다.");
		}
		
		//문자열(String)간의 데이터를 비교.
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2의 데이터는 같습니다.");
		}else {
			System.out.println("strVal1과 strVal2의 데이터는 다릅니다.");
		}
		
		String strVal3 = new String("yedam");
		String strVal4 = new String("yedam");
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 같은 메모리 주소를 가지고 있다.");
		}else {
			System.out.println("strVal3과 strVal4는 다른 메모리 주소를 가지고 있다.");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("trVal3과 strVal4의 데이터는 같습니다.");
		}else {
			System.out.println("trVal3과 strVal4의 데이터는 다릅니다.");
		}
		
		if(strVal1 == strVal3) {
			System.out.println("strVal1과 strVal3는 같은 메모리 주소를 가지고 있다.");
		}else {
			System.out.println("strVal1과 strVal3는 다른 메모리 주소를 가지고 있다.");
		}
		
	}
}
