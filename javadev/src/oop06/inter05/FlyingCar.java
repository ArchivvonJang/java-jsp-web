package oop06.inter05;

public class FlyingCar implements Flyable, Drivable{

	@Override
	public void drive() {
		System.out.println("�ڵ����� ���� ��");
	}

	@Override
	public void fly() {
		System.out.println("�ڵ����� ���ƴٴϴ� ��");
	}

}
