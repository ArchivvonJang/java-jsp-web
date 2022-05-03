package basic;

public class MethodTest02 {
	public static void main(String[] args) {
		print(1);
		print(2, 3);
		print(4, 5, 6);
	}
	
	//가변인자 : 매개변수의 개수를 정하기 애매한 경우에 사용
	private static void print(int... arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	
//	private static void print(int i, int j, int k) {
//		System.out.println(i + "\t" + j + "\t" + k);
//	}
//
//	private static void print(int i, int j) {
//		System.out.println(i + "\t" + j);
//	}
//
//	private static void print(int i) {
//		System.out.println(i);
//	}
}
