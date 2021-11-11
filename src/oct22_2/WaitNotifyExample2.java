package oct22_2;

public class WaitNotifyExample2 {

	public static void main(String[] args) {
		DataBox databox = new DataBox();
		
		ProducerThread prod = new ProducerThread(databox);
		ConsumerThread cons = new ConsumerThread(databox);
		
		prod.start();
		cons.start();

	}

}
