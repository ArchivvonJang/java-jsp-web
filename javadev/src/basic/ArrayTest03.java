package basic;

import java.util.Iterator;

public class ArrayTest03 {

	public static void main(String[] args) {
		//int[행][열]
		int[][] score = {
				{100, 90, 80, 70},
				{90, 80, 30, 30},
				{100, 50, 90, 30}
		};
		//2차원배열의 길이는 그 안에 들어있는 1차원 배열의 길이 (3)
		//System.out.println("score.length = " + score.length); 
		
		System.out.println("\t\t [성적표] ");
		System.out.println("===========================================");
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		
		
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		for (int row = 0; row < score.length; row++) {
			
			for (int col = 0; col < score[row].length; col++) {
				//System.out.print("row :" + row + " / col : " + col + "\t");
				System.out.print(score[row][col] + "\t");
				sum += score[row][col];	
				cnt ++; //score[row].length
			
			}
			avg = (double)sum / cnt;
			System.out.println(sum +"\t" +avg);
		}
		System.out.println("===========================================");
	}

}
