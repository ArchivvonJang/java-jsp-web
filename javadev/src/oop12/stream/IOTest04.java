package oop12.stream;

import java.io.File;
import java.util.Date;
//file method
public class IOTest04 {
	public static void main(String[] args) throws Exception{
		File f = new File("sample.txt");
		System.out.println("It is a File ? " + f.isFile());
		System.out.println("It is a Directory ? " + f.isDirectory());
		System.out.println("Name ? " + f.getName());
		System.out.println("AbsolutePath (절대경로) ? " + f.getAbsolutePath());
		System.out.println("Last modified date ? " + new Date(f.lastModified()));
		System.out.println("File size ? " + f.length() +" bytes");
		
		
		
	}
}
