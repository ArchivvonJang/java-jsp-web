package basic;

import java.util.Scanner;

public class SwitchTest03 {
//conditional statements
	public static void main(String[] args) {
		// Q6. score(switch case) 0부터 100사이의 점수를 입력받아서
		// 90점 이상 A, 
		// 80점 이상 90점 미만 B
		// 70 이상 80 이하 C
		// 60 이상 70 이하 D
		// 그 외 F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 100 사이의 점수를 입력하세요. -> ");
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
			default:  //그 외는 
				grade ="F";
				break;
		}
			
		System.out.println("점수는 " + grade);
		sc.close();
	}

}
