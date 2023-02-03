
public class OverRidingChild extends OverRiding {
	public void run() {
		super.run();		// 부모클래스의 메소드도 호출
		// 부모 클래스에서 오버라이딩 해왔어도 수정 가능
		System.out.println("오버라이딩 자식 클래스에서 수정한 메소드");
	}
	
	public void ppangppang() {
		System.out.println("빵빵");
	}
}
