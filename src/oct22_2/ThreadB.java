package oct22_2;

public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업");		
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}

}
