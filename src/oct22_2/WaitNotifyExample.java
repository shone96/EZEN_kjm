package oct22_2;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadAA threadAA = new ThreadAA(sharedObject);
		ThreadBB threadBB = new ThreadBB(sharedObject);
		
		threadAA.start();
		threadBB.start();

	}

}
