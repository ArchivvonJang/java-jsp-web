package oop10.thread;

public class ThreadTest04 extends Thread {
	public static void main(String[] args) {
		
		//Thread를 상속받은 클래스의 객체를 만든다.
		ThreadTest04 t = new ThreadTest04();
		//스레드에 이름 부여
		t.setName("new Thread 1 ");
		t.start(); //JVM이 새로운 스래드를 만들어서 동시에 실행되도록한다.
		
		for (int i = 1; i <= 5; i++) {
								//현재 스레드 이름을 얻어온다.
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
