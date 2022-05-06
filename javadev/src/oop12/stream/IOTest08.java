package oop12.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
//���� ��Ʈ�� : BufferedInputStream ,BufferedOutputStream 
public class IOTest08 {
	public static void main(String[] args) throws Exception {
		//�ð� ����
		long start = 0;
		long end = 0;
		
		//������Ʈ�� �̻��
		FileInputStream fis1 = new FileInputStream("bike.png");
		start = System.currentTimeMillis();//�ð����� ����
		//�̹��� �б�
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();//�ð����� ����
		System.out.println("BufferedInputStream �̻�� : " + (end - start) + "ms");
		fis1.close();
		
		//������Ʈ�� ��� 
		FileInputStream fis2 = new FileInputStream("bike.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		//�ð����� ����
		start = System.currentTimeMillis();
		//�̹��� �б�
		while(bis.read() != -1) {}
		//�ð����� ����
		end = System.currentTimeMillis();
		System.out.println("BufferedInputStream ��� : " + (end - start) + "ms");
		bis.close();
		fis2.close();
		
	}
}
