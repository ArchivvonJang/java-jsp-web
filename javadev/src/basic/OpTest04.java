package basic;
//����������
public class OpTest04 {
	 public static void main(String[] args) {
		//�����ϰ� ���� ������Ű�ų� ���ҽ�Ų��.
		 int a = 5;
		 //a = a + 1 (prefix ���ξ�)
		 ++a;
		 System.out.println("a = " + a);
		 
	
		 a++; // a = a + 1 (postfix ���̾�)
		 System.out.println("a = " + a);
		 
		 a = 5;

		 
		 //���������� �� �ڿ� �ٿ��� ���� ����
		 int b = ++a; // (1) a = a + 1; (2) b = a
		 System.out.println("b = " + b);
		 

		 
	}
}
