/* 	예외 처리 (try-catch(예외클래스 변수명)-finally)
 *  try 블럭 - 수행할 코드, 예외 발생 가능성이 있는 블록
 *  catch 블럭 - 예외가 발생하면 예외 처리할 블럭 (실행되지 않을 수도 있음) 
 *  --> 여러개 사용 가능 or 예외클래스 자리에 Exception이라고 쓰면 모든 예외 처리 한 블럭에서 가능
 *  finally - 생략 가능, 예외 발생 여부와 상관없이 반드시 실행
 */

public class ExceptionExam {

	public static void main(String[] args) {
		// 
		int i = 10;
		int j = 0;	// 예외가 발생할 가능성이 있는 부분
		try {
			int k = i/j;
			System.out.println(k);		// Exception 발생 - 프로그램 종료
		}catch(ArithmeticException e) {
			// 예외클래스변수명.toStirng() : 예외의 정보를 알려주는 메소드
			System.out.println("0으로 나눌 수 없습니다. "+e.toString());
		}finally {
			System.out.println("오류 발생 여부와 상관없이 무조건 실행");
		}
		System.out.println("다음 블럭도 실행된다.");

	}

}
