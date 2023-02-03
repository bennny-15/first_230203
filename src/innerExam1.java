/* 내부 클래스 : 클래스 안에 선언된 클래스 
1. 중첩 클래스(인스턴스 클래스) : 클래스 안에 인스턴스 부분(필드가 선언된 부분)에 선언되는 클래스
   instance class
*/

public class innerExam1 {
	// 필드를 선언할 위치에 클래스 생성 - 내부 클래스
	class Cal {
		int value = 0;	// 필드
		public void plus() {	// 메소드
			value++;
		}
	}
	
	public static void main(String[] args) {
		// 내부 클래스를 사용하려면 외부 클래스 객체를 먼저 선언해야 함
		innerExam1 c = new innerExam1();
		// 내부 클래스 객체 선언 : "외부클래스.내부클래스 객체 = 외부객체.new 내부클래스();"
		innerExam1.Cal cal = c.new Cal();
		
		// 선언한 이후에 내부 클래스 필드와 메소드 사용 가능
		cal.plus();
		System.out.println(cal.value);

	}

}
