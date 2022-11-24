package com.yedam.oop;

public class Student {
	public static void main(String[] args) {
		StudentInfo std1 = new StudentInfo("이가영", "함지고", 221124);
		StudentInfo std2 = new StudentInfo("김가영", "함지고", 221125);
		StudentInfo std3 = new StudentInfo("박가영", "함지고", 221126);
		StudentInfo std4 = new StudentInfo("최가영", "함지고", 221127);
		StudentInfo std5 = new StudentInfo("정가영", "함지고", 221128);
		StudentInfo std6 = new StudentInfo("장가영", "함지고", 221129);
		//배열에 넣어서 써보기
		//int[] intAry = new int[6];
		//intAry[0] = 1;
		
		StudentInfo[] stdAry = new StudentInfo[6];
		stdAry[0] = std1;
		stdAry[1] = std2;
		stdAry[2] = std3;
		stdAry[3] = std4;
		stdAry[4] = std5;
		stdAry[5] = std6;
		/*for(int i = 0; i < stdAry.length; i++) {
			for(int j = 1; j < stdAry.length+1; j++)
				stdAry[i] = ;
		}*/
		
		for(int i = 0; i < stdAry.length; i++) {	
			/*stdAry[i].kor = 50;
			stdAry[i].math = 60;
			stdAry[i].eng = 100; 이렇게 정보 추가도 가능*/
			stdAry[i].getInfo();
			
		}
		
		
		
	}
}
