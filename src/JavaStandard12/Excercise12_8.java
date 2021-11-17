package JavaStandard12;

public class Excercise12_8 {

	public static void main(String[] args) {
		Thread6_1 th1 = new Thread6_1();
		Thread6_2 th2 = new Thread6_2();
		
		th1.start();
		th2.start();

	}

}

class Thread6_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print('-');
			try {
				Thread.sleep(60);
			}catch(Exception e) {
				
			}
		}
	}
}
class Thread6_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print('|');
			try {
				Thread.sleep(60);
			}catch(Exception e) {
				
			}
		}
	}
}