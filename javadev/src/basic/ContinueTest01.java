package basic;

public class ContinueTest01 {

	public static void main(String[] args) {
		int sum = 0;
		int thirdSum = 0;
		int notThirdSum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			//3�� ���
			if(i%3==0) thirdSum+=i;
			//3�� ����� �ƴ� �͸� �հ�
			if(i%3!=0) continue;
				notThirdSum+=i;
				//continue : �ݺ��� �ȿ� continue ������ ������� �����ϰ� ���������� ����Ѵ�. 
		}

		System.out.println("1���� 10���� �հ�� " + sum); //55
		System.out.println(thirdSum); //18
		System.out.println(notThirdSum); //18
	}

}
