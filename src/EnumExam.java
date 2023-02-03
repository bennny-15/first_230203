
public class EnumExam {
	/* 열거형 타입 - 열거 타입으로 변수 선언하면 열거형 사용 가능(jdk 5 이상부터 사용)
	 * 열거형 전에는 public static final을 이용하여 상수를 열거형 대신 사용했음
	 */
	
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.MALE;		// 클래스 변수는 클래스명으로 바로 사용 가능
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";		// 컴파일 상에서는 문제 없음 -> 다른 값이 들어오면 오류 가능

		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy";		// 컴파일 상에서부터 오류. 특정 값만 사용하고 싶다면 열거형 사용
	}

}

enum Gender{
	// 넣고 싶은 값 열거 -> 이 값만 사용 가능
	MALE, FEMALE;
}
