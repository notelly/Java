package com.yedam.array;

public class Exam01 {
	public static void main(String[] args) {
		int [] intArry = {1,2,3,4,5,6}; //선언함과 동시에
		//int[] intArry = new int[6];
		//intArry[0] = 1
		//intArry[1] = 2 ... 인덱스에 데이터를 넣어주는 방법 // 굳이 일일이 할필요 없으니 한번에 넣기
		
		String[] strArry =  new String[10];
		
		int[] intArry2;
		intArry2 = new int[5]; //나중에 메모리를 할당하겠다는 의미.
		
		int[] scores = {83, 90, 87};
		
		System.out.println("scores 첫번째 값 : " + scores[0]);
		System.out.println("scores 세번째 값 : " + scores[2]);
		
		//반복문과 배열
		int sum = 0;
		for(int i = 0; i<3; i++) {
			System.out.println(scores[i]);
			sum = sum + scores[i];
		}
		System.out.println("총 합계 : " + sum);
		
		//new 연산자를 활용해서 배열 만들기
		
		int[] point;
		point = new int[]  {83, 90, 87};
		
		sum = 0;
		for(int i = 0; i<3; i++) {
			System.out.print(point[i]);
			sum = sum + point[i];
		}
		System.out.println("총 합계 : " + sum);
		
		
		//2)
		int[] arr1 = new int[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		//0.0(실수형)
		double[] arr2 = new double[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr2["+i+"] : " + arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i<3; i++) {
			System.out.println("arr2["+i+"] : " + arr2[i]);
		}
		
		//문자열
		String[] arr3 = new String[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
		
		arr3[0] = "3월";
		arr3[1] = "11월";
		arr3[2] = "12월";
		for(int i = 0; i<3; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
	}
}
