package basic;

public class WhileTest02 {
	public static void main(String[] args) {
		//Q7. 1���� 1000������ ���� �� 3�� ����� �հ踦 ���Ͻÿ� (while)
	
		int max = 1000;
		int sum = 0;
		int n = 1;
	
		while(n <= max) {
			if(n%3 ==0) sum += n;
			n++;
		}
		System.out.println("1���� 1000������ 3�� ����� �հ� " + sum);
		//166833
	}
}
