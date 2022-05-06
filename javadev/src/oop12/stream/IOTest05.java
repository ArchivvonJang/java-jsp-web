package oop12.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest05 {
	public static void main(String[] args) throws Exception {
		String originalFileName = "sample.txt";
		String targetFileName = "copy.txt";
		
		FileInputStream fis = new FileInputStream(originalFileName); //복
		FileOutputStream fos = new FileOutputStream(targetFileName); //붙
		
		//읽은 바이트 수를 반환
		int readByteNo;
		byte[] readBytes = new byte[100]; //장바구니
		
		//읽은 바이트 수를 리턴받아서 담는다. 
		while((readByteNo = fis.read(readBytes)) != -1) {
			//A ~ B까지 26자 읽은 바이트 수 
			//System.out.println("읽은 바이트 수 readByteNo : " + readByteNo); 
			
			//0번째부터 바이트수까지 출력한다.
			fos.write(readBytes, 0, readByteNo); 
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사 완료!");
	}
}
