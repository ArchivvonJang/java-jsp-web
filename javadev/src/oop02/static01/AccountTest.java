package oop02.static01;

public class AccountTest {

	public static void main(String[] args) {
		
		
		Account acc1 = new Account(10000);
		System.out.println("acc1.money1 = " + acc1.money1);
		System.out.println("acc1.money2 = " + acc1.money2);

		
		Account acc2 = new Account(10000);
		System.out.println("acc2.money1 = " + acc2.money1);
		System.out.println("acc2.money2 = " + acc2.money2);

		
		Account acc3 = new Account(10000);
		System.out.println("acc3.money1 = " + acc3.money1);
		System.out.println("acc3.money2 = " + acc3.money2);

		//static이 붙은 money1는 특정한 객체의 고유한 값이 더 이상 아니기 때문에 클래스 이름 자체로 호출할 수 있다.
		System.out.println(Account.money1);
				
	}

}
