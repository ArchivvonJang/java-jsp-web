package oop07.anony;

public class Anonymous {
	RemoteControl field = new RemoteControl() { //익명객체를 구현하는 ~ 클래스
		
		@Override
		public void turnOn() {
			System.out.println("TV ON");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV OFF");
		}
	};
	
	public void method1() {
		RemoteControl local = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio ON");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio OFF");
			}
		};
		
		local.turnOn();
	}
	
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
}
