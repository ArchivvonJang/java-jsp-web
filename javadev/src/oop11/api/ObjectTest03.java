package oop11.api;
//String
public class ObjectTest03 {
	
	public static void main(String[] args) {
		String str1 = new String("�ƾƾƾƾƤ�������������������");
		String str2 = new String("�ƾƾƾƾƤ�������������������");
		
		//�޸� �Ҵ��� ���� �̷������ ���� �ٸ� �޸� ������ �����ϰ� �ֱ� ������ �� ���ڿ��� �ٸ���. 
		
		if(str1 == str2) {
			System.out.println("���ڿ� ����.");
		}else {
			System.out.println("���ڿ� �ٸ���.");//v 
		}
		
		//�ֵ���ǥ ���� ���ڿ� ������ �� 
		if(str1.equals(str2)) {
			System.out.println("���ڿ� ����.");//v 
		}else {
			System.out.println("���ڿ� �ٸ���.");
		}
		
		System.out.println(str1.toString());
		System.out.println(str1.hashCode());
		
		System.out.println(str1 = str1.replace("��","��"));
		System.out.println(str1.hashCode());
		
		
		
	}
}
