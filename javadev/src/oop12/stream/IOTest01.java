package oop12.stream;

import java.io.FileOutputStream;
//데이터(문자열) 쓰기
// Stream
public class IOTest01 {
	public static void main(String[] args) throws Exception {
		//byte stream
		FileOutputStream fos = new FileOutputStream("sample.txt");
		for (int i = 'A'; i <='Z' ; i++) {
			fos.write(i);
		}
		
		fos.close();
	}
}
