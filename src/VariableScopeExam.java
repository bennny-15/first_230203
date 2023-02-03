
public class VariableScopeExam {
	// 변수의 scope와 static
	
	int globalScope = 10;		// 인스턴스 변수
	
	// static한 변수 선언 -> static한 메소드 안에서 사용가능(메인)
	static int staticVal = 7;
	
	
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope); // 사용 가능
		System.out.println(localScope);
		System.out.println(value); 
	}

	public void scopeTest2(int value2) {
		System.out.println(globalScope); // 사용 가능
//		System.out.println(localScope);		// 사용 불가능
//		System.out.println(value); 			// 사용 불가능
		System.out.println(value2);
		
		
		System.out.println(staticVal);    // static한 변수는 static하지 않은 메소드 안에서는 사용 가능하다.
		
	}
	
	public static void main(String[] args) {
//		System.out.println(globalScope); 	// 사용 불가능 -> static 키워드 때문
//		System.out.println(localScope);
//		System.out.println(value); 
		
		
		/* 모든 클래스는 인스턴스화 하지 않은 채로 사용할 수 없다
		 그러나 static 키워드를 사용하면 인스턴스화(객체 생성) 하지 않아도 사용할 수 있게 해준다
		 static한 메소드 안에서 static하지 않은 필드는 사용할 수 없다. */
		
		System.out.println(staticVal);		// static한 변수 사용 가능
		System.out.println();
		
		
		// static한 메소드 안에서 static하지 않은 변수들을 사용하는 방법 -> 객체를 생성해서 사용
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		System.out.println();
		
		VariableScopeExam v2 = new VariableScopeExam();		// 객체 안에 별도의 공간 존재
		v1.globalScope = 10;
		v2.globalScope = 20;
		
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		System.out.println();
		
		
		/* static한 필드는 인스턴스 생성 시에 만들어지는 것이 아니고 값을 저장할 수 있는 공간이 하나밖에 없음
		즉 값을 공유한다. --> 클래스 변수
		*/
		v1.staticVal = 50;
		v2.staticVal = 100;
		
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);		
		// 클래스 변수는 인스턴스가 생성되지 않아도 사용 가능 -> 클래스 이름으로 직접 사용 가능
		System.out.println(VariableScopeExam.staticVal);
	}

}
