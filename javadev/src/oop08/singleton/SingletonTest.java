package oop08.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		//Singleton s = new Singelton() 불가능
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		//같은 위치의 메모리값을 참조하고 있다면,
		if(s1 == s2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
