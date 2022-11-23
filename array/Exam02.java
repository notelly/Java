package com.yedam.array;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//국영수의 데이터를 담는 배열
		int[] score = new int[3];
		
		System.out.println("국어점수>");
		score[0] = Integer.parseInt(sc.nextLine());
		
		System.out.println("영어점수>");
		score[1] = Integer.parseInt(sc.nextLine());
		
		System.out.println("수학점수>");
		score[2] = Integer.parseInt(sc.nextLine());
		
		//array.length
		//1) 점수의 총 합계
		int sum = 0;
		System.out.println("점수 배열의 크기: " + score.length);
		for(int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		System.out.println("점수의 총 합계:  " + sum);
		
		//2) 점수의 평균
		double ave = sum/(double)score.length;
		System.out.println("세 과목 점수의 평균:  " + ave);
		
	}
}
