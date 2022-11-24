package com.yedam.oop;

public class BookClass {

	//필드
	String name;
	String kind; // 계속 중복되면 = "학습서"로 써도 된다.
	String price;
	String company;
	String isbn;
	//생성자
	public BookClass(String name, String kind, String price, String company, String isbn) {
		this.name = name;
		this.kind = kind;
		this.price = price;
		this.company = company;
		this.isbn = isbn;
	}
	
	//메소드
	void getInfo() {
		System.out.println("책이름 : "+name);
		System.out.println("# 내용");
		System.out.println("1) 종류 : "+kind);
		System.out.println("2) 가격 : "+price);
		System.out.println("3) 출판사 : "+company);
		System.out.println("4) 도서번호 : "+isbn);
		System.out.println();
	}
	
	/*String arrys(String[] book) {
		for(int arry : arrys) {
			System.out.println(arry);
			return;
		}
	}*/
}
