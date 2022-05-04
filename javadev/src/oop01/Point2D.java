package oop01;

public class Point2D {
	private int x;
	private int y; //멤버필드
	
	public Point2D() {
		//컴파일러가 기본으로 기본 생성자를 생성해준다. 이렇게 일부러 굳이 만들지 않아도...
		//다른 클래스에서 new하면서 생성하게 되는 부분이다.
		this(1,2); //자기자신의 오버로딩된 메서드 사용
		System.out.println("Point2D() 수행 중");
	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y) 수행 중");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		 System.out.println("x = " + getX());
		 System.out.println("y = " + getY());
	}
	
	
}
