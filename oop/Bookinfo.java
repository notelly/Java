package com.yedam.oop;

public class Bookinfo {
	public static void main(String[] args) {
		BookClass info = new BookClass("혼자 공부하는 자바","학습서", "24,000원","한빛미디어","yedam-001");
		info.getInfo();
		BookClass info2 = new BookClass("이것이 리눅스다","학습서", "32,000원","한빛미디어","yedam-002");
		info.getInfo();
		BookClass info3 = new BookClass("자바스크립트 파워북","학습서", "22,000원","어포스트","yedam-003");
		info.getInfo();
	}
}
