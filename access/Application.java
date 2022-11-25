package com.yedam.access;

public class Application {
	public static void main(String[] args) {
		Access access = new Access();
		

		//public
		access.free = "free";
		
		//protected
		access.parent = "parent"; // 패키지가 다르면 사용 못함. 같은 패키지에 있으므로 상관 ㄴㄴ
		//default
		access.basic = "basic"; // 패키지가 다르면 사용 못함.
		
		access.free();
		
		
		//private
//		access.privacy = "privacy"; //내가 속한 클래스에서만 사용가능
		//왜 쓸까? 오후에 할꺼임
	}
}
