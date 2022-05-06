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
		
		//���ڿ� ����Ʈ������ �о����
		while((readCharNo = fr.read(cbuf)) != -1) {
			
			System.out.println("�о�� ����(byte) �� readCharNo : " + readCharNo);
			//���ڿ��� ��ȯ
			String data = new String(cbuf);
			System.out.print(data);
		}
		
		fr.close();
	}
}
