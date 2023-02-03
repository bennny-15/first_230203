
/* 메소드 오버로딩 
 * 매개변수의 수, 타입이 다른 경우 동일한 이름으로 메소드를 여러개 정의할 수 있다
 */ 

public class MethodOverloadExam {

	public static void main(String[] args) {

		MyClass2 m = new MyClass2();
		
		System.out.println(m.plus(4, 5));
		System.out.println(m.plus(4,  6, 7));
		System.out.println(m.plus("Hello", " World"));
	}
}
