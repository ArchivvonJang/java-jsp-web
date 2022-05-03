package basic;

public class ArrayTest02 {
	public static void main(String[] args) {
		//배열을 초기화하는 다른 방법 : 배열의 객체를 생성함과 동시에 초기화 
		//int[] arr = new int[] {100,200,300};
		int[] arr = {100,200,300};
		
		for(int i : arr) {
			System.out.println(i);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+ i + "] = " + arr[i]);
		}
	}
}
