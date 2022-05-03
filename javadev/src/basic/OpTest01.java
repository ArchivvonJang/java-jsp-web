package basic;

import java.util.Scanner;

//산술연산자
public class OpTest01 {

    public static void main(String[] args) {
    	int a = 7;
    	int b = 4;
    	
        System.out.println(a + " + "+ b +" = " + a+b); 
        //7 + 4 = 74
        //정수와 문자열 더하기는 문자열
        
        System.out.println(a + " + "+ b +" = " + (a+b));
        //7 + 4 = 11
        
        System.out.println(a + " - "+ b +" = " + (a-b));
        System.out.println(a + " * "+ b +" = " + (a*b));
        System.out.println(a + " / "+ b +" = " + (a/b)); //int타입이라 소수부분은 생략됨
        System.out.println(a + " % "+ b +" = " + (a%b));
        
        //입력받아 계산하기
        Scanner sc = new Scanner(System.in); //System.in 콘솔입력(표준입력). 즉, 키보드 입력을 의미한다.
        
        System.out.print("정수 c 입력 : ");
        int c = sc.nextInt();
        System.out.print("정수 d 입력 : ");
        int d = sc.nextInt();
        
        sc.close(); //사용한 자원 반납
        
        int f = c + d;
        System.out.println(c + " + "+ d +" = " + f);
        System.out.println(c + " - "+ d +" = " + (c - d));
        System.out.println(c + " * "+ d +" = " + (c * d));
        System.out.println(c + " / "+ d +" = " + (c / d)); //int타입이라 소수부분은 생략됨
        System.out.println(c + " % "+ d +" = " + (c % d));
        
        
	}
	
}
