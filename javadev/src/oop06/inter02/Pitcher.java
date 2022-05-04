package oop06.inter02;

public class Pitcher implements BodySign{

	@Override
	public void throwBall(int how) {
		String str = null; // null 객체 메모리 주소값을 참조하지 않고 있는 상태
		
		switch(how) {
			case BodySign.CENTER: 
				str = "가운데";
				break;
			
			case BodySign.LEFT: 
				str = "왼";
				break;
			
			case BodySign.RIGHT: 
				str = "오른";
				break;
			
			case BodySign.DOWN: 
				str = "아래";
				break;
			
			case BodySign.UP: 
				str = "위";
				break;
			
			default: str="잘못된";
				break;
		}
		
		System.out.println("공을 "+ str + "쪽으로 던집니다.");
	}

}
