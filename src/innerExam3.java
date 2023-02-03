/* 내부 클래스
 * 3. 지역 중첩 클래스(지역 클래스) : 내부 클래스가 메소드 안에서 선언되는 경우
 * local class
 */
public class innerExam3 {
	// 메소드 생성
	public void exec() {
		class Cal {
			int value = 0;	// 필드
			public void plus() {	// 메소드
				value++;
			}
		}
		// 메소드 안에서만 객체 생성, 사용 가능
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}

	public static void main(String[] args) {
		innerExam3 t = new innerExam3();
		// 외부클래스가 가진 해당 메소드를 호출하면 내부적으로 Cal이라는 클래스가 생성되고 수행됨
		t.exec();

		// 메소드 안에서도 클래스를 지역 변수처럼 사용할 수 있다
	}

}
