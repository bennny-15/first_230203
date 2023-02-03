
public class StringMethodExam {

	public static void main(String[] args) {
		// String 클래스의 메소드
//		String str = new String("hello");
		String str = "hello";
//		str.length();	// 문자열의 길이 
		System.out.println(str.length());
		System.out.println();
		
		// concat = 문자열 합쳐주는 메소드
		System.out.println(str.concat(" World"));		
		System.out.println(str);		// string은 한번 만들어진 객체를 바꾸지 않음(불변 클래스)
		System.out.println();
		
		// 참조하는 부분이 바뀌려면 아래처럼 써주어야 참조하는 화살표가 바뀜. 
		str = str.concat(" world"); 
		System.out.println(str);
		
		// substring = 문자열 잘라주는 메소드
		System.out.println(str.substring(3));	// 시작 인덱스(3)부터 마지막까지 자르기
		System.out.println(str.substring(3, 7));
		
		
	}

}
