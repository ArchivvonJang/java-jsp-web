package oop06.inter02;

public class Pitcher implements BodySign{

	@Override
	public void throwBall(int how) {
		String str = null; // null ��ü �޸� �ּҰ��� �������� �ʰ� �ִ� ����
		
		switch(how) {
			case BodySign.CENTER: 
				str = "���";
				break;
			
			case BodySign.LEFT: 
				str = "��";
				break;
			
			case BodySign.RIGHT: 
				str = "����";
				break;
			
			case BodySign.DOWN: 
				str = "�Ʒ�";
				break;
			
			case BodySign.UP: 
				str = "��";
				break;
			
			default: str="�߸���";
				break;
		}
		
		System.out.println("���� "+ str + "������ �����ϴ�.");
	}

}
