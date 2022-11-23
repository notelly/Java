package com.yedam.array;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		
		
		while(run) {
			System.out.println("===================================================");
			System.out.println(" 1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
			System.out.println("===================================================");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
			}else if (selectNo == 2) {
				scores = new int[studentNum]; //여기가 더 최적인 이유 1번에 넣는다면, 잘못 입력했을 시 수정이 불가능함. 여기다 넣으면 수정이 가능함.
				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores["+ i + "]>");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores["+ i + "]>"+ scores[i]);
				}
			}else if (selectNo == 4) { //sum이랑 max랑 한꺼번에 쓰기 가능
				int max = 0;
				int sum = 0;
				for(int i = 0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}	
					sum = sum + scores[i];
				}
				double avg = (double)sum/scores.length;
				System.out.println("최고 점수: "+ max);
				System.out.println("평균 점수: "+ avg);
				
				
			}if(selectNo == 5) {
				run =false;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}

