package basic;

public class ForTest03 {
	public static void main(String[] args) {
		//Q7. 1부터 1000까지의 정수 중 3의 배수의 합계를 구하시오 (for)
	
		int max = 1000;
		int sum = 0;
		
		for (int i = 0; i <= max; i+=3) { //같은 결과값 333번만 돌기 때문에 속도가 더 빠르다 
		//for (int i = 1; i <= max; i++) {
			if(i%3 ==0) sum += i;
		}
		System.out.println("1부터 1000까지의 3의 배수의 합계 " + sum);
		//166833
	}
}
