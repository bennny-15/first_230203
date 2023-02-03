
public class Car {
	// field(필드) == 속성
	// 타입 필드명
	String name; // 필드 선언
	int number;
	
	
	/* 생성자 예제 - CarExam2, this 예제 */
	public Car(String name) {		// 이름을 받을 수 있는 생성자 생성
		this.name = name;	// Car라는 객체가 생성되면서 name이 초기화됨.
		
		// 변수명이 같을 때 사용하면 가까운 변수를 사용함. 그래서 구분해주려면 this 키워드를 사용하여 구분해줌
		// this = 객체 자신을 참조하는 키워드
	}
	
	
	
	/* 기본 생성자도 생성(오버로딩) 가능 */
	public Car() {
		// 기본 생성자는 안에 아무 내용을 넣지 않아도 되지만 넣으면 기본으로 초기화가 가능하다
//		this.name = "이름없음";
//		this.number = 0;
//		this("이름없음", 0);	// 이렇게도 초기화 가능 - this()는 자신의 생성자를 호출하는 것.(코드 중복 방지)
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	
	
	/* 상속 예제 */
	public void run() {
		System.out.println("달리다.");
	}
	
	
	/* super 예제 */
//	public Car() {
//		System.out.println("Car의 기본 생성자입니다.");
//	}
	
//	
//	public Car(String name) {
//		System.out.println("Car의 name 생성자입니다.");
//	}
	
}
