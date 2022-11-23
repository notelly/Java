package com.yedam.loop;

public class Exam04 {
	public static void main(String[] args) {
		while(true){
			int num = (int)(Math.random()*6)+1;
			System.out.print(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println(" end of prog");
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				if(i+j == 4) {
					System.out.println("i + j = " + (i+j));
					break;
					//System.out.println("안나갔다."); 실행할 수 없음 break를 받고 탈출해서 실행 될 수 가 없다.
				}
			}
		}
		
		Outter : for(char upper ='A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("end of prog");
		
		for(int i = 0; i<=10; i++){
			if(i%2 ==0) { //짝수이면 continue
				continue;
			}
			System.out.println(i); //홀수이면 i 출력
		}
		
		
	}
}
