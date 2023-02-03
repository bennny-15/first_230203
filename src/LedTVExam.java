// 인터페이스 - 상속의 개념과 비슷하다

public class LedTVExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV tv = new LedTV();		
		// 인터페이스도 타입이 될 수는 있지만 객체는 클래스로만 가능
		
		/* 같은 인터페이스를 가진 클래스인 LcdTV 클래스를 사용하려면 
		 * 위의 객체생성할 때 LedTV() 부분을 LcdTV(); 로 바꿔주면
		 * 밑의 메소드를 수정하지 않고도 LcdTV의 메소드를 사용할 수 있다.
		 *  */
		
		
		// 인터페이스가 가진 메소드만 사용 가능
		tv.turnOn();
		tv.changeChannel(5);
		tv.changeVolume(7);
		tv.turnOff();  
		
		// LedTV에서 확장한 메소드를 사용하고 싶다면 클래스형변환을 이용해서 사용 가능
	}

}
