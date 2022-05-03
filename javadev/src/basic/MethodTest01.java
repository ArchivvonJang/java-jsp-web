package basic;

public class MethodTest01 {
	public static void main(String[] args) {
		print();
		print("Joey");
		print("Chandler");
		
		int a = 9, b = 4; 
		
		System.out.println(a + " + " + b + " = " + add(a, b));
		System.out.println(a + " - " + b + " = " + sub(a, b));
		System.out.println(a + " * " + b + " = " + mul(a, b));
		System.out.println(a + " / " + b + " = " + div(a, b));
		System.out.println(a + " % " + b + " = " + mod(a, b));
	
	}

	private static int mod(int a, int b) {
		return a % b;
	}

	private static int div(int a, int b) {
		return a / b;
	}

	private static int mul(int a, int b) {
		return a * b;
	}

	private static int sub(int a, int b) {
		return a - b;
	}

	private static int add(int a, int b) {
		int c = a + b;//���� ���� : �޼ҵ� ������ ������ ���� 
		//return c;
		
		return a + b;
	}

	private static void print(String name) { //�Ű�����
		
		System.out.println("Hello "+ name);
	}

	//���ȭ�ؼ� ����
	private static void print() {
		System.out.println("Hello world");
		return; 
	}
	
}
