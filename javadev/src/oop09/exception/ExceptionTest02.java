package oop09.exception;

public class ExceptionTest02 {
	public static void main(String[] args) {
		throwException();
		
		System.out.println("The End");
	}

	private static void throwException() {
		System.out.println("throwException() method start");
		
		try {
			//���� ��ü ���� -> ���� �߻�
			throw new Exception("����� ���� ���� �߻�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("throwException() method end");
		
	}
}
