package com.yedam.oop;

import com.yedam.access.Access;

public class Application4 {
	public static void main(String[] args) {
		//Access를 이곳에 가지고 와서 쓸 예정.
		Access access = new Access();
		
		
		//public
		access.free = "free";
		
		//protected
		access.parent = "parent"; // 패키지가 다르면 사용 못함. the field Access.parent is not visible
		
		//private
		access.privacy = "privacy"; //내가 속한 클래스에서만
		
		//default
		access.basic = "basic"; // 패키지가 다르면 사용 못함.
	}
}
