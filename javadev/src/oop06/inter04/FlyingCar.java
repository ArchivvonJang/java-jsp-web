package oop06.inter04;

public class FlyingCar extends Car implements Flyable{

	@Override
	public void fly() {
		System.out.println("하늘로 날아간다.");
	}

}
