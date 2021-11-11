package oct22_2;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업");		
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}

}
