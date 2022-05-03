package basic;
//증감연산자
public class OpTest05 {
	 public static void main(String[] args) {
		//일정하게 값을 증가시키거나 감소시킨다.
		 int a = 5;

		 
		 //증감연산자 앞 뒤에 붙였을 때의 차이
		 a = 5;
		 int b = a++; //(1) b = a (2) b = a + 1
		 System.out.println("a = " + a);
		 System.out.println("b = " + b);
		 
		//a = 6
		//b = 5

	}
}
