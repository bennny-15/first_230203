/* 인터페이스 = 구현은 하지 않고 메소드만 갖고 있는 것(기능들을 모아 놓은 것)
  = 추상 메소드(abstract)와 비슷
  인터페이스는 자체로 타입의 역할은 할 수 있지만 구현은 없기 떄문에
  인터페이스 자체가 객체를 생성할 수는 없다.
 */ 

public interface TV {
	// 상수 정의하여 사용 가능 - final 키워드가 없어도 상수처럼 사용 가능
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	

	public void turnOn();	// 추상 메소드와 비슷하지만 키워드가 없어도 오류나지 않음
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
