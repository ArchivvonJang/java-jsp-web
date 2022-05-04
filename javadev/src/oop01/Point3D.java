package oop01;

public class Point3D extends Point2D{
	private int z;

	//����Ŭ������ �����ڿ����� �ݵ�� �θ� Ŭ������ �����ڸ� �����Ѵ�.
	//Point2D�� �ΰ��� �����ڰ� ȣ��Ǿ� �����Ƿ�, �� �߿� �ϳ��� �����ϰ� �Ǿ��ִ�.
	public Point3D() {
		//super(); //�̰� ȣ�� ���ϸ� �ݵ�� �θ� Ŭ������ �����ڸ� �����´�.
		
//		Q8.Point3D����Ʈ �����ڸ� �������� �� ����ʵ� x, y, z�� 10, 20, 30 ���� �ʱ�ȭ�ؼ� ����ϼ���.
		
		//super(10, 20); <- �̷��� ���ϰ� �Ʒ��� ���� �ϸ�ȴ�.
		//this.z = 30;
		this(10,20,30);
		
		System.out.println("Point3D() ���� ��");
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Point3D(x, y, z) ���� ��");
	}

	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void print() {
		 super.print(); //����Ŭ�������� ��ӹ��� �޼ҵ� �������� super
		 System.out.println("z = " + getZ());
	}
	
	
}
