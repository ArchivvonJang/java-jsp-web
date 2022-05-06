package oop12.stream;

import java.io.File;
import java.io.FileReader;

public class IOTest07 {
	public static void main(String[] args) throws Exception{
		
		File f = new File("sample2.txt");
		FileReader fr = new FileReader(f);
		//FileReader fr = new FileReader("sample2.txt");
		
		int readCharNo;
		char[] cbuf = new char[100];
		
		//문자열 바이트수까지 읽어오기
		while((readCharNo = fr.read(cbuf)) != -1) {
			
			System.out.println("읽어온 글자(byte) 수 readCharNo : " + readCharNo);
			//문자열로 변환
			String data = new String(cbuf);
			System.out.print(data);
		}
		
		fr.close();
	}
}
