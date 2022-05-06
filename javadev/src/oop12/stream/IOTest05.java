package oop12.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest05 {
	public static void main(String[] args) throws Exception {
		String originalFileName = "sample.txt";
		String targetFileName = "copy.txt";
		
		FileInputStream fis = new FileInputStream(originalFileName); //��
		FileOutputStream fos = new FileOutputStream(targetFileName); //��
		
		//���� ����Ʈ ���� ��ȯ
		int readByteNo;
		byte[] readBytes = new byte[100]; //��ٱ���
		
		//���� ����Ʈ ���� ���Ϲ޾Ƽ� ��´�. 
		while((readByteNo = fis.read(readBytes)) != -1) {
			//A ~ B���� 26�� ���� ����Ʈ �� 
			//System.out.println("���� ����Ʈ �� readByteNo : " + readByteNo); 
			
			//0��°���� ����Ʈ������ ����Ѵ�.
			fos.write(readBytes, 0, readByteNo); 
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("���� �Ϸ�!");
	}
}
