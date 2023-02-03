
public class ForExam {

	/**
	 * for문 예시, continue break 사용법(어떤 구문에서든 사용가능 - while, do while 등)
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0;
		int total2 = 0;
		int total3 = 0;
		
		for(int i = 1; i <= 100; i++) {
			total += i;
		}
		
		// 짝수만 출력 - 내가 한 것
//		for(int j = 1; j <= 100; j++) {
//			if(j%2 == 0) {
//				total2 += j;
//			}
//		}

		for(int j = 1; j <= 100; j++) {
			if(j%2 != 0) {
				continue;	// continue를 만나면 아래쪽은 실행시키지 않고 다시 반복문으로 넘어가는 것
			}
			total2 += j;
		}
		
		// 50까지만 실행하고 멈춤
		for(int k=0; k<=100; k++) {
			total3 += k;
			if(k == 50) {
				break;	// break 만나면 바로 반복문 빠져나옴
			}
			
		}
		
		
		System.out.println("1부터 100까지의 합은 " + total);
		System.out.println("1부터 100까지의 짝수의 합은 " + total2);
		System.out.println("1부터 50까지의 합은 " + total3);
	
	}

}
