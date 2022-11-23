package com.yedam.variable;

public class Exam04 {
	public static void main(String[] args) {
		byte bVal = 10;
		byte bVal2 = 20;
		//int 아래 데이터 타입일 경우, 연산하게 되면
		//int로 결과 값이 나온다.
		int iResult = bVal + bVal2; 
		System.out.println("Btye간 연산 결과(int) : " + iResult);
		
		char cVal = 'A';
		char cVal2 = 10;
		iResult = cVal + cVal2;
		System.out.println("Char간 연산 결과(int) : " + iResult);
		System.out.println("Char간 연산 결과(문자) : " + (char)iResult);
		
		int iVal2 = 30;
		double dVal3 = iVal2/4.0;
		System.out.println("int/실수 : " + dVal3);
		
		int x = 20;
		int y = 9;
		double result = (double)x/y;
		System.out.println("double 자동 변환 : " + result);
		
		
		int value = 10 + 2 + 8; //20
		System.out.println("value : " + value);
		//sysout 입력 후 ctrl + space: System.out.println 단축키
		
		String str1 = 10+2+"8"; //128
		System.out.println("str1 : " + str1);
		
		String str2 = 10 + "2" + 8; //1028
		System.out.println("str2 : " + str2);
		
		String str3 = "10" + 2 + 8; // 1028
		System.out.println("str3 : " + str3);
		
		String str4 = "10" + (2 + 8); //1010
		System.out.println("str4 : " + str4);
		
		//문자열 강제 타입 변환
		String iNo = "10"; //int로 되돌린다.
		String bNo = "8";
		String dNo = "3.222";
		
		int sNo = Integer.parseInt(iNo);
		byte sNo2 = Byte.parseByte(bNo);
		double sNo3 = Double.parseDouble(dNo);
		
		System.out.println("int 변환 : " + sNo + "\n byte 변환 : " + sNo2 + "\n double 변환 : " + sNo3);
		
		//기본 타입 값을 문자열로 변경		
		String str5 = String.valueOf(sNo);
		String str6 = String.valueOf(sNo2);
		String str7 = String.valueOf(sNo3);
		
		System.out.println(String.valueOf(sNo) + String.valueOf(sNo2));
		
	}

}
