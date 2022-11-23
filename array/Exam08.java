package com.yedam.array;

public class Exam08 {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		//String str = "yedam";
		//strArray[0]= str;
		//삼단논법 strArray[0]== str == "yedam";		
		strArray[0] = "yedam";
		strArray[1]= "yedam";
		strArray[2]= new String("yedam");
		
		System.out.println(strArray[0] == strArray[1]);
		//주소를 비교 같은 주소를 사용하므로 True
		System.out.println(strArray[0] == strArray[2]);
		//new를 이용해 새로운 집을 지어서 Array[2]의 주소가 혼자 다르다. False
		System.out.println(strArray[0].equals(strArray[2]));
		//data를 비교. 그러므로 True
		
		
		int[] oldArray = {1,2,3};
		
		int[] newArray = new int[5];
		//for 반복문을 이용한 복사
		for(int i = 0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		
		for(int i= 0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
		int[] oldArray2 = {1,2,3,4,4,5,6,7};
		
		int[] newArray2 = new int[10]; //복사당하는 대상이 복사하는 대상보다 크기가 작으면 오류. 자르지 않는다.
		//ArrayIndexOutOfBoundsException >> 오류가 나면 이런문구 뜰꺼임. 보면 배열쪽에 문제 생겼다고 생각하면 된다. 반복문 잘못 썼을때도 볼 수 있음.
		
		System.arraycopy(oldArray2, 0, newArray2, 0, oldArray2.length);
		
		for(int i= 0; i<newArray2.length; i++) {
			System.out.println(newArray2[i]);
		}
		
		for(int temp : newArray2) {
			System.out.print(temp+"\t");
		}
		
	}
}
