package oop07.anony;

public class AnonyTest {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn(); //익명클래스 내의 메서드 호출
		anony.method1();
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("smart tv ononon");
			}
			
			@Override
			public void turnOff() {
				System.out.println("smart tv offoffoff");
			}
		});
		
	}

}
