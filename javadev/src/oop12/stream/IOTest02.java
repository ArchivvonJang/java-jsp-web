package oop12.stream;

import java.io.FileInputStream;
//데이터(문자열) 읽어오기 
public class IOTest02 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("sample.txt");
		
		int data;
		
		while((data = fis.read()) != -1) {
			System.out.print((char) data);
		}
		
		fis.close();
	}
}
