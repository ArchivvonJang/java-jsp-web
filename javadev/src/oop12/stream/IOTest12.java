package oop12.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IOTest12 {
	public static void main(String[] args) throws Exception{
		
		//Q10. BuffredReader , FileReader 를 사용해서 print.txt를 읽고 콘솔에 출력하시오.
		
		File f = new File("print.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		//BufferedReader br = new BufferedReader(new FileReader("print.txt"));
		
		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		fr.close();
	}
}	
