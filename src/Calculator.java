// 인터페이스의 default method 예제 - java8 이후

public interface Calculator {
	public int plus(int x, int y);
	public int multiple(int x, int y);
	
	
	// default 키워드를 사용하면 인터페이스 안에서 직접 구현이 가능하다
	// 나중에 인터페이스를 수정하게 되면 사용한 모든 클래스를 수정해야 하기 떄문에 디폴트 메소드를 만듬
	default int exec(int x, int y) {
		return x + y;
	}
	
	
	// static 메소드 - 인터페이스명.메소드 형식으로만 호출 가능
	public static int exec2(int x, int y) {
		return x * y;
	}
}
