package oop09.exception;

public class ExceptionTest03 {

	public static void main(String[] args) {
		try {
			throwException();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("The End");

	}

	private static void throwException() throws Exception {
		System.out.println("throwException() method start");
		
		
		//���� ��ü ���� -> ���� �߻�
		throw new Exception("����� ���� ���� �߻�");

	}

}
