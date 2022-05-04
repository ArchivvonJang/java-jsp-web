package oop06.inter02;

public class BodySignTest {
	public static void main(String[] args) {
		BodySign bs = new Pitcher();
		bs.throwBall(BodySign.CENTER);
		bs.throwBall(BodySign.RIGHT);
		bs.throwBall(BodySign.LEFT);
		bs.throwBall(BodySign.DOWN);
		bs.throwBall(BodySign.UP);
		
		System.out.println("------------------------------");
		
		bs.throwBall(2);
		bs.throwBall(9);
	}
}
