package basic;

import java.util.Scanner;

public class SwitchTest03 {
//conditional statements
	public static void main(String[] args) {
		// Q6. score(switch case) 0���� 100������ ������ �Է¹޾Ƽ�
		// 90�� �̻� A, 
		// 80�� �̻� 90�� �̸� B
		// 70 �̻� 80 ���� C
		// 60 �̻� 70 ���� D
		// �� �� F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 100 ������ ������ �Է��ϼ���. -> ");
		int score = sc.nextInt();
		String grade = " ";
		
		switch(score/10) {
			case 9: case 10:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;	
			default:  //�� �ܴ� 
				grade ="F";
				break;
		}
			
		System.out.println("������ " + grade);
		sc.close();
	}

}
