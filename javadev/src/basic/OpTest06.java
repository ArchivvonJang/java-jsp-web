package basic;

//복합대입연산자
public class OpTest06 {
	public static void main(String[] args) {
		int a = 5;
		a += 5; //a = a + 5;
		
		System.out.println(a); //값을 누적해야할 때 사용한다. 
		
		a -= 5; //a = a - 5;
		
		System.out.println(a);
		
		a *= 5; //a = a * 5;
		
		System.out.println(a); 
		
		a /= 5; //a = a / 5;
		
		System.out.println(a); 
		
		a %= 5; //a = a % 5;
		
		System.out.println(a); 
		
		/*
		10
		5
		25
		5
		0
		*/

	}
}
