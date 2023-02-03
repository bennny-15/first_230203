
public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();		// 부모클래스에서 상속받았기 떄문에 Bus 클래스에 없어도 사용 가능
		bus.ppangppang();		// 확장
		
		Car car = new Car();
		car.run();
//	 	car.ppangppang();  -> 자식 클래스는 사용 불가능
	}

}
