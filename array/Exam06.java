package com.yedam.array;

public class Exam06 {
	public static void main(String[] args) {
		//최대값의 인덱스 구하기.(최대값이 존재하는 방 번호 구하기)
		
		int[] array = {10,50,70,20,30,80,40,90};
		
		int max = 0 ;
		int maxIndex = 0;
		for(int i = 0; i< array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				maxIndex = i;
			}
		}
		System.out.println("최대값의 인덱스는 : " + maxIndex);
	}
}

