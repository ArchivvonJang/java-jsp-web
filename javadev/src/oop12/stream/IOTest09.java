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
		
		//������Ʈ��(BufferedOutputStream) �̻��
		fis = new FileInputStream("bike.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("bike2.png");
		
		start = System.currentTimeMillis();
		//read() : byte������ ��ȯ�Ѵ�. 
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close(); //�������� close���ش�.
		System.out.println("BufferedOutputStream �̻�� : " + (end - start) + "ms");

		
		//������Ʈ��(BufferedOutputStream) ���
		fis = new FileInputStream("bike.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("bike3.png");
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		//read() : byte������ ��ȯ�Ѵ�. 
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close(); //�������� close���ش�.
		bos.close();
		System.out.println("BufferedOutputStream ��� : " + (end - start) + "ms");
		
	}
}
