
public class forEachExam {

	public static void main(String[] args) {
		// java 1.5 버전부터 추가된 구문 - 자바에서는 for로 사용
		int[] iarr = {10,20,30,40, 50};
		
		for(int i=0; i<iarr.length; i++) {
			int value = iarr[i];
			System.out.println(value);
		}
		System.out.println();
		
		// for each 문 - 값을 꺼내서 알아서 담아줌, 배열의 크기를 몰라도 됨
		for(int value:iarr) {
			System.out.println(value);
		}
	}

}
