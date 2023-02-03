
import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// 반복문 - while 조건을 만족할 떄까지 반복하여 수행(무한루프 주의)
		
		// 0~9 출력
		int i = 0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		// 1~100 합 출력
		
		int j = 0;		/* 1부터 합 구하려고 했으니까 i를 1로 하고 조건을 i <=100으로 하는게 가독성 면에서는 더 좋을 듯 
						 	-> i++를 두번째 줄로 이동 */
		int total = 0;
		
		while(j < 100) {
			j++;
			total += j;
		}
		System.out.println(total);
	}
		
	
		// 무한 루프 - 실제 프로그램에서는 if문 등을 이용해서 빠져나오는 길 만들어주어야 함
//		while(true) {
//			System.out.println("hello");
//		}
		
		
		
		/* do while - 무조건 한번은 실행 */ 
		
//		int value =0;
//		Scanner scan = new Scanner(System.in);
//		
//		do {
//			// 반복할 문장들
//			System.out.println("숫자를 입력하세요.");
//			value = scan.nextInt();
//			System.out.println("입력받은 값 : "+value);
//			
//		} while(value != 10); 
//			System.out.println("반복문 종료");
//			
//			scan.close();
//	}
	}
