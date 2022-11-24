package com.yedam.oop;

public class Application2 {
	public static void main(String[] args) {
		Calculator cl = new Calculator(); //heap 메모리 영역에 집을 하나 생성. 객체안에 있는 것을 가지고 옴
		//학교에서 '이가영'을 찾으면 여러명 있음. 4반의 이가영을 찾기위해 지정해주는거임.
		// 전부 return이 존재
		//sum이라는 메소드를 실행하기 위해 Calculator에 int sum~에 값을 입력하고 데이터 를 반환해서 다시 돌아온다.
		// 대입 연산자를 통해 sumResult 는 3이 된다.
		int sumResult = cl.sum(1, 2);
		
		double subResult = cl.sub(10, 20);
		
		System.out.println(sumResult);//int
		System.out.println(subResult);//double
		/*String temp = cl.result("메소드 연습");
		System.out.println(temp); 결과적으로 둘이 합지면 아래와 같기 때문에 한줄료 표현해줌.*/
		//return 값이 있음
		//System.out.println(cl.result("메소드 연습")); //return 문을 활용해서 한것
		//return을 안쓰고 해보기
		cl.result("메소드 연습");
		
		
		
		//여러가지의 sum이 있는데 그중에 원하는 매개변수를 어떻게 가지고 올것인가.
		//cl. 을 하면 내가 만들어둔 메소드들이 보여진다.
		//개중에 내가 원하는 것을 선택하면 된다.
		
		
		
		Computer myCom = new Computer();
		int result = myCom.sum(1,2,3);
		System.out.println(result);
		result = myCom.sum(1,2,3,4,5,6);
		System.out.println(result);
		
		
		
		
	}
}
