package basic;

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		// Q4. score(if) 0부터 100사이의 점수를 입력받아서
		// 90점 이상 A, 
		// 80점 이상 90점 미만 B
		// 70 이상 80 이하 C
		// 60 이상 70 이하 D
		// 그 외 F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 100 사이의 점수를 입력하세요. -> ");
		int score = sc.nextInt();
		

		if(score >= 90) {
			System.out.println("A");
			
		}else if(score < 90 && score >= 80) {
			System.out.println("B");
			
		}else if(score < 80 && score >= 70) {
			System.out.println("C");
			
		}else if(score < 70 && score >= 60) {
			System.out.println("D");
			
		}else {
			System.out.println("F");
		}
		
		sc.close();
		
	}
}
