
public class Truck extends Car {

	public Truck() {	// 기본 생성자
		//super(); 		// 부모의 생성자를 호출하는 키워드 
				// -> 자식 생성자를 호출하면 자동으로 호출되기 떄문에 안써도 호출은 가능함
		
		//super("소방차");
		/* 부모인 Car클래스에 기본 생성자가 없으므로 super없이 자식 클래스 Truck만 호출하면
		오류가 남. -> super 키워드로 부모의 생성자 호출해줘야 오류가 나지 않음
		*/
		
		System.out.println("Truck의 기본 생성자입니다.");
		// 나를 가리키는 키워드 = this, 부모를 가리키는 키워드 = super
	}
}
