
public class SwitchExam {

	public static void main(String[] args) {
		// switch, case, default, break 
		
		int value = 1;
		
		switch(value) {		// 스위치문은 해당하는 줄부터 차례로 모두 출력함(break 만나기 전까지)
			case 1:
				System.out.println("1");
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
			default :
				System.out.println("그 외 다른 숫자");
		}

		// jdk 7 이상부터는 value부분에 정수, 문자열 형도 들어갈 수 있다.(이전에는 정수만 가능)
		String str = "A";
		
		switch(str) {
			case "A" :
				System.out.println("B");
				break;
			case "B" :
				System.out.println("A");
		}
	}

}

