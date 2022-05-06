package oop11.api;
// Wrapper Class 2
public class ObjectClass06 {
	public static void main(String[] args) {
		Integer i = 10;
		Object obj = i; // Integer to Object type up casting 
		
		int n = (Integer) obj; //Object to Integer type down casting 
		
		//10을 2진수로 변경
		System.out.println(n + "은 2진수로 " + Integer.toBinaryString(n));
		System.out.println(n + "은 8진수로 " + Integer.toOctalString(n));
		System.out.println(n + "은 16진수로 " + Integer.toHexString(n));
	}
}
