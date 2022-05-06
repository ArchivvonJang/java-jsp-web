package oop11.api;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

//Properties Editor

public class ApiTest04 {
	public static void main(String[] args) {
		Properties pr = new Properties();
		FileInputStream f = null;
		
		//test.properties�� �о pr�� �Ѱ��ش�. mapó�� ����� ������ ����Ѵ�.
		try {
			//properties ���� ��ü ����
			f = new FileInputStream("test.properties");
			//�о�� ������ pr�� �Ѱ��ֱ�
			pr.load(f);
			//iterator�� ���, Wild card :  <?> -> <? extends Object>
			Iterator<?> keyiter = pr.keySet().iterator(); // key = ��� �̸�
			
			//���� key�� �ִ� �� Ȯ�� ��, 
			while(keyiter.hasNext()) {
				//Object type���� �о���� ������ ����ȯ
				String key = (String) keyiter.next(); 
				//�ִٸ� key�� value���� ���
				System.out.println(key + " : " + pr.getProperty(key));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			//����� �ڿ��� �ݳ����ش�.
			if(f!=null) try {f.close();}catch(Exception e) {} 
		}
	}
}
