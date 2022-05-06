package oop11.api;
//String
public class ObjectTest02 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		if(a == b) {
			System.out.println("정수 같다."); //v
		}else {
			System.out.println("정수 다르다.");
		}
		
		String str1 = "안녕하세요.";
		String str2 = "안녕하세요.";
		
		//서로 같은 메모리 영역을 참조하고 있기 때문에 두 문자열은 같다.
		if(str1 == str2) {
			System.out.println("문자열 같다.");//v 
		}else {
			System.out.println("문자열 다르다.");
		}
	}
}
