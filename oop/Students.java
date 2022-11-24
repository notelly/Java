package com.yedam.oop;

public class Students {
	public static void main(String[] args) {
		StudentInfo info = new StudentInfo("고길동", "예담고등학교", 221124, 100, 50, 80);
		info.getInfo();
		
		StudentInfo info1 = new StudentInfo();
		info1.name = "김둘리";
		info1.school = "예담고등학교";
		info1.number = 221125;
		info1.kor = 80;
		info1.math = 90;
		info1.eng = 50;
		
		info1.getInfo();
		
		StudentInfo info3 = new StudentInfo("김또치", "예담고등학교", 221126, 50, 100, 60 );
		info3.getInfo();
	}
}
