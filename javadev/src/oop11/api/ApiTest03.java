package oop11.api;

import java.util.HashMap;
import java.util.Map;

public class ApiTest03 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		//Ű, ��
		map.put("�̷ַ�", "1234");
		map.put("�����", "3344");
		map.put("�Ѻ���", "1233");
		map.put("�ֿͿ�", "1111");
		
		System.out.println(map.get("�ֿͿ�"));
		
//		Iterator<String> iter = map.keySet().iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			System.out.println(key + " : " + map.get(key));
//		}
		
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
