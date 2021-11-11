package OOPTest;

public class Taxi extends Car{
	private int charge; //택시요금
	private boolean fare; //할증여부
	private String company; //택시회사이름	
	
	Taxi(String company){
		this.company = company;
	}
	
	public void accounts() {		
		if(this.fare) {
			this.charge = speed * 10;			
		}else {
			this.charge = speed * 12;
		}
	}
	
	public void setFare(boolean fare) {
		if(fare) {
			this.fare = true;
		}else {
			this.fare = false;
		}
	}
	
	public void display() {
		System.out.println("택시회사이름 : " + this.company);
		System.out.println("요금 : " + this.charge);
		System.out.println("할증여부 : " + this.fare);
	}
	
}
