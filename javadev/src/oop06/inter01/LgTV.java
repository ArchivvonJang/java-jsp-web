package oop06.inter01;

public class LgTV implements TV {
	
	private Speaker speaker = new InkelSpeaker();
	
	public void turnOn() {
		System.out.println("LG TV ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("LG TV ������ ���ϴ�.");
	}
	public void channelUp() {
		System.out.println("LG TV ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("LG TV ä���� �����ϴ�.");
	}
	public void soundUp() {
		//System.out.println("LG TV �Ҹ��� �ø��ϴ�.");
		speaker.soundUp();
	}
	public void soundDown() {
		//System.out.println("LG TV �Ҹ��� ���Դϴ�.");
		speaker.soundDown();
	}
}
