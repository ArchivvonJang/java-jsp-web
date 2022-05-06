package oop12.stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class IOTest06b {

	public static void main(String[] args) throws Exception{
		File f = new File("sample3.txt");
		FileWriter fw = new FileWriter(f);
		//���ڿ� ������ ����
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Yes! I'm Wawa. ");
		bw.newLine(); //�ü���� �´� ���������� ����
		bw.write("And so cute guy. How you doing?" );
		
		bw.flush();
		bw.close();
		
		System.out.println("File Save!");
	}

}
