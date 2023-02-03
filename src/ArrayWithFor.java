
public class ArrayWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		
		System.out.println(iarray.length); // 배열의 크기를 알 수 있음
		
		
		// 반복문을 이용하여 선언
		for(int i = 0; i< iarray.length; i++) {
			iarray[i] = i + 1;
		}
		
		// 변수의 스코프 = 변수의 선언된 블럭
		int sum = 0;
		for(int i = 0; i < iarray.length; i++) {
			sum = sum + iarray[i];
		}
		
		System.out.println(sum);
	}

}
