package basic;

import java.util.Scanner;

//���������
public class OpTest01 {

    public static void main(String[] args) {
    	int a = 7;
    	int b = 4;
    	
        System.out.println(a + " + "+ b +" = " + a+b); 
        //7 + 4 = 74
        //������ ���ڿ� ���ϱ�� ���ڿ�
        
        System.out.println(a + " + "+ b +" = " + (a+b));
        //7 + 4 = 11
        
        System.out.println(a + " - "+ b +" = " + (a-b));
        System.out.println(a + " * "+ b +" = " + (a*b));
        System.out.println(a + " / "+ b +" = " + (a/b)); //intŸ���̶� �Ҽ��κ��� ������
        System.out.println(a + " % "+ b +" = " + (a%b));
        
        //�Է¹޾� ����ϱ�
        Scanner sc = new Scanner(System.in); //System.in �ܼ��Է�(ǥ���Է�). ��, Ű���� �Է��� �ǹ��Ѵ�.
        
        System.out.print("���� c �Է� : ");
        int c = sc.nextInt();
        System.out.print("���� d �Է� : ");
        int d = sc.nextInt();
        
        sc.close(); //����� �ڿ� �ݳ�
        
        int f = c + d;
        System.out.println(c + " + "+ d +" = " + f);
        System.out.println(c + " - "+ d +" = " + (c - d));
        System.out.println(c + " * "+ d +" = " + (c * d));
        System.out.println(c + " / "+ d +" = " + (c / d)); //intŸ���̶� �Ҽ��κ��� ������
        System.out.println(c + " % "+ d +" = " + (c % d));
        
        
	}
	
}
