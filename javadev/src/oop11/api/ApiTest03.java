package oop11.api;

import java.util.HashMap;
import java.util.Map;

public class ApiTest03 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		//Å°, °ª
		map.put("ÀÌ·Ö·Ö", "1234");
		map.put("±è¸ú¸ú", "3344");
		map.put("ÇÑºÁºÁ", "1233");
		map.put("ÃÖ¿Í¿Í", "1111");
		
		System.out.println(map.get("ÃÖ¿Í¿Í"));
		
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
