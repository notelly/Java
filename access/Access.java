package com.yedam.access;

public class Access {
	/*
	 * public 어디서든 누구나 다 접근 가능
	 * protected 상속 받은 상태에서 부모 - 자식간에 사용(패키지가 달라도 사용가능)
	 * 			 패키지가 다르면 사용 못함, 같은 패키지에서만 사용가능
	 * default 패키지가 다르면 사용 못함, 같은 패키지에서만 사용가능
	 * private 내가 속한 클래스에서만 사용 가능.
	 * 
	 * */
	//접근 제한자 -> 이름을 지어서 사용하는 (변수, 클래스, 메소드 등등) 것들에 전부 적용가능.
	//필드
	public String free;
	protected String parent;
	private String privacy;
	String basic; //default type
		
	// 생성자
	public Access() {
		// TODO Auto-generated constructor stub
	}
	//기본 생성자는 퍼블릭으로 만듦 객체를 만들어야하기 때문에
	
	private Access(String privacy) { //class 내부에서만 사용할 수 있는데 의미가 없음. 사용할 일이 없다.
		this.privacy = privacy;		 // 노란줄 - eclipse 가 알려주는 경고
	}
	
	
	// 메소드
	/*public void run() {
		System.out.println("달립니다.");
	}*/
	
	public void free() {
		System.out.println("접근이 가능합니다.");
		privacy(); //private를 쓰는 방법은 private는 public안에 넣는 것. //실행만 시키는 것.
	}
	
	private void privacy() {
		System.out.println("접근이 불가능합니다."); //보통 회사전용 특허기술을 보여주지않고 기술을 쓰기위해 사용함.
	}
	//class 내부에서 각자다른 객체를 호출 가능. 안에 있는 정보를 좀더 숨기는 것
}
