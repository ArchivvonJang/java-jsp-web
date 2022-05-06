package oop12.stream;

import java.io.FileWriter;
import java.io.PrintWriter;
//PrintWriter , Writer
public class IOTest11c {
	public static void main(String[] args) throws Exception{
		//��´�� : �ܼ� -> ����
		FileWriter fw = new FileWriter("print2.txt");
		//PrintWriter ���
		PrintWriter pw = new PrintWriter(fw);// == System.out
		
		pw.println("[Print Buffered Stream][������ ���� ��Ʈ��]");
		pw.print("Hi! ");
		pw.println("How you doing? ");
		pw.println("I'm Joey. ");
		pw.println(20);
		
		pw.flush();
		pw.close();
		fw.close();
	}
}
