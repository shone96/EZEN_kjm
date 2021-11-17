package JavaStandard12;

public class Excercise12_1 {

	public static void main(String[] args) {
		Runnable task = new Thread1();
		Thread th1 = new Thread(task);
		
		th1.start();

	}

}

/*class Thread1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}*/
class Thread1 implements Runnable{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}