package oop04;

public class PointTest {

	public static void main(String[] args) {
		//��ĳ���� (up casting)
		Point2D up = new Point3D();
		up.x = 10;
		up.y = 20;
		//up.z = 30;
		
		//�ٿ�ĳ���� (down casting)
		Point3D dn = (Point3D) up;
		dn.x = 10;
		dn.y = 20;
		dn.z = 30;
	}

}
