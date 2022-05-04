package oop09.exception;

public class ExceptionTest02 {
	public static void main(String[] args) {
		throwException();
		
		System.out.println("The End");
	}

	private static void throwException() {
		System.out.println("throwException() method start");
		
		try {
			//예외 객체 생성 -> 예외 발생
			throw new Exception("사용자 강제 예외 발생");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("throwException() method end");
		
	}
}
