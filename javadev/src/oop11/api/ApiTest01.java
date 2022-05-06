package oop11.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ApiTest01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("오비비");
		set.add("김롸롸");
		set.add("최뫄뫄");
		set.add("이와와");
		set.add("강과과");
		set.add("오비비");
		
		System.out.println(set.size());
		Iterator<String> iter = set.iterator(); // hashset에 정보를 읽어와서 사용할 수 있는 객체를 만들어준다.
		
		//존재하면 데이터를 읽는다. 그리고 그 옆에 읽고 읽고...
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
