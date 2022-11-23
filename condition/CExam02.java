package com.yedam.condition;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		
		//학점 계산하기
		// switch문으로 해결
		//사용자가 입력한 점수를 토대로 학점을 출력
		// 90 이상은 A
		// 89~80 B
		// 79~70 C
		// 69~60 D
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력>");
		int score = Integer.parseInt(sc.nextLine());
		//switch 문은 부등호 못 씀.
		// 예시) 98 -> A
		//추가 문제
		int value = score/10;
		switch (value) {
		case 10:  //System 한번만 써도 된다. 100점도 A 나오게 할 수 있음.
		case 9:	// 99~90 / 10 => 9
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
		
		
		
		
		
		
		
		
	}
}
