package oop11.api;
//StringBuilder
public class ObjectTest04 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//System.out.println(sb); 비어져있음
		
		printString(sb);
		
		sb.append("집에 갈래");
		printString(sb);
		
		sb.append(" 엉엉엉 ");
		printString(sb);
		
		sb.append("새러데이드립~");
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
		System.out.println("length : " + sb.length() + " /  capacity : " + sb.capacity()); //길이, 용량
		System.out.println(sb);
		
	}
}
