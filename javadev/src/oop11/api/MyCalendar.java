package oop11.api;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 (ex. 2022) : ");
		int year = sc.nextInt();
		
		System.out.print("월 입력 (ex. 6) : ");
		int month = sc.nextInt();
		
		drawCalendar(year, month);
		
		sc.close();
				
	}

	public static void drawCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();
		
		int sweek = 0; //start week 그 달의 첫번째 날의 요일 (일 : 1, 월 : 2, ... 토 : 7)
		int eday = 0; // end day 그 달의 마지막 날짜
		
		//month 는 0 부터 시작, 
		cal.set(year, month - 1, 1);
		
		sweek = cal.get(Calendar.DAY_OF_WEEK); //day of week 요일값 상수로 정해져 있음 == get(7)
		eday = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println("   " + year + "년 " + month + "월");
		System.out.println(" 일 월 화 수 목 금 토 ");
		
		//1일 시작 전까지 공백
		for (int i = 1; i < sweek; i++) {
			//첫째 날이 출력되기 전까지 공백 출력
			System.out.print("   ");
		}
		
		//1일부터 마지막 날짜까지 출력
		for (int d = 1, w = sweek ; d <= eday; d++, w++) {
			System.out.print( d < 10? "  " + d : " " + d);
			//토요일이면, 줄바꿈
			if(w%7==0) System.out.println();
		}
		
	}
}
