package oop12.stream;

import java.io.*;

public class IOTest10 {
	public static void main(String[] args) throws Exception {
		//byte ��� ��Ʈ��
		InputStream is = System.in;
		//�Է¹޾Ƽ� ����
		//������Ʈ���� ����ؼ� ����Ʈ��� -> ���ڿ���ݽ�Ʈ������ ����
		Reader reader = new InputStreamReader(is);
		//�ѱ��ھ��� �ƴ϶� �� ���徿 (���ڿ�)�� �о�� �� �ִ�.
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("�Է� : ");
		String str = br.readLine();
		
		System.out.println("��� : " + str);
		
		
		
	}
}
