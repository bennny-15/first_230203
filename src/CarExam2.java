
/* 생성자 선언
		 * Public class 클래스명 {
		 * 		타입 필드명;
		 * 
		 * 		public 클래스명(매개변수 목록) {		
		 * 		...		--> 생성자 블록 = 메소드와 달리 리턴타입을 갖지 않음
		 * 		}
		 * 		
		 * 		public 리턴타입 메소드명(매개변수 목록) {
		 * 		...
		 * 		}
		 * }
		 * */

// 기본 생성자 = 매개변수가 없는 생성자 -> 프로그래머가 생성자를 만들지 않으면 생김. 만들지 않으면 생기지 않음
// 생성자가 하는 일 - 객체가 될 때 필드를 초기화

public class CarExam2 {

	public static void main(String[] args) {
		
//		Car c1 = new Car();	// Car() = 생성자 --> 사용자가 클래스에 생성자를 하나라도 추가하면 오류남
		Car c2 = new Car("소방차");		// Car 자바 파일에 있는 생성자로 인해 name 객체인 c2에 소방차가 대입됨
		Car c3 = new Car("구급차");
		
		System.out.println(c2.name);
		System.out.println(c3.name);
		
	}

}
