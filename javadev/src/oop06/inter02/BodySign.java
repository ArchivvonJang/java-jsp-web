package oop06.inter02;

public interface BodySign {
	public static final int CENTER = 1; // interface 상수 변수 이름은 대문자로 
	public static final int LEFT = 2;
	public static final int RIGHT = 3;
	public static final int DOWN = 4;
	public static final int UP = 5;
	
	public void throwBall(int how);
}
