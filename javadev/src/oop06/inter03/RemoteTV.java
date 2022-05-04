package oop06.inter03;

public abstract class RemoteTV implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("RemoteTV 전원 켜기");
	}

	@Override
	public void powerOff() {
		System.out.println("RemoteTV 전원 끄기");
	}

	@Override
	public void channelUp() {
		System.out.println("RemoteTV 채널 위로");
	}
//추상메서드가 하나 남아있으므로 아직 추상메서드가 있으니까! 이 클래스도 추상클래스가 된다

}
