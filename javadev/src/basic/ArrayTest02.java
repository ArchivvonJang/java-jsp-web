package basic;

public class ArrayTest02 {
	public static void main(String[] args) {
		//�迭�� �ʱ�ȭ�ϴ� �ٸ� ��� : �迭�� ��ü�� �����԰� ���ÿ� �ʱ�ȭ 
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
