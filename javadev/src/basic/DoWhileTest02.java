package basic;

//iteration statements
public class DoWhileTest02 {
	public static void main(String[] args) {

		int n1, n2;
		
		n1 = (int)(Math.random()*6)+1;
		//n1�� n2�� �ٸ� ���� ������ �ϱ� ���ؼ� do while
		do {
			n2 = (int) (Math.random() * 6) + 1;
		} while (n2==n1);
		
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
	}
}
