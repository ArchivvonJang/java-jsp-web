package oop11.api;

import java.util.*;

public class ApiTest02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("오비비");
		list.add("김롸롸");
		list.add("최뫄뫄");
		list.add("이와와");
		list.add("강과과");
		list.add("오비비");
		
		System.out.println(list.size());
		
//		Iterator<String> iter = list.iterator(); 
//		
//		//존재하면 데이터를 읽는다. 그리고 그 옆에 읽고 읽고...
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		for(String str : list) {
			System.out.println(str);
		}
	}
}
