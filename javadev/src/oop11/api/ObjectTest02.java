package oop11.api;
//String
public class ObjectTest02 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		if(a == b) {
			System.out.println("���� ����."); //v
		}else {
			System.out.println("���� �ٸ���.");
		}
		
		String str1 = "�ȳ��ϼ���.";
		String str2 = "�ȳ��ϼ���.";
		
		//���� ���� �޸� ������ �����ϰ� �ֱ� ������ �� ���ڿ��� ����.
		if(str1 == str2) {
			System.out.println("���ڿ� ����.");//v 
		}else {
			System.out.println("���ڿ� �ٸ���.");
		}
	}
}
