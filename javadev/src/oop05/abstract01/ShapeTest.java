package oop05.abstract01;

public class ShapeTest {

	public static void main(String[] args) {
//		Circle c = new Circle();
//		Rectangle r = new Rectangle();
//		Triangle t = new Triangle();
		
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());

	}

	/*
	 * instance of ������ : ���������� �����ϴ� �ν��Ͻ��� Ÿ���� �˻��� �� ���
	 * 	1. �Ű������� Ÿ���� �θ�Ÿ������ ����
	 * 	2. instance of  �����ڸ� ����ؼ� type�� �˻��Ѵ�.
	 *  3. Ÿ�� ���� �� ���� Ÿ�Կ� �°� �������� �۾��� �����Ѵ�. 
	 * */
	
	private static void printArea(Shape s) { //������
		s.area();
		if(s instanceof Circle) { //s �� Circle Ÿ���� �ν��Ͻ� �ΰ���?
			
			Circle c = (Circle) s;
			//c.size();
			System.out.println("�������� " + c.r +"�� ���� ���̴� ? " + c.res);
			
		}else if( s instanceof Rectangle) {
			
			Rectangle r = (Rectangle) s;
			System.out.println("���ΰ� " + r.w + " ���ΰ� " + r.h +"�� �簢�� ���̴� ? " + r.res);
			
		}else if( s instanceof Triangle) {
			
			Triangle t = (Triangle) s;
			System.out.println("�غ��� " + t.w + " ���̰� " + t.h +"�� �ﰢ�� ���̴� ? " + t.res);
			
		}
	}
	
	

//	private static void printArea(Triangle t) {
//		t.area();
//		System.out.println("�غ��� " + t.w + " ���̰� " + t.h +"�� �ﰢ�� ���̴� ? " + t.res);
//	}
//
//	private static void printArea(Rectangle r) {
//		r.area();
//		System.out.println("���ΰ� " + r.w + " ���ΰ� " + r.h +"�� �簢�� ���̴� ? " + r.res);
//	}
//
//	private static void printArea(Circle c) {
//		c.area();
//		System.out.println("�������� " + c.r +"�� ���� ���̴� ? " + c.res);
//		
//	}

}