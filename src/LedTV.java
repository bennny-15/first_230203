// TV 인터페이스를 상속받아서 클래스 생성 -> 인터페이스 TV를 구현하기 위한 클래스

public class LedTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨 조절");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널 조절");
	}

}
