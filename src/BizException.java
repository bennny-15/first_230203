/* 사용자 정의 exception : Exception이나 Exception의 후손을 상속받아 만들어진 클래스
 * < public class 클래스이름 extends Exception > 
 * --> 클래스 이름만으로 어떤 오류가 발생했는지 알려주어 코드의 직관성을 높이는 용도
 * 상속받은 Exception = Checked Exception / Runtime Exception(Unchecked Exception)
 * checked - 반드시 예외 처리 필요, runtime - 오류 처리 안해도 오류는 안나지만 하는 게 좋다. 
 * */

// runtime exception 상속받음 / exception 객체에서는 생성자만 지정해주면 됨
public class BizException extends RuntimeException {
	// 생성자 생성
	public BizException(String msg) {	// 문자열로 된 오류메시지
		super(msg);	// 부모의 생성자에게 전달
	}
	public BizException(Exception ex) {	// 실제 발생할 exception 담는 생성자
		super(ex);
	}
}
