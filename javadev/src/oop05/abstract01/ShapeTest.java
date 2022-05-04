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
	 * instance of 연산자 : 참조변수가 참조하는 인스턴스의 타입을 검사할 때 사용
	 * 	1. 매개변수의 타입을 부모타입으로 선언
	 * 	2. instance of  연산자를 사용해서 type을 검사한다.
	 *  3. 타입 변경 후 각각 타입에 맞게 차별적인 작업을 수행한다. 
	 * */
	
	private static void printArea(Shape s) { //다형성
		s.area();
		if(s instanceof Circle) { //s 가 Circle 타입의 인스턴스 인가요?
			
			Circle c = (Circle) s;
			//c.size();
			System.out.println("반지름이 " + c.r +"인 원의 넓이는 ? " + c.res);
			
		}else if( s instanceof Rectangle) {
			
			Rectangle r = (Rectangle) s;
			System.out.println("가로가 " + r.w + " 세로가 " + r.h +"인 사각형 넓이는 ? " + r.res);
			
		}else if( s instanceof Triangle) {
			
			Triangle t = (Triangle) s;
			System.out.println("밑변이 " + t.w + " 높이가 " + t.h +"인 삼각형 넓이는 ? " + t.res);
			
		}
	}
	
	

//	private static void printArea(Triangle t) {
//		t.area();
//		System.out.println("밑변이 " + t.w + " 높이가 " + t.h +"인 삼각형 넓이는 ? " + t.res);
//	}
//
//	private static void printArea(Rectangle r) {
//		r.area();
//		System.out.println("가로가 " + r.w + " 세로가 " + r.h +"인 사각형 넓이는 ? " + r.res);
//	}
//
//	private static void printArea(Circle c) {
//		c.area();
//		System.out.println("반지름이 " + c.r +"인 원의 넓이는 ? " + c.res);
//		
//	}

}
