package oop12.stream;

import java.io.File;
//파일 객체 확인 및 생성
public class IOTest03 {
	public static void main(String[] args) throws Exception{
		File f = new File("abc.txt");
		
		if(f.exists()) {
			System.out.println("이미 파일이 존재합니다.");
		}else {
			f.createNewFile();
			System.out.println("파일을 새로 생성합니다.");
		}
	}
}
