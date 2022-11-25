package com.yedam.oop;

// 추가됨.
import java.util.Scanner;
//com.yedam.access 에 있는 Access를 사용하고 싶을 때
import com.yedam.access.Access;

public class Application3 {
	
	Access ac = new Access();
	Scanner sc = new Scanner(System.in); //붉은줄 클릭하는 거랑 동일한 것. : ctrl + shift + o 어떤 기능을 할지 선택할 수 있다.
	static int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	//메소드 영역에 등록된 친구들.	
	public static void main(String[] args) {
		//여기서 speed는 사용불가
		int speed2 = speed;//change 'speed' to static
		//run(); //사용불가 막고 있다.
		
		//굳이 쓰고 싶다면
		//Application3을 객체로 만들어주면 된다.
		
		Application3 app = new Application3(); //객체로 만들어준다.
		app.speed = 5;
		app.run();
		
		
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		//myCar.run(); //Car class에 있는 run을 실행하는게 아니라 복사 붙여넣기 해서 Car myCar/yourCar에 넣어주는 것.
		//내용을 가지고 실행하는 거라고 생각. 설계도 위에 바로 쓰는 것이 아니라 설계도 복사본, "포르쉐"의 설계도/ "벤츠"의 설계도에 작성하는 것.
		//yourCar.run();
		
		//정적 필드, 메소드를 부르는 방법
		//정적 멤버가 속해있는 클래스 명. 필드 또는 메소드 명
		//객체화 하지 않고 접근이 가능하다.
		//1) 정적 필드 가지고 오는 법
		double piRatio = Calculator.pi;//Calculator 필드 가지고 오기
		System.out.println(piRatio);
		//1) 정적 메소드 가지고 오는 법
		int result = Calculator.plus(5, 6); //Calculator 메소드 가지고 오기
		System.out.println(result);
		
		//특징
		// 1) ☆☆☆☆☆☆모든 클래스에서 가져와 사용할 수 있다. -> 공유의 개념.
		// 2) ☆☆☆☆☆☆너무 남용해서 사용하게 되면 메모리 누수(부족) 현상이 발생 할 수 있다.
		// 3) ☆주의 할 점☆
		// 메소드 영역에 저장이 됩니다. 
		// 그렇기 때문에 static -> 아무대서나 사용이 가능
		// But 그렇지 않은 경우 몸담고 있는 class를 객체로 만들어서 사용할 수 있다.
		// -정적 메소드에서 외부에서 정의한 필드를 사용하려고 한다면,
		// static이 붙은 필드 또는 메소드만 사용 가능하다.
		// static 붙이지 않고 사용하고 싶다면,
		// 해당 필드와 메소드가 속해 있는 클래스를 인스턴스화 하여서
		// 인스턴스 필드와 인스턴스 메소드를 dot(.)연산자를 통해 가지고 와서 사용해야한다.
		// ex) 위에 app.run();
		
		Person p1 = new Person("123123-123456", "김또치");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA"; //한번 정의된 final은 변경될 수 없다.
		
		
		System.out.println(ConstantNo.EARTH_ROUND);
		//원넓이
		System.out.println(5*5*ConstantNo.PI);
		
		
		
		
		
		
		
		
		
	}
}
