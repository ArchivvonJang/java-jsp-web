package oop08.singleton;

public class Singleton {
	//�ڱ� �ڽ��� ��ȯ�� �� �ֵ��� ����
	private static Singleton singleton = null;
	
	//������
	private Singleton() {} //�ܺο��� ������� ���ϵ��� �����ش�.
	
	public static Singleton getInstance() {
		 //��������� ���� ���¶�� ��ü ���� �� ��ȯ
		if(singleton == null) {
			singleton = new Singleton();
		}
		//�̹� ������ ��쿡�� �ٷ� ��ȯ
		return singleton;
	}
	
}
