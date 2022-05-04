package oop10.thread;

public class ThreadTest02 extends Thread {
	public static void main(String[] args) {
		
		//Thread를 상속받은 클래스의 객체를 만든다.
		ThreadTest02 t = new ThreadTest02();
		t.start(); //JVM이 새로운 스래드를 만들어서 동시에 실행되도록한다.
		
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
