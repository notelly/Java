package com.yedam.variable;

public class Exam02 {
	public static void main(String[] args) {
		int var1 = 0b1011; //2진수
		int var2 = 0206;   //8진수
		int var3 = 365;	   //10진수
		int var4 = 0xB3;   //16진수
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		
		// byte -128 ~ 127
		byte bVal = -128;
		byte bVal2 = 0;
		byte bVal3 = 127;
		int bVal4 = 500;
		
		//long
		
		long lVal = 10;
		long lVal2 = 20L;
		long lVal3 = 10000000000L; //long을 써도 int 범위를 넘어가면 오류가 뜬다. 여기서 끝에 L을 써주면 long을 쓴다고 말해주는 모양.
		
		//char (유니코드)
		//문자만 넣을 수 있음.
		//문자열과 문자는 다름.
		//문자열 => 문자가 모여서 만들어진 것.(String이라고 따로 있다.)
		//ex) "apple"
		//문자 => 하나의 알파벳
		//ex) 'A', 'B'
		char cVar = 'A';  //65
		char cVar2 = '가';
		char cVar3 = 67;  //C
		char cVar4 = 0x0041;
		
		System.out.println(cVar);
		System.out.println(cVar2);
		System.out.println(cVar3);
		System.out.println(cVar4);
		
		//문자열 ""
		
		String str = "홍길동";
		//char cVal = "홍길동"; //오류
		// String str1 = '홍길동'; 오류
		String str2 = "프로그래머";
		System.out.println(str2);
		System.out.println(str);
		
		//탭만큼 띄움
		System.out.println("번호\t이름\t직업");
		//엔터
		System.out.println("행 단위 출력\n");
		//특수문자 존재 여부 확인
		System.out.println("우리는 \"개발자\" 입니다.");
		//특수문자 존재 여부 확인
		System.out.println("봄\\여름\\가을\\겨울");
		
		//실수 타입
		//float
		float fVal = 3.14f;//float fVal = 3.14; 오류남 why? long타입처럼 무슨 타입인지 명시해줘야한다.
		//double
		double dVal = 3.14;
		
		//e 사용하기
		double dVal2 = 3e6;  // 3 * 10^6
		float fVal2 = 3e6F;  // 3 * 10^6
		double dVal3 = 2e-3; // 2 * 10^-3 => 2/1000  //e는 10^2, 자리수
		
		System.out.println(dVal2);
		System.out.println(fVal2);
		System.out.println(dVal3);
		
		//논리 타입 - true false
		//if(내용~)
		boolean stop = true;
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		}
		
	}

