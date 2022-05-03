package basic;

import java.util.Scanner;

//삼항연산자
public class OpTest07 {

	public static void main(String[] args) {
		
		int n = 3;
		
		//조건, 조건 true 결과1, 조건 false 결과2
		System.out.println(n == 1? "Herr" : "Frau");
		
		//조건 안의 조건ㄴ
		System.out.println( n == 1? "Herr" : 
							n == 2? "Frau" : 
									"Error");
		
		System.out.println("--------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사탕이 좋으면 1, 초콜렛이 좋으면 2 =>");
		int num = sc.nextInt();
		
		System.out.println(num == 1? "Candy" : 
						   num == 2? "Chocolate" : 
									"Error");
		
		sc.close();

	}

}
