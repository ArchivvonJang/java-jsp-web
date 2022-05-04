package oop06.inter05;

public class FlyingCar implements Flyable, Drivable{

	@Override
	public void drive() {
		System.out.println("자동차는 운행 중");
	}

	@Override
	public void fly() {
		System.out.println("자동차는 날아다니는 중");
	}

}
