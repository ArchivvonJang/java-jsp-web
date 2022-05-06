package oop11.api;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

//Properties Editor

public class ApiTest04 {
	public static void main(String[] args) {
		Properties pr = new Properties();
		FileInputStream f = null;
		
		//test.properties를 읽어서 pr로 넘겨준다. map처럼 저장된 정보를 출력한다.
		try {
			//properties 파일 객체 생성
			f = new FileInputStream("test.properties");
			//읽어온 정보를 pr로 넘겨주기
			pr.load(f);
			//iterator로 출력, Wild card :  <?> -> <? extends Object>
			Iterator<?> keyiter = pr.keySet().iterator(); // key = 사람 이름
			
			//다음 key가 있는 지 확인 후, 
			while(keyiter.hasNext()) {
				//Object type으로 읽어오기 때문에 형변환
				String key = (String) keyiter.next(); 
				//있다면 key와 value값을 출력
				System.out.println(key + " : " + pr.getProperty(key));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			//사용한 자원을 반납해준다.
			if(f!=null) try {f.close();}catch(Exception e) {} 
		}
	}
}
