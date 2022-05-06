package oop12.stream;

import java.io.File;
import java.io.FileWriter;

//문자열기반 스트림
public class IOTest06 {

	public static void main(String[] args) throws Exception{
		File f = new File("sample2.txt");
		FileWriter fw = new FileWriter(f);
		
		fw.write("Yes! I'm Wawa. " + "\r\n");
		fw.write("And so cute guy." + "\r\n");
		
		fw.flush();
		fw.close();
		
		System.out.println("File Save!");
	}

}
