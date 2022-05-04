package oop06.inter06;

public class InterfaceTest {
	public static void main(String[] args) {
		InterImpl impl = new InterImpl();
		
		InterfaceA ia = impl; //InterfaceA 타입의 변수는 methodA()만 호출 가능
		ia.methodA(); 
		
		System.out.println();
		
		InterfaceB ib = impl; //InterfaceB 타입의 변수는 methodB()만 호출 가능
		ib.methodB(); 
		
		System.out.println();
		
		InterfaceC ic = impl; //InterfaceC타입의 변수는 methodA(),B(),C() 모두 호출 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
