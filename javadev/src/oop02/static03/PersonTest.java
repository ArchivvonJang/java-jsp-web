package oop02.static03;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("Julia Smith", "USA");
		Person p2 = new Person("��Ϳ�", "Korea");
		
		//System.out.println(p1.toString());
		//System.out.println(p2.toString());
		
		System.out.println(p1); //���������θ� ȣ�����൵ �޼ҵ带 �ҷ��´�. 
		System.out.println(p2);
		
		System.out.println("-------------------------------------------");
		
		p2.setName("Wawa Kim");
		p2.setNation("Russia");
		
		System.out.println(p1); 
		System.out.println(p2);
		
	}

}
