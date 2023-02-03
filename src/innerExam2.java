/* 내부 클래스 
 * 2. 정적 중첩 클래스(스태틱 클래스) : 필드가 정적(static)으로 선언되는 클래스
 * static class
 */
public class innerExam2 {
	// static한 클래스 생성 - Cal은 정적인 필드
	static class Cal {
		int value = 0;	// 필드
		public void plus() {	// 메소드
			value++;
		}
	}

	public static void main(String[] args) {
		// 정적인 클래스이기 때문에 외부 클래스 객체를 생성할 필요 없음
		innerExam2.Cal cal = new innerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);

	}

}
