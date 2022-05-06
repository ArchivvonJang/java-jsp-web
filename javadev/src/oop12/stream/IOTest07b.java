package oop12.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//BufferedReader ���
public class IOTest07b {
	public static void main(String[] args) throws Exception{
		
		File f = new File("sample3.txt");
		FileReader fr = new FileReader(f);
		
		//���ڿ� ������ �о�´�.
		BufferedReader br = new BufferedReader(fr); 
		
		String data;
		while((data = br.readLine()) != null) {
			System.out.println(data);
		}
		
		br.close();
	}
}
