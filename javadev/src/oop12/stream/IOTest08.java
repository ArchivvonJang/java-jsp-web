package oop12.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
//보조 스트림 : BufferedInputStream ,BufferedOutputStream 
public class IOTest08 {
	public static void main(String[] args) throws Exception {
		//시간 측정
		long start = 0;
		long end = 0;
		
		//보조스트림 미사용
		FileInputStream fis1 = new FileInputStream("bike.png");
		start = System.currentTimeMillis();//시간측정 시작
		//이미지 읽기
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();//시간측정 종료
		System.out.println("BufferedInputStream 미사용 : " + (end - start) + "ms");
		fis1.close();
		
		//보조스트림 사용 
		FileInputStream fis2 = new FileInputStream("bike.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		//시간측정 시작
		start = System.currentTimeMillis();
		//이미지 읽기
		while(bis.read() != -1) {}
		//시간측정 종료
		end = System.currentTimeMillis();
		System.out.println("BufferedInputStream 사용 : " + (end - start) + "ms");
		bis.close();
		fis2.close();
		
	}
}
