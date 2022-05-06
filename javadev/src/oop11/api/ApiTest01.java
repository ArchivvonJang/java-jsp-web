package oop11.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ApiTest01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("�����");
		set.add("��ַ�");
		set.add("�ָ���");
		set.add("�̿Ϳ�");
		set.add("������");
		set.add("�����");
		
		System.out.println(set.size());
		Iterator<String> iter = set.iterator(); // hashset�� ������ �о�ͼ� ����� �� �ִ� ��ü�� ������ش�.
		
		//�����ϸ� �����͸� �д´�. �׸��� �� ���� �а� �а�...
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
