// 추상 클래스 - 부모 클래스 역할로 사용 가능

public abstract class Bird {
	public abstract void sing();
	 // 구현하지 않음 -> 추상클래스인 abstract 키워드 써줌
	// 메소드가 하나라도 추상 메소드가 된다면 클래스는 추상 클래스가 되어야 함 -> 추상 클래스 키워드 붙여줘야 함

	// 추상 클래스 안에는 일반 메소드도 구현 가능하다
	public void fly() {
		System.out.println("날아.");
	}
}
