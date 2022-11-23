package com.yedam.loop;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=5 && i<=10) {
			sum = sum + i;
			//System.out.println(i);
			i++;
		}
		i = 0;
		while(i<=100) {
			if (i%2 == 0) {
				//System.out.println(i);
			}
			i++;
		}
		
		boolean flag = true;
		while(flag) {
			if(i == 50) { //무한 루프
				//break; // i가 50이 되는 순간 break.
				flag = false; // break 대신 쓸 수 있는 방법.
			}
			i++;
		}
		//System.out.println("end of prog");
		
		//계산기 프로그램 만들기
		boolean flag1 = true;
		Scanner sc = new Scanner(System.in);
//		while(flag1) {
//			System.out.println("1. 더하기 | 2. 빼기 | 3. 곱하기 | 4. 종료");
//			System.out.println("입력>");
//			//입력한 데이터를 받는 변수를 만들어줌.
//			int no = Integer.parseInt(sc.nextLine());
//			
//			switch (no) {
//			case 1:
//				System.out.println("더하고 싶은 두 수를 입력하세요.");
//				System.out.println("1>");
//				int num = Integer.parseInt(sc.nextLine());
//				System.out.println("2>");
//				int num2 = Integer.parseInt(sc.nextLine());
//				System.out.println(num + " + " + num2 +"의 결과 : " + (num+num2));
//				break;
//			case 2:
//				System.out.println("빼고 싶은 두 수를 입력하세요.");
//				System.out.println("1>");
//				int num3 = Integer.parseInt(sc.nextLine());
//				System.out.println("2>");
//				int num4 = Integer.parseInt(sc.nextLine());
//				System.out.println(num3 + " - " + num4 +"의 결과 : " + (num3-num4));
//				break;
//			case 3:
//				System.out.println("곱하고 싶은 두 수를 입력하세요.");
//				System.out.println("1>");
//				int num5 = Integer.parseInt(sc.nextLine());
//				System.out.println("2>");
//				int num6 = Integer.parseInt(sc.nextLine());
//				System.out.println(num5 + " X " + num6 +"의 결과 : " + (num5*num6));
//				break;
//			case 4:
//				System.out.println("프로그램을 종료합니다.");
//				flag1 = false;
//				break;
//			default:
//				System.out.println("번호를 잘못 입력하셨습니다.");
//				break;
//			}
//		}
		
		//게임 만들기
		flag = true;
		int money;
		System.out.print("====insert Coin====");
		 money = Integer.parseInt(sc.nextLine());
		 //한판에 오백원
		 System.out.println((money/500) + "번의 기회가 있습니다.");
		while((money/500) > 0) {
			 System.out.println("1. 가위 바위 보 | 2. 앞 뒤 맞추기 | 3. 종료");
			 System.out.println("입력>");
			 int gameNo = Integer.parseInt(sc.nextLine());
			
			 //게임1) 가위(1), 바위(2), 보(3)
			 if(gameNo == 1) {
				 System.out.println("가위, 바위, 보 중에서 하나를 입력하세요.");
				 //사용자
				 String RSP = sc.nextLine();
				 //컴퓨터
				 int randomNo = (int)(Math.random() * 3) +1; // 1~3사이의 정수를
				 
				 if(RSP.equals("가위")) {
					 if(randomNo == 1){
						 System.out.println("비겼다.");
					 }else if (randomNo == 2){
						 System.out.println("졌다.");
					 }else {
						 System.out.println("이겼다.");
					 }
				 } else if(RSP.equals("바위")) {
					if(randomNo == 1){
						System.out.println("이겼다.");
					}else if (randomNo == 2){
						System.out.println("비겼다.");
					}else {
						System.out.println("졌다.");
					}
				 }if(RSP.equals("보")) {
					if(randomNo == 1){
						System.out.println("졌다.");
					}else if (randomNo == 2){
						System.out.println("이겼다.");
					}else {
						System.out.println("비겼다.");
					}
				 }
				 money = money -500;
			 }//게임2) 앞뒤 맞추기 (1)앞 (2)뒤
			 else if(gameNo == 2) {
				 System.out.println("앞 , 뒤를 중에서 하나를 입력하세요");
				 String FB = sc.nextLine();
				 int randomN = (int)(Math.random()*2)+1;
				 
				 if (FB.equals("앞")) {
					 if(randomN == 1) {
						 System.out.println("정답");
					 }else {
						 System.out.println("땡");
					 }
				 }else if (FB.equals("뒤")) {
					 if(randomN == 1) {
						 System.out.println("땡");
					 }else {
						 System.out.println("정답");
					 } 
					 money = money -500;
				 }
				 }//종료
		 		else if(gameNo == 3){
		 			System.out.println("종료합니다.");
		 			break;
		}
	 }
	}
}
