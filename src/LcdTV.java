
public class LcdTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("LCD 티비 전원 켜기");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("LCD 티비 전원 끄기");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("LCD 티비 볼륨 조절");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("LCD 티비 채널 조절");
	}

}
