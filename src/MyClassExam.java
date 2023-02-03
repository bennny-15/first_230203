
public class MyClassExam {

	public static void main(String[] args) {
		// MyClass가 가진 클래스와 메소드들 사용
		MyClass myclass = new MyClass();		// MyClass 객체인 myclass 생성
		myclass.method1();		// 메소드 실행 
		myclass.method2(10);
		int value = myclass.method3();		// 리턴값이 존재하면 값을 받아낼 변수 필요
		System.out.println("m3이 출력한 값 " + value);
		myclass.method4(5, 10);
		int value2 = myclass.method5(60);
		System.out.println("m5가 리턴한 값 " + value2);
	}
	
	// 자바는 이미 만들어진 객체가 많이 존재한다 (String 등)
	
	/*
	 * 기본형 타입은 다른 메소드에 매개변수로 전달될 때 값 자체를 그대로 전달함. 
	   따라서 전달하더라도 변수에 있던 값은 변하지 않음.
	 * 참조형 타입은 다른 메소드에 매개변수로 전달될 때 변수의 주소가 전달됨.
	   따라서 전달받은 메소드가 주소 안에 있는 값을 사용하므로 변수 안에 있는 값이 변하게 됨.
	 */

}
