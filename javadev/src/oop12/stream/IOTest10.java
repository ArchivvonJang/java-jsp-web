package oop12.stream;

import java.io.*;

public class IOTest10 {
	public static void main(String[] args) throws Exception {
		//byte 기반 스트림
		InputStream is = System.in;
		//입력받아서 쓰기
		//보조스트림을 사용해서 바이트기반 -> 문자열기반스트림으로 변경
		Reader reader = new InputStreamReader(is);
		//한글자씩이 아니라 한 문장씩 (문자열)로 읽어올 수 있다.
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력 : ");
		String str = br.readLine();
		
		System.out.println("출력 : " + str);
		
		
		
	}
}
