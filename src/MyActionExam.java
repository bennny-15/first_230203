
public class MyActionExam {

	public static void main(String[] args) {
		/* 원래 사용하는 방법 - 추상클래스 Action으로는 객체를 생성할 수 없어서 
		   자식 클래스인 MyAction을 객체를 생성 후 그 객체로 메소드 실행 */
//		Action action = new MyAction();
//		action.exec();
		
		
		/* 익명 클래스 - 추상클래스를 상속받을 자식 클래스 만들 필요 없이
		   MyActionExam에서 Action을 상속받은 익명 클래스를 만들어서 사용 */
//		Action action = new Action() {	// 이름 없는 객체
//			// 한번만 쓰고 말 메소드니까 자식클래스를 생성하지 말고 익명 클래스로 사용
//			@Override
//			public void exec() {
//				System.out.println("exec2");
//			}
//			action.exec();
//		};
	}

}
