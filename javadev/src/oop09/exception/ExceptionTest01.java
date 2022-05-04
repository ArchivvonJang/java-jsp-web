package oop09.exception;

public class ExceptionTest01 {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.toString());
			
		} catch (NullPointerException e) {
			//java.lang.throwable
			//���ܰ� �߻��ؼ� ���޵Ǵ� ������ �ֿܼ� ���
			e.printStackTrace();
			//NullPointerException �̿��� ������ �߻��ϸ� �Ʒ��� catch�� �̵�!
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("finally block");
		}
		
		System.out.println("the end");
	}
}
