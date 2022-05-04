package oop01;

public class Point2D {
	private int x;
	private int y; //����ʵ�
	
	public Point2D() {
		//�����Ϸ��� �⺻���� �⺻ �����ڸ� �������ش�. �̷��� �Ϻη� ���� ������ �ʾƵ�...
		//�ٸ� Ŭ�������� new�ϸ鼭 �����ϰ� �Ǵ� �κ��̴�.
		this(1,2); //�ڱ��ڽ��� �����ε��� �޼��� ���
		System.out.println("Point2D() ���� ��");
	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y) ���� ��");
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
