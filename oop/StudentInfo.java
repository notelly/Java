package com.yedam.oop;

public class StudentInfo {
	//필드
	String name;
	String school;
	int number;
	int kor;
	int math;
	int eng;
	//생성자
	public StudentInfo() {
		
	}
	public StudentInfo(String name, String school, int number) {
		this.name = name;
		this.school = school;
		this.number = number;

	}
	//메소드
	void getInfo() {
		/*int sum = kor + math + eng;
		double avg = (double)sum/3;*/
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 학교 : " + school);
		System.out.println("학생의 학번 : " + number);
		System.out.println("총  점 : " + sum() +"점");
		System.out.printf("평  균 : %4.1f점", avg());
		System.out.println(); //2번해야하는 이유 printf의 끝은 평균~점. 그래서 엔터 두번해줘야 띄워진다.
		System.out.println();	
	}
	
	int sum() {
		return kor + math +eng;
	}
	
	double avg(){
		double avg = sum() / (double)3;
		return avg;
	}
}
