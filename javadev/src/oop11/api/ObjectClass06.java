package oop11.api;
// Wrapper Class 2
public class ObjectClass06 {
	public static void main(String[] args) {
		Integer i = 10;
		Object obj = i; // Integer to Object type up casting 
		
		int n = (Integer) obj; //Object to Integer type down casting 
		
		//10�� 2������ ����
		System.out.println(n + "�� 2������ " + Integer.toBinaryString(n));
		System.out.println(n + "�� 8������ " + Integer.toOctalString(n));
		System.out.println(n + "�� 16������ " + Integer.toHexString(n));
	}
}
