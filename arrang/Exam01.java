package com.yedam.arrang;

import java.util.Calendar;

public class Exam01 {
	public static void main(String[] args) {
		Week today = null;
		//Week라는 변수를 쓰는데 그걸 today라고 하겠다.
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//오늘 요일을 알려줌 숫자로 알려준다. sunday가 1 =>  2,3,4....
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘은 " + today +" 입니다.");
	}
}
