package basic;

import java.util.Scanner;

//���׿�����
public class OpTest07 {

	public static void main(String[] args) {
		
		int n = 3;
		
		//����, ���� true ���1, ���� false ���2
		System.out.println(n == 1? "Herr" : "Frau");
		
		//���� ���� ���Ǥ�
		System.out.println( n == 1? "Herr" : 
							n == 2? "Frau" : 
									"Error");
		
		System.out.println("--------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ������ 1, ���ݷ��� ������ 2 =>");
		int num = sc.nextInt();
		
		System.out.println(num == 1? "Candy" : 
						   num == 2? "Chocolate" : 
									"Error");
		
		sc.close();

	}

}
