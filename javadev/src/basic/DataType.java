package basic;

public class DataType {

	public static void main(String[] args) {
		boolean b1 = false;
		System.out.println("boolean b1 = "+b1);
		
		//char c = 'A';
		char c = 65;
		System.out.println("char c = " + c);
		//�� ����� char c = A �� ����.
		
		char c1 = 54620;
		System.out.println("char c1 = " + c1); 
		//char c1 = ��
		
		byte b2 = 127;
		System.out.println("byte b2 = " + b2);
		
		short s = 32767;
		System.out.println("short s = " + s);
		
		int i = 2147483647;
		System.out.println("int i = " + i);
		
		long l1 = 2147483648l; //���ڴ� ���ͷ��̶�� �ϸ�, ���� intŸ������ �ν��Ѵ�. �׷��� ���� l�� �ٿ� longŸ���̶�� �˷��ش�. 
		System.out.println("long li = " + l1);
		
		double d = 3.1415326535;
		System.out.println("double d = " + d); //double d = 3.1415326535
		
		float f = 3.1415326535f; //���ͷ��� double�� ���� �ν��ϱ� ������ ������ �߻��Ѵ�. �׷��Ƿ� f�� �ٿ� float�̶�� ����Ѵ�.
		System.out.println("float f = " + f); //float f = 3.1415327
		
		System.out.println("\"���̽��Ƹ޸�ī�� �ּ���.\""); // \"���ڿ�\" <-  escape sequence
		System.out.println("�ȳ��ϼ���. \n�ٹٲ� "); //�ٹٲ�
		System.out.println("0\t 1\t tab \t"); //tab ����
		
		
	}

}
