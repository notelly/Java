package com.yedam.operator;

public class Exam01 {
	public static void main(String[] args) {
		//부호 연산자 +, -
		int x = -100;
		int result1 = -x;
		int result2 = -x;
		System.out.println("result1 : " + result1);
		System.out.println("result1 : " + result2);
		
		byte b = 100;
		//byte result3 = -b; 같은 데이터타입이 아니라 다른 것에 넣어줘야햔다. 싫으면 b자체에 강제 타입변환 시켜도 상관없긴함.
		int result3 = -b;
		
		//증감 연산자 ++, --
		//위치에 따라서 연산 타이밍이 다름.
		int value = 100;
		
		//출력문이 실행되고 나서 value값 1증가
		System.out.println(value++); //값이 변하지 않은 상태에서 출력됨. 값 = 101
		//--도 동일
		//출력문이 실행되고 전 value값 1증가
		System.out.println(++value); // 여기서 변화 value는 101인 상태 여기서 +1 값 = 102가 됨

		//논리 부정 연산자 >> 논리를 부정한다. (not)
		//true + not(!) = false
		//false + not(!) = true
		boolean flag = true;//
		
		if(!flag) { //! = not, 거짓이면 안으로 못들어감. 그러므로 실행불가.
			System.out.println("false");
		}
		
		if(flag) { // true. 실행가능
			System.out.println("true");
		}
		
		//이항 연산자(사칙연산)
		int v1 = 10;
		int v2 = 3;
		
		System.out.println(v1+v2);//+
		System.out.println(v1-v2);//-
		System.out.println(v1*v2);//*
		
		//나누기가 2개가 있다.
		//"/"몫을 구할 때,  "%"나머지를 구할 때
		System.out.println("/ : "+(v1/v2));
		System.out.println("% : "+((double)v1%v2)); //소수점 나올게 분명
		
		
		//문자열 결합 연산자(+), 딱풀연산자
		System.out.println("자바" + "jdk" + "11버전");
		
		//비교 연산자
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 == num2); //true
		System.out.println(num1 != num2); //false
		System.out.println(num1 >= num2); //true
	
		char char1 = 'A'; // A=65
		char char2 = 'B'; // B=66
		
		System.out.println(char1<char2); //true
		
		//문자열 비교는 == 아니고 문자열.equals(비교대상)
		
		//논리 연산자 => &&<->&     ||<->|
		// && => 단 하나의 조건이 F => F (F && T && F && T)
		//							 (0 * 1 * 0 *1)
		// 0 * 1 = 0   && 하나의 False 데이터 확인하면 F로값 측정 전체는 거짓  &은 일일이 계산한다.
		// || => 단 하나의 조건이 T => T (F || T || F || T)
		//							  (0 + 1 + 0 + 1)
		// || 하나의 True 데이터를 확인하면 T로 측정 전체는 진실 |는 일일이 계산한다.
		
		int charCode = 'A';
		//'A'~'Z'
		if (charCode>= 65 && charCode<=90) {
			System.out.println("대문자.");
		}
		// 48~57
		// charCode >= 48 && charCode <= 57 와 if 안에 있는 것은 동일
		// (!< = >=) (!> = <=)
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자");
		}
		
		int value2 = 6;
		// 하나만 만족하면 된다. 
		if(value2%2 == 0 || value2%3 == 0) {
			System.out.println("2 또는 3의 배수");
		}
		
		//대입 연산자 = , +=, -= .....
		int result5 = 0;
		
		result5 += 1; //result5 = result5 + 1
		result5 -= 1;
		result5 *= 3;
		result5 /= 10;
		
		//삼항 연산자
		
		int score = 85;
		
		char grade = (score>90) ? 'A' : 'B';  //세개의 항을 사용한 연산자. 앞에 주어진 조건이 참이면 물음표 뒤(A) 거짓이면 마지막(B) grade = B
		// 위와 동일
		char grade2;
		
		if(score > 90) {
			grade2 = 'A';
		}else{
			grade2 = 'B';
		}
		//중첩 삼항 연산자
		char grade1 = (score>90) ? 'A' : ((score>80) ? 'B' : 'C'); //() 먼저 계산 원리는 위와 동일/ 단지 한 번 더 비교 grade = B
		
	}	
}
