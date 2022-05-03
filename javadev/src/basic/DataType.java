package basic;

public class DataType {

	public static void main(String[] args) {
		boolean b1 = false;
		System.out.println("boolean b1 = "+b1);
		
		//char c = 'A';
		char c = 65;
		System.out.println("char c = " + c);
		//위 결과는 char c = A 로 같다.
		
		char c1 = 54620;
		System.out.println("char c1 = " + c1); 
		//char c1 = 한
		
		byte b2 = 127;
		System.out.println("byte b2 = " + b2);
		
		short s = 32767;
		System.out.println("short s = " + s);
		
		int i = 2147483647;
		System.out.println("int i = " + i);
		
		long l1 = 2147483648l; //숫자는 리터럴이라고 하며, 먼저 int타입으로 인식한다. 그래서 옆에 l을 붙여 long타입이라고 알려준다. 
		System.out.println("long li = " + l1);
		
		double d = 3.1415326535;
		System.out.println("double d = " + d); //double d = 3.1415326535
		
		float f = 3.1415326535f; //리터럴을 double로 먼저 인식하기 때문에 에러가 발생한다. 그러므로 f를 붙여 float이라고 명시한다.
		System.out.println("float f = " + f); //float f = 3.1415327
		
		System.out.println("\"아이스아메리카노 주세요.\""); // \"문자열\" <-  escape sequence
		System.out.println("안녕하세요. \n줄바꿈 "); //줄바꿈
		System.out.println("0\t 1\t tab \t"); //tab 간격
		
		
	}

}
