// 오버라이딩 = 올라타다 

public class OverRidingExam {

	public static void main(String[] args) {
		OverRidingChild over = new OverRidingChild();
		over.run();
		System.out.println();
		
		
		
		// 클래스 형변환
		OverRiding over2 = new OverRidingChild();	
		// 부모 클래스로 자식 클래스를 가리킬 수 있음 but 부모가 가진 메소드만 사용 가능(자식이 따로 가진 메소드는 사용 불가)
		over2.run();	// 부모가 가진 메소드
//		over2.ppangppang();		// 자식만 가진 메소드 --> 사용 불가
		System.out.println();
		
		
		// 객체는 항상 부모가 자식보다 더 큰 그릇이다. OverRiding 타입으로 OverRidingChild 가리킬 수 있음
	
		// 형변환 -> 부모 클래스로 정의한 over2를 자식 클래스로 강제 형변환
		OverRidingChild overchild = (OverRidingChild) over2;
		overchild.run();
		overchild.ppangppang();	// 자식 클래스에만 있는 메소드 사용 가능
	}

}
