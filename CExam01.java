package com.yedam.condition;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		//Math.random() ->  0 <= Math.random() <1
		// 0 * 60 <= Math.random() *60 < 1 * 60
		// 0 <= Math.random() <60
		// 0 + 40 <= Math.random() < 60 + 40
		// 40 <= Math.random() < 100, 40~99
		// 실수 -> 정수, casting
		//1023.123 -> int 1023
		// 40 ~ 99
		int score = (int)(Math.random() * 60) + 40;
		System.out.println(score);
		if (score >= 70) {
			 System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//삼항 연산자 위에 if 문과 동일
		String pass = (score >=70) ? "합격" : "불합격";
		System.out.println(pass);
		
		// 90 이상 : A
		// 90~80 : B
		// 80~70 : C
		// 70 미만 : D
		
		if(score >= 90) { // 90보다 큰 점수
			pass = "A";
		}else {
			if(score >= 80) { // 80~90
				pass = "B";
			}else {
				if(score >= 70) { //80~70
					pass = "C";
			}else  {
				pass = "D"; // 70보다 작은 점수
			}
			}
		
		}
		
		//if~else 위와 동일
		if(score >= 90) {
			pass = "A";
		}else if(score >= 80) {
			pass = "B";
		}else if(score >= 70) {
			pass = "C";
		}else {
			pass = "D";
		}
		System.out.println(pass);
		
		
		//if문을 활용한 예제
		// 사용자가 입력한 값이 1,2,...9이면 "one", "two", ... "nine"
		// 과 같이 출력하는 프로그램을 작성하고, 1~9 사이가 아니라면 other
		// 출력하시오.
		//Scanner sc = new Scanner(System.in);
		//System.out.println("숫자 입력 >");
		//사용자가 데이터 입력.
		//int no = Integer.parseInt(sc.nextLine());
		/*String res;
		if (no == 1) {
			res = "one";
		}else if (no == 2) {
			res = "two";
		}else if (no == 3) {
			res = "three";
		}else if (no == 4) {
			res = "four";
		}else if (no == 5) {
			res = "five";
		}else if (no == 6) {
			res = "six";
		}else if (no == 7) {
			res = "seven";
		}else if (no == 8) {
			res = "eight";
		}else if (no == 9) {
			res = "nine";
		}else {
			res = "other";
		}
		System.out.println(res);*/
		
		//1~9
		
		/*switch(no) {
		case 1: //==
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;	
		default: //꼭 안넣어줘도 되긴함.
			System.out.println("other");
			break;
		}*/
		
		
		///break문이 없는 switch 문
		int time = (int)(Math.random()*4) +8; //8~11사이의 정수
		
		System.out.println("현재 시간 : " + time + "시");
		
		switch (time) {
		case 8:
			System.out.println("출근을 합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 합니다.");
		}
		
		//성적 확인 문자타입도 switch문을 사용할 수 있다.
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("훌륭한 학생입니다.");
			break;
		case 'B':
			System.out.println("우수한 학생입니다.");
			break;
		case 'C':
			System.out.println("조금 노력하세요.");
			break;
		case 'D':
			System.out.println("분발 하세요.");
			break;
		}
		
		//문자열을 활용한 switch문
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "차장":
			System.out.println("600만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;	
		}
		
	}
}
