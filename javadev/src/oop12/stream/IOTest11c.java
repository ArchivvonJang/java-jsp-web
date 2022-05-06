package oop12.stream;

import java.io.FileWriter;
import java.io.PrintWriter;
//PrintWriter , Writer
public class IOTest11c {
	public static void main(String[] args) throws Exception{
		//출력대상 : 콘솔 -> 파일
		FileWriter fw = new FileWriter("print2.txt");
		//PrintWriter 사용
		PrintWriter pw = new PrintWriter(fw);// == System.out
		
		pw.println("[Print Buffered Stream][프린터 보조 스트림]");
		pw.print("Hi! ");
		pw.println("How you doing? ");
		pw.println("I'm Joey. ");
		pw.println(20);
		
		pw.flush();
		pw.close();
		fw.close();
	}
}
