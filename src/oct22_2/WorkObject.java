package oct22_2;

public class WorkObject {
	public synchronized void methodAA() {
		System.out.println("ThreadAA의 methodAA() 작업");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {
			
		}
	}
	
	public synchronized void methodBB() {
		System.out.println("ThreadBB의 methodBB() 작업");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {
			
		}
	}

}
