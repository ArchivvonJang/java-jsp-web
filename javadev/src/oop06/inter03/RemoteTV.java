package oop06.inter03;

public abstract class RemoteTV implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("RemoteTV ���� �ѱ�");
	}

	@Override
	public void powerOff() {
		System.out.println("RemoteTV ���� ����");
	}

	@Override
	public void channelUp() {
		System.out.println("RemoteTV ä�� ����");
	}
//�߻�޼��尡 �ϳ� ���������Ƿ� ���� �߻�޼��尡 �����ϱ�! �� Ŭ������ �߻�Ŭ������ �ȴ�

}
