package basic;

import java.util.Iterator;

public class ForTest02 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i < 4; i++) {
			sum += i;
		}

		System.out.println("1부터 3까지의 정수의 합계는 " + sum);
	}

}
