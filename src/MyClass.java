
// 메소드 = 클래스가 갖고 있는 기능 --> 클래스 내부에 선언

public class MyClass {
	// public 리턴타입(결과값타입) 메소드명(매개변수 들) {  필요한 기능 구현   }
	// 형태에 따라 다양한 메소드 존재
	
	// 리턴타입이 없으면 void, 매개변수 없으면 빈칸으로
	public void method1() {
		System.out.println("m1이 실행됨...");
	}
	
	// 정수를 받아들이고 리턴타입이 없음
	public void method2(int x) {
		System.out.println(x + " 를 이용한 m2 실행");
	}
	
	// 받은 값은 없지만 리턴 값은 정수로 존재
	public int method3() {
		System.out.println("m3 실행");
		return 10;		// 값을 돌려줘야 함
	}
	
	// 정수 값을 2개 받아들이고 리턴 값은 없음 - 매개변수는 참조형 데이터 타입도 사용가능
	public void method4(int x, int y) {
		System.out.println(x + y + " method4 실행");
	}
	
	// 정수 y값을 받아들이고 정수 값을 리턴
	public int method5(int y) {
		System.out.println(y + " 이용한 m5 실행");
		return y*2;
	}
}

