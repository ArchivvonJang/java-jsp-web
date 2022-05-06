package oop10.thread;

public class ThreadTest04 extends Thread {
	public static void main(String[] args) {
		
		//Thread�� ��ӹ��� Ŭ������ ��ü�� �����.
		ThreadTest04 t = new ThreadTest04();
		//�����忡 �̸� �ο�
		t.setName("new Thread 1 ");
		t.start(); //JVM�� ���ο� �����带 ���� ���ÿ� ����ǵ����Ѵ�.
		
		for (int i = 1; i <= 5; i++) {
								//���� ������ �̸��� ���´�.
			System.out.println(Thread.currentThread().getName() + " = " + i);
			
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
			System.out.println(Thread.currentThread().getName() + " = " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
}
