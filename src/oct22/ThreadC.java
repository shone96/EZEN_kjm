package oct22;

public class ThreadC extends Thread{
	public ThreadC() {
		
	}
	
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
