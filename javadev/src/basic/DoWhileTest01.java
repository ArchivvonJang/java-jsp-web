package basic;

//iteration statements
public class DoWhileTest01 {
	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		do {
			if(i%3 ==0) sum+=i;
			i++;
		}
		while( i <= 1000);
			System.out.println(i);
		
		
	}
}
