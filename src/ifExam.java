
public class ifExam {

	public static void main(String[] args) {
		// 조건문 if
		int x = 50;
		int y = 60;
		
		if(x != y) {
			System.out.println("x와 y가 다릅니다.");
			System.out.println("test");
		}
		
		if(x == y) 
			System.out.println("x와 y는 같습니다.");
		System.out.println("test");			// 블럭 밖에서 선언하면 if문에 들어가지 않음
		if(x > y) {
			System.out.println("x는 y보다 큽니다.");
		} else if (x == y) {			// 몇개든 사용할 수 있지만 가급적 너무 많이는 사용하지 않는 것이 좋음
			System.out.println("x와 y는 같습니다.");
		} else {
			System.out.println("x는 y보다 작습니다.");
		}
	}

}
