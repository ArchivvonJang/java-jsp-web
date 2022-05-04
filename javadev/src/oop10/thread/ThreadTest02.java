package oop10.thread;

public class ThreadTest02 extends Thread {
	public static void main(String[] args) {
		
		//Thread�� ��ӹ��� Ŭ������ ��ü�� �����.
		ThreadTest02 t = new ThreadTest02();
		t.start(); //JVM�� ���ο� �����带 ���� ���ÿ� ����ǵ����Ѵ�.
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("main = " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("run = " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
}
