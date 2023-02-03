package com.eightcruz.javaStudy;
// 접근제한자 예제

// public > protected > default > private

public class AccessObj {
	public int p = 3;
	protected int p2 = 4;		// 같은 패키지, 상속받은 자식 클래스만 사용 가능
	int k = 2;					// default 접근지정자 - 같은 패키지 내에서 접근 허용
	private int i = 5;			// 자기 자신만 접근 가능
	
}
