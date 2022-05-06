package oop11.api;
//StringBuilder
public class ObjectTest04 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//System.out.println(sb); ���������
		
		printString(sb);
		
		sb.append("���� ����");
		printString(sb);
		
		sb.append(" ������ ");
		printString(sb);
		
		sb.append("�������̵帳~");
		printString(sb);
		
		sb.insert(4, "~~~~");
		printString(sb);
		
		sb.delete(4, 8);
		printString(sb);
		
		sb.reverse();
		printString(sb);
		
		sb.reverse();
		printString(sb);
		
	}

	private static void printString(StringBuilder sb) {
		System.out.println("length : " + sb.length() + " /  capacity : " + sb.capacity()); //����, �뷮
		System.out.println(sb);
		
	}
}
