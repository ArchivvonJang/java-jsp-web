package basic;

import java.util.Scanner;

public class OpTest08 {
	public static void main(String[] args) {
		//Q1. ������ �Է¹޾� ¦������ Ȧ������ �Ǻ��Ͻÿ�. (���׿�����)
		
		System.out.println("Q1. ������ �Է¹޾� ¦������ Ȧ������ �Ǻ��Ͻÿ�. (���׿�����)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�. -> ");
		int num = sc.nextInt();
		int result = num%2;
		
		System.out.print("��� -> ");
		System.out.println(result == 0? "¦��" : "Ȧ��");
		
		sc.close();
		
	}
}
