package basic;

import java.util.Scanner;

public class OpTest08 {
	public static void main(String[] args) {
		//Q1. 정수를 입력받아 짝수인지 홀수인지 판별하시오. (삼항연산자)
		
		System.out.println("Q1. 정수를 입력받아 짝수인지 홀수인지 판별하시오. (삼항연산자)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오. -> ");
		int num = sc.nextInt();
		int result = num%2;
		
		System.out.print("결과 -> ");
		System.out.println(result == 0? "짝수" : "홀수");
		
		sc.close();
		
	}
}
