package basic;

import java.util.Scanner;

public class SwitchTest02 {
	public static void main(String[] args) {
		//Q5. switch ~ case 이용
		// 1 : 남자 2: 여자 3: 남자 : 여자 default 에러
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요. -> ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1: case 3: 
				System.out.println("남자");
				break;
			case 2:  case 4:
				System.out.println("여자");
				break;
			default:
				System.out.println("Error!");
				break;
		}
		
		sc.close();
		
	}
}
