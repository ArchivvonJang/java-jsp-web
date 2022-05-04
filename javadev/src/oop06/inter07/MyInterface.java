package oop06.inter07;

public interface MyInterface {
	public void myMethod1();
	
	public default void myMethod2() {
		System.out.println("default method --> myMethod2 start");
	}
}
