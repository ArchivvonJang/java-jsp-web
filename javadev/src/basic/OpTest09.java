package basic;
//형변환 casting
public class OpTest09 {

	public static void main(String[] args) {
		//자동형변환 int -> double
		double d = 10; 
		//System.out.println(d); //10.0
		
		//강제형변환
		//데이터가 소실될 위험이 있는 경우에는 컴파일러가 자동으로 형변환하지 않는다.
		int i = (int) 3.141592; 
		
		//System.out.println(i); //3
		
		//임의의 주사위 값 구하기 
		System.out.println( (int) Math.random() * 6 + 1); //0.0 ≤ n < 1.0 사이의 임의의 양의 실수 n을 반환한다.
		
		//0.9999999999 * 6 (주사위의 숫자 갯수 6) 
		// -> 5.999999 
		// -> (int) 강제 형변환하면 0부터 5 사이의 임의의 정수를 얻어올 수 있다. 
		
		// 1. 구하고자 하는 가지 수를 곱한 후, 강제 형변환으로 소수점 이하를 잘라낸다.
		// 2. 시작하는 숫자를 더한다. (주사위는 1부터 시작하니까 +1)
		
	}

}
