package basic;

import java.util.Iterator;

public class ArrayTest03 {

	public static void main(String[] args) {
		//int[��][��]
		int[][] score = {
				{100, 90, 80, 70},
				{90, 80, 30, 30},
				{100, 50, 90, 30}
		};
		//2�����迭�� ���̴� �� �ȿ� ����ִ� 1���� �迭�� ���� (3)
		//System.out.println("score.length = " + score.length); 
		
		System.out.println("\t\t [����ǥ] ");
		System.out.println("===========================================");
		System.out.println("����\t����\t����\tö��\t����\t���");
		
		
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
