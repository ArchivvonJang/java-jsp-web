package oop11.api;

import java.util.*;

public class ApiTest02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("�����");
		list.add("��ַ�");
		list.add("�ָ���");
		list.add("�̿Ϳ�");
		list.add("������");
		list.add("�����");
		
		System.out.println(list.size());
		
//		Iterator<String> iter = list.iterator(); 
//		
//		//�����ϸ� �����͸� �д´�. �׸��� �� ���� �а� �а�...
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
