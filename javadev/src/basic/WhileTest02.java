package basic;

public class WhileTest02 {
	public static void main(String[] args) {
		//Q7. 1부터 1000까지의 정수 중 3의 배수의 합계를 구하시오 (while)
	
		int max = 1000;
		int sum = 0;
		int n = 1;
	
		while(n <= max) {
			if(n%3 ==0) sum += n;
			n++;
		}
		System.out.println("1부터 1000까지의 3의 배수의 합계 " + sum);
		//166833
	}
}
