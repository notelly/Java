package com.yedam.array;

public class Exam07 {
	public static void main(String[] args) {
		int[][] intAry = { {1,2}, {1,2,3} };
		
		//					  {{1,2,3}, {1,2,3}}
		int[][] mathScore = new int[2][3];
		// {{1,2,3}, {1,2,3}}
		// 첫번째 문을 여는 배열
		for(int i = 0; i<mathScore.length; i++) {
			System.out.println(mathScore.length);
			//두번째 문(배열 안에 배열)을 여는 반복문
			for(int k=0; k<mathScore[i].length; k++) {
				
				System.out.println("mathScore["+i+"]["+k+"]=" + mathScore[i][k]);
			}
		}
	}
}
