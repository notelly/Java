package com.yedam.oop;

public class Person {
	//필드
	final String nation = "korea";
	final String ssn; // 주민등록번호
	String name;
	
	//생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	//메소드
}
