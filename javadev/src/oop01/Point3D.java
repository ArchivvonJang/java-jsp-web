package oop01;

public class Point3D extends Point2D{
	private int z;

	//하위클래스의 생성자에서는 반드시 부모 클래스의 생성자를 정의한다.
	//Point2D에 두개의 생성자가 호출되어 있으므로, 둘 중에 하나는 생성하게 되어있다.
	public Point3D() {
		//super(); //이걸 호출 안하면 반드시 부모 클래스의 생성자를 가져온다.
		
//		Q8.Point3D디폴트 생성자를 수행했을 때 멤버필드 x, y, z를 10, 20, 30 으로 초기화해서 출력하세요.
		
		//super(10, 20); <- 이렇게 안하고 아래와 같이 하면된다.
		//this.z = 30;
		this(10,20,30);
		
		System.out.println("Point3D() 수행 중");
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Point3D(x, y, z) 수행 중");
	}

	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void print() {
		 super.print(); //상위클래스에서 상속받은 메소드 가져오기 super
		 System.out.println("z = " + getZ());
	}
	
	
}
