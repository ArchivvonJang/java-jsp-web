package oop06.inter06;

public class InterfaceTest {
	public static void main(String[] args) {
		InterImpl impl = new InterImpl();
		
		InterfaceA ia = impl; //InterfaceA Ÿ���� ������ methodA()�� ȣ�� ����
		ia.methodA(); 
		
		System.out.println();
		
		InterfaceB ib = impl; //InterfaceB Ÿ���� ������ methodB()�� ȣ�� ����
		ib.methodB(); 
		
		System.out.println();
		
		InterfaceC ic = impl; //InterfaceCŸ���� ������ methodA(),B(),C() ��� ȣ�� ����
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
