

public class OperatorExam {

	public static void main(String[] args) {
		/** 
		 * 연산자
		 */
		
		/* 부호 연산자 */
		int i1 = -5;
		int i2 = +i1;		// 변수 앞 +연산자는 부호를 그래도 유지시켜주는 연산자
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println();
		
		
		/* 증감연산자 - 전위연산자, 후위연산자 */
		int i4 = ++i3;	// i3 = i3 + 1; 전위연산자
		System.out.println(i4);		// i3에 1을 더하고 i4를 출력
		System.out.println(i3);
		int i5 = i3++;	// i3 = i3 + 1; 후위연산자
		System.out.println(i5);		// i5를 출력하고 i3에 1을 더함
		System.out.println(i3);
		System.out.println();
		
		
		/* 산술연산자 */
		int i = 5; 
		int j = 2;
		
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j); 		// 정수형 타입끼리의 연산은 정수형의 값만 나옴. (2.5가 아닌 2로 출력)
		System.out.println(i / (double)j);	// 실수로 출력하려면 둘 중 하나는 실수형이어야 함. 캐스팅 연산(단항 연산자)
		System.out.println(i % j);		// 모듈러 연산(나눈 나머지 값 출력)
		System.out.println();
		
		
		/* 비교 연산자 (값은 boolean 값만 나옴) */
		
		int x = 10;		// 단순 대입 연산자
		int y = 10;
		
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x >= y);
		System.out.println(x < y);
		System.out.println(x <= y);
		System.out.println();
		
		
		/* 복합 대입 연산자 */
		x += 10;		// x = x+10;
		System.out.println(x);
		
		System.out.println(x -= 5);		// x = x-5;
		System.out.println(x);
		System.out.println();
		
		
		/* 연산자 우선순위 */
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println((a - b) * c);
		System.out.println(a > 5 && b > 5); // false && true 이므로 false 출력. 비교연산이 논리연산보다 우선순위 높음 
		// 가독성을 위해서는 괄호를 치기도 함.
		
		System.out.println(++a - 5);	// 전위연산자는 산술보다 먼저 수행. (a=a+1, a=a-5 --> a=1)
		System.out.println(a); // a = 6
		
		System.out.println(a++ - 5);	// 후위연산자는 5를 빼주고 나서 수행.(a=a-5, a=a+1 --> a=1)
		System.out.println(a); 	// a = 6 + 1 = 7
		System.out.println();
		
		
		/* 논리 연산자 */ 
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		System.out.println(b2 && b3);
		System.out.println(b1 && b3);
		System.out.println(b1 || b2);
		System.out.println(b2 || b3);
		System.out.println(b1 || b3);
		
		
		int score = 68;
		
		if(score <= 100 && score>= 70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
		// 배타적 논리합 - 두개가 달라야 true
		System.out.println(b1 ^ b2);
		System.out.println(b1 ^ b3);
		// 부정연산자
		System.out.println(!b1);
		System.out.println();
		
		
		/* 삼항 연산자 - if문과 비슷 */
		
		int a1 = (5 > 4) ? 50 : 40;		// 괄호 안 값이 참이라면 a1에 50 대입, 거짓이라면 40을 대입
		System.out.println(a1);
		
		// 삼항연산자가 익숙하지 않다면 if문으로 대체 가능
				int a2 = 0;
				if(5 < 4) {
					a2 = 50;
				} else {
					a2 = 40;
				}
				System.out.println(a2);
		
		// 실습 예제 - 변수 타입 주의하여 선언하기
		int hour = 12;
		String ampm = (hour < 12) ? "오전" : "오후";	
		System.out.println("현재 시각은 " + hour + "시이고, " + ampm +"입니다.");
		
	}

}
