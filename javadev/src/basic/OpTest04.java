package basic;
//증감연산자
public class OpTest04 {
	 public static void main(String[] args) {
		//일정하게 값을 증가시키거나 감소시킨다.
		 int a = 5;
		 //a = a + 1 (prefix 접두어)
		 ++a;
		 System.out.println("a = " + a);
		 
	
		 a++; // a = a + 1 (postfix 접미어)
		 System.out.println("a = " + a);
		 
		 a = 5;

		 
		 //증감연산자 앞 뒤에 붙였을 때의 차이
		 int b = ++a; // (1) a = a + 1; (2) b = a
		 System.out.println("b = " + b);
		 

		 
	}
}
