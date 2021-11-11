package oct22_2;

public class ThreadBB extends Thread{
	private WorkObject workObject;
	
	public ThreadBB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodBB();
		}
	}

}
