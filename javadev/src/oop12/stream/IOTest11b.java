package oop12.stream;

import java.io.FileOutputStream;
import java.io.PrintStream;
//PrintStream , OutputStream 
public class IOTest11b {
	public static void main(String[] args) throws Exception{
		//출력대상 : 콘솔 -> 파일
		FileOutputStream fos = new FileOutputStream("print.txt");
		//생성자에 file을 입력해 file에 문자열을 출력
		PrintStream ps = new PrintStream(fos);// == System.out
		
		ps.println("[Print Buffered Stream][프린터 보조 스트림]");
		ps.print("Hi! ");
		ps.println("How you doing? ");
		ps.println("I'm Joey. ");
		ps.println(20);
		
		ps.flush();
		ps.close();
		fos.close();
	}
}
