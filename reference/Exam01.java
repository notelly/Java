package com.yedam.reference;

public class Exam01 {
	public static void main(String[] args) {
		int intVal = 10;
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3; //변수선언 주소가 없다. => 이런애들의 데이터 null
		int a;
		System.out.println(intVal);
		System.out.println(array);
		System.out.println(array2);
		System.out.println(array == array2);
		//System.out.println(array3);
		//System.out.println(a);
		
		//memory leak => 메모리 누수, 메모리 부족;
		
	}
}
