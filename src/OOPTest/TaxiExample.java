package OOPTest;

public class TaxiExample {

	public static void main(String[] args) {		
		Taxi taxi = new Taxi("μμΈνμ");
		
		taxi.setFare(true);		
		taxi.speedUp();
		taxi.speedUp();
		taxi.accounts();
		taxi.display();
		
		taxi.setFare(false);
		taxi.speedDown();
		taxi.accounts();
		taxi.display();

	}

}
