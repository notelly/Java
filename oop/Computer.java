package com.yedam.oop;

public class Computer {
	
	
	//필드
	//생성자
	
	//매개변수를 모를 경우에 만듬.
	//메소드
	int sum(int ... values) { //...펼침 연산자.
		int sum = 0;
		for(int i = 0; i<values. length; i++) {
			System.out.println(values[i]); //int으로 설정 했어도 배열로 받아온다는 것.
			sum += values[i];
		}
		return sum;
	}
	
	
}	
