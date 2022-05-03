package basic;

public class BreakTest01 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(true) {// 무한루프
			sum += i;
			
			//특정 조건이 되면 루프를 벗어나게 하기
			if(sum >= 100) break;
			
			i++;
		}
		
		System.out.println("1부터 " + i +"까지의 정수의 합계는 ? "+sum);

	}

}
