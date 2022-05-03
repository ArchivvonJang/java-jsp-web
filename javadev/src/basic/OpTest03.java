package basic;

//논리연산자
public class OpTest03 {

	public static void main(String[] args) {
		boolean a, b, c, d;
		
		a = true;
		b = true;
		c = false;
		d = false;
		
		System.out.println(a && b);
		System.out.println(a || b);
		
		System.out.println(a && c);
		System.out.println(a || c);
		
		System.out.println(c && d);
		System.out.println(c || d);
		
		System.out.println(!b);
		System.out.println(!d);
		
		
		
	}

}
