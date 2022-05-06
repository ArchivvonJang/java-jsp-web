package oop10.thread;

//복수의 스레드
public class ThreadTest05 extends Thread {
	public static void main(String[] args) {
		
		//Thread를 상속받은 클래스의 객체를 만든다.
		ThreadTest05 t1 = new ThreadTest05();
		ThreadTest05 t2 = new ThreadTest05();
		ThreadTest05 t3 = new ThreadTest05();
		//스레드에 이름 부여
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		t1.start(); 
		t2.start(); 
		t3.start(); 
		
	
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
