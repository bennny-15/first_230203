
public class TypeCastingExam {

	public static void main(String[] args) {
		// 타입 변환 예제 (int < long < float < double : byte는 작아도 long보다 float이 소수점 때문에 더 크게 인식함)
		
		int x = 50000;
		long y = x;		// 묵시적 형변환 (자동으로 변환되는 것)(암묵적 형변환)
		
		System.out.println(y);
		
		long x2 = 5; 
//		int y2 = x2;	5는 int에 들어갈 수 있는 수지만 컴파일러는 인식하지 못함. 그래서 프로그래머가 직접 앞에 형변환 해줌
		int y2 = (int) x2;		// 강제 형변환(명시적 형변환)
		
		System.out.println(y2);
	}

}
