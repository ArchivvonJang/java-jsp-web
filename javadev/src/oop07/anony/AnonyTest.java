package oop07.anony;

public class AnonyTest {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn(); //�͸�Ŭ���� ���� �޼��� ȣ��
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
