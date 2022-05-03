package basic;

//iteration statements
public class WhileTest01 {
	public static void main(String[] args) {

		int n = 1;
		while( n <= 3) {
			System.out.println("car " + n);
			n++;
			//증감식 제거하면 무한루프~~
		}
		System.out.println("----The End----");
	}
}
