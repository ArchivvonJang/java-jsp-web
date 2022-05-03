package basic;

public class OpTest10 {

	public static void main(String[] args) {
		//Q2. 4 ~ 15 사이의 임의의 정수를 반환한다.
		//                                     갯수
		System.out.println( (int)(Math.random()*12) + 4 ); 
		
		//Q3. 600부터 2300 사이의 100 단위 정수 발생
		// 6부터 23 사이의 갯수를 곱하고 100을 곱해준다.
		System.out.println( ((int)(Math.random()*18) + 6 ) * 100); 
		
		
	}

}
