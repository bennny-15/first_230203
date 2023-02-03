
public class MyCalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new MyCal();
		
		cal.plus(3, 4);
		cal.multiple(2, 5);
		
		// default method
		cal.exec(4, 7);	// 사용 가능
		int i = cal.exec(7, 2);		// 정수값을 받아서 i에 대입
		System.out.println(i);
		
		// static method - 인터페이스명.메소드명 형식으로만 사용 가능
//		cal.exec2(3, 4);		// 사용 불가능
		int y = Calculator.exec2(3, 5);
		System.out.println(y);
	}

}
