package oop11.api;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵ �Է� (ex. 2022) : ");
		int year = sc.nextInt();
		
		System.out.print("�� �Է� (ex. 6) : ");
		int month = sc.nextInt();
		
		drawCalendar(year, month);
		
		sc.close();
				
	}

	public static void drawCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();
		
		int sweek = 0; //start week �� ���� ù��° ���� ���� (�� : 1, �� : 2, ... �� : 7)
		int eday = 0; // end day �� ���� ������ ��¥
		
		//month �� 0 ���� ����, 
		cal.set(year, month - 1, 1);
		
		sweek = cal.get(Calendar.DAY_OF_WEEK); //day of week ���ϰ� ����� ������ ���� == get(7)
		eday = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println("   " + year + "�� " + month + "��");
		System.out.println(" �� �� ȭ �� �� �� �� ");
		
		//1�� ���� ������ ����
		for (int i = 1; i < sweek; i++) {
			//ù° ���� ��µǱ� ������ ���� ���
			System.out.print("   ");
		}
		
		//1�Ϻ��� ������ ��¥���� ���
		for (int d = 1, w = sweek ; d <= eday; d++, w++) {
			System.out.print( d < 10? "  " + d : " " + d);
			//������̸�, �ٹٲ�
			if(w%7==0) System.out.println();
		}
		
	}
}
