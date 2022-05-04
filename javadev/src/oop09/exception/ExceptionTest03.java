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
		
		
		//예외 객체 생성 -> 예외 발생
		throw new Exception("사용자 강제 예외 발생");

	}

}
