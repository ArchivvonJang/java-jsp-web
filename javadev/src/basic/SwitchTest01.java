package basic;
//Á¶°Ç¹® swtich
public class SwitchTest01 {
	public static void main(String[] args) {
	int n = 2;
	
	switch(n) {
		case 1:
			System.out.println("pop !");
			break;
		case 2:
			System.out.println("wow !");
			break;
		default : //== else
			System.out.println("Oops !");
			break;
	}
 }
}
