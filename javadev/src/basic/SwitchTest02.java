package basic;

import java.util.Scanner;

public class SwitchTest02 {
	public static void main(String[] args) {
		//Q5. switch ~ case �̿�
		// 1 : ���� 2: ���� 3: ���� : ���� default ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���. -> ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1: case 3: 
				System.out.println("����");
				break;
			case 2:  case 4:
				System.out.println("����");
				break;
			default:
				System.out.println("Error!");
				break;
		}
		
		sc.close();
		
	}
}
