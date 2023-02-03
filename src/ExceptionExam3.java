// 강제로 Exception 발생시키기 - throw (보통 throws와 같이 사용됨)

public class ExceptionExam3 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;		
		try {
		int k = divide(i, j);		// 호출한 부분에서 예외 처리
		System.out.println(k);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}
		
	
	// throws와 throw 같이 사용
	public static int divide(int i, int j) throws IllegalArgumentException {
		if(j == 0) {
//			System.out.println("2번째 매개변수는 0이면 안됩니다.");
//			return 0;
			// 직접 exception 발생 - 만들어진 exception 객체 사용
			throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
		}
		
		int k = i/j;
		return k;
	}


}
