package basic;

public class ForTest03 {
	public static void main(String[] args) {
		//Q7. 1���� 1000������ ���� �� 3�� ����� �հ踦 ���Ͻÿ� (for)
	
		int max = 1000;
		int sum = 0;
		
		for (int i = 0; i <= max; i+=3) { //���� ����� 333���� ���� ������ �ӵ��� �� ������ 
		//for (int i = 1; i <= max; i++) {
			if(i%3 ==0) sum += i;
		}
		System.out.println("1���� 1000������ 3�� ����� �հ� " + sum);
		//166833
	}
}
