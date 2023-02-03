// Throws - Exception 무시하는 키워드

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;		// 예외 발생
		try {
		int k = divide(i, j);		// 호출한 부분에서 예외 처리
		System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다. "+e.toString());
		}
	}
	
	// 예외 처리를 내가 하지 않고 나를 호출한 쪽에서 하세요라고 하는 키워드 = throws(여러개도 가능, Exception은 모두 가능)
	public static int divide(int i, int j) throws ArithmeticException, ClassCastException {
		int k = i/j;
		return k;
	}

}
