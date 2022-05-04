package oop06.inter03;

public class RemoteTest {

	public static void main(String[] args) {
		//RemoteTV tv = new LgRemoteTV();
		RemoteControl tv = new LgRemoteTV(); //이것도 가능
		
		tv.powerOff();
		tv.powerOn();
		tv.channelDown();
		tv.channelUp();
	}

}
