package oct22;

public class ThreadStateExample {

	public static void main(String[] args) {
		StatPrintThread statprintthread = new StatPrintThread(new TargetThread());
		statprintthread.start();

	}

}
