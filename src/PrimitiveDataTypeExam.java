
public class PrimitiveDataTypeExam {

	public static void main(String[] args) {
		// 리터럴 변수 - 안에 들어가는 값을 리터럴이라고 함.(true, f, 59 등)
		
		// 논리형 1byte true or false
		boolean isFun = true;
		System.out.println(isFun);
		
		// 문자형 2byte 문자하나만 작은따옴표 안에 대입 가능
		char c = 'f';

		// 정수형 4byte 정수
		int n = 59;
		
		// int보다 긴 정수형 8byte int보다 큰 정수, 뒤에 L or l을 붙여서 long을 명시
		long bing = 34432433L;
		
		// 실수형 4byte 실수 뒤에 F or f를 붙여줘야 함
		float f = 32.66F; 
		
		// float보다 큰 실수형 8byte 뒤에 f 안붙여줘도 됨 
		double d = 3424325.2;
		
	}

}
