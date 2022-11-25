package com.yedam.access;

public class Application2 {
	public static void main(String[] args) {
		Member member = new Member();
		member.setAge(5);
		System.out.println(member.getAge());
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		// 객체간 주소 비교는  ==
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체입니다.");
		}else {
			System.out.println("다른 싱글톤 객체입니다.");
		}
	}
}
