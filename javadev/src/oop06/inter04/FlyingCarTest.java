package oop06.inter04;

public class FlyingCarTest {

	public static void main(String[] args) {
		FlyingCar car = new FlyingCar();
		car.setSpeed(1000);
		System.out.println("¼Óµµ " + car.getSpeed());

		car.fly();
	}

}
