
public class ConstantExam {

	public static void main(String[] args) {
		// 상수 예제
		
		int i = 10;
		i = 20;		// 변화 가능
		
		final int J;	// 변화 불가능, 상수는 대문자로 선언 
		J = 10;
		
		double circleArea;
		final double PI = 3.14159;
		circleArea = 3 * 3 * PI;
		System.out.println(circleArea);
		
		final int OIL_PRICE = 1450;		// 상수는 단어 사이에 언더바로 구분, 상수만 변화시키면 밑의 값도 변화 가능
		int totalPrice = 50 * OIL_PRICE;
		
		System.out.println(totalPrice);
		
	}

}

