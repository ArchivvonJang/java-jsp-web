package oop08.singleton;

public class Singleton {
	//자기 자신을 반환할 수 있도록 선언
	private static Singleton singleton = null;
	
	//생성자
	private Singleton() {} //외부에서 사용하지 못하도록 막아준다.
	
	public static Singleton getInstance() {
		 //만들어지지 않은 상태라면 객체 생성 후 반환
		if(singleton == null) {
			singleton = new Singleton();
		}
		//이미 생성된 경우에는 바로 반환
		return singleton;
	}
	
}
