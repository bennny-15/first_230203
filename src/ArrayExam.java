
public class ArrayExam {

	public static void main(String[] args) {
		// 1차원 배열 
		int[] array1 = new int[100];	// 배열 선언법(처음 선언한 크기로 생성됨)
		
		// index : 0~99 초기화
		array1[0] = 50;
		array1[10] = 100;
		
		
		// 선언과 동시에 초기화
		int[] array2 = new int[] {1,2,3,4};
		int[] array3 = {1,2,3,4};
		
		
		System.out.println(array3[3]); 
		
		// 배열에 있는 값 꺼내서 변수에 담기
		int value = array3[2];
		System.out.println(value);
		
		
		// 배열 = 기본 타입이 아니라 참조형 타입이다.
	}

}
