package basic;

public class ContinueTest01 {

	public static void main(String[] args) {
		int sum = 0;
		int thirdSum = 0;
		int notThirdSum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			//3의 배수
			if(i%3==0) thirdSum+=i;
			//3의 배수가 아닌 것만 합계
			if(i%3!=0) continue;
				notThirdSum+=i;
				//continue : 반복문 안에 continue 이하의 문장들은 생략하고 증감식으로 계산한다. 
		}

		System.out.println("1부터 10까지 합계는 " + sum); //55
		System.out.println(thirdSum); //18
		System.out.println(notThirdSum); //18
	}

}
