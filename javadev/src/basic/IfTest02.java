package basic;

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		// Q4. score(if) 0���� 100������ ������ �Է¹޾Ƽ�
		// 90�� �̻� A, 
		// 80�� �̻� 90�� �̸� B
		// 70 �̻� 80 ���� C
		// 60 �̻� 70 ���� D
		// �� �� F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 100 ������ ������ �Է��ϼ���. -> ");
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
