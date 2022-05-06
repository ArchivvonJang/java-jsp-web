package oop12.stream;

import java.io.*;

public class IOTest09 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = 0;
		long start = 0; 
		long end = 0;
		
		//보조스트림(BufferedOutputStream) 미사용
		fis = new FileInputStream("bike.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("bike2.png");
		
		start = System.currentTimeMillis();
		//read() : byte정보를 반환한다. 
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close(); //역순으로 close해준다.
		System.out.println("BufferedOutputStream 미사용 : " + (end - start) + "ms");

		
		//보조스트림(BufferedOutputStream) 사용
		fis = new FileInputStream("bike.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("bike3.png");
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		//read() : byte정보를 반환한다. 
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close(); //역순으로 close해준다.
		bos.close();
		System.out.println("BufferedOutputStream 사용 : " + (end - start) + "ms");
		
	}
}
