package oop06.inter01;

public class STV implements TV{
	
	private Speaker speaker = new AppleSpeaker();
	
	public void turnOn() {
		System.out.println("STV ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("STV ������ ���ϴ�.");
	}
	public void channelUp() {
		System.out.println("STV ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("STV ä���� �����ϴ�.");
	}
	public void soundUp() {
		//System.out.println("STV �Ҹ��� �ø��ϴ�.");
		speaker.soundUp();
	}
	public void soundDown() {
		//System.out.println("STV �Ҹ��� ���Դϴ�.");
		speaker.soundDown();
	}


}
