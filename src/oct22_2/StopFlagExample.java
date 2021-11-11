package oct22_2;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printthread = new PrintThread1();
		printthread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		
		printthread.setStop(true);

	}

}
