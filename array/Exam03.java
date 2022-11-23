package com.yedam.array;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		//배열의 크기를 가변적으로 만들기
		Scanner sc = new Scanner(System.in);
		
		int[] ary;
		int no;
		System.out.println("배열의 크기>");
		no = Integer.parseInt(sc.nextLine());
		
		ary = new int[no];
		
		// ary = new int[5];불가능. 최초의 배열 크기를 정할때만 가능.
		
		System.out.println(ary.length);
		
		for(int i=0; i<ary.length; i++) {
			System.out.println("입력>");
			ary[i] = Integer.parseInt(sc.nextLine());
		}
		
		
		
		
		
		
		
	}
}
