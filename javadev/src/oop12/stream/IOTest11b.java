package oop12.stream;

import java.io.FileOutputStream;
import java.io.PrintStream;
//PrintStream , OutputStream 
public class IOTest11b {
	public static void main(String[] args) throws Exception{
		//��´�� : �ܼ� -> ����
		FileOutputStream fos = new FileOutputStream("print.txt");
		//�����ڿ� file�� �Է��� file�� ���ڿ��� ���
		PrintStream ps = new PrintStream(fos);// == System.out
		
		ps.println("[Print Buffered Stream][������ ���� ��Ʈ��]");
		ps.print("Hi! ");
		ps.println("How you doing? ");
		ps.println("I'm Joey. ");
		ps.println(20);
		
		ps.flush();
		ps.close();
		fos.close();
	}
}
