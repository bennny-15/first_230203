
public class StringExam {

	public static void main(String[] args) {
		// 가장 많이 사용하는 클래스 - new 없이도 사용 가능
		String str1 = "hello";  // 메모리 중 상수(변하지 앟는 값) 영역에 저장됨
		String str2 = "hello";
		// str1 과 str2는 같은 인스턴스를 참조하고 있음(이미 만들어진 인스턴스가 있으므로 또 만들지 않고 원래 있던 인스턴스를 참조함)
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		// new 를 이용하여 선언하면 새로운 인스턴스를 힙영역에 만듬 -> str3, str4는 다른 인스턴스를 참조한다
		
		if(str1 == str2) 	// 가리키는 주소 영억이 같은지 확인
			System.out.println("str1과 str2는 같은 레퍼런스입니다. ");
			
		if(str1 == str3)
			System.out.println("str1과 str3는 같은 레퍼런스입니다. ");
		
		if(str3 == str4)
			System.out.println("str3과 str4는 같은 레퍼런스입니다. ");
		/*
		 문자열이 같은지 확인하려면 equals 메소드를 사용.
		 if(str1.equals("hello")) or if(str1.equals(str2))
		 
		 */
		
		// 한번 생성된 클래스는 변하지 않는다
		System.out.println(str1);
		System.out.println(str1.substring(3));	// substring = 스트링 자르는 메소드
		System.out.println(str1);
		
	}

}
