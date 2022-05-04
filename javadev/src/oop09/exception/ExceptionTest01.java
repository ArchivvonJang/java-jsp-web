package oop09.exception;

public class ExceptionTest01 {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.toString());
			
		} catch (NullPointerException e) {
			//java.lang.throwable
			//예외가 발생해서 전달되는 과정을 콘솔에 출력
			e.printStackTrace();
			//NullPointerException 이외의 에러가 발생하면 아래의 catch로 이동!
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("finally block");
		}
		
		System.out.println("the end");
	}
}
