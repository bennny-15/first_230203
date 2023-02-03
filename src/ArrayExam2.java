
public class ArrayExam2 {

	public static void main(String[] args) {
		// 2차원 배열 - 배열의 배열
		
		int[][] array = new int[3][4];
		// array[0] = int형 배열을 가리킬 수 있는 참조변수이므로 값을 담을 수 없음
		array[0][1] = 10;
		
		// 값을 담을 수 있는 1차원 배열은 안 만들어진 상태
		int[][] array2 = new int[3][];
		// 배열에 값을 넣어주려면 1차원 배열을 만들어줘야 함 - 각각 길이가 다른 배열을 만들수도 있음
		array2[0] = new int[1];
		array2[1] = new int[2];
		array2[2] = new int[3];
		
		array2[0][0] = 10;
		
		// 선언과 동시에 초기화
		int[][] array3 = {{1}, {1,2}, {1,2,3}};
		
		System.out.println(array3[0][0]);
		System.out.println(array3[2][2]);
	}
}
