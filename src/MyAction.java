// Action 클래스를 상속받은 클래스

public class MyAction extends Action {

	@Override
	public void exec() {
		// 생성된 메소드 정의해줌 - 메소드 사용하기 위해서는 또 수행할 클래스 생성해야 함
		System.out.println("exec");
	}

}
