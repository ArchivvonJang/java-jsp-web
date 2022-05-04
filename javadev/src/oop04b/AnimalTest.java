package oop04b;

public class AnimalTest {

	public static void main(String[] args) {
		//Dog d = new Dog();
		Animal a = new Dog();
		a.eat();
		a.sleep();
		//a.bark();
		
		System.out.println("--------------------------");
		
		Dog d = (Dog) a;
		d.eat();
		d.sleep();
		d.bark();
			
	}

}
