package oct07;

public class Car {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		
	}
	
	public Car(String model) {
		this(model, "은색", 250);
		//this.model = model;
	}	
	
	public Car(String model, String color) {
		this(model, color, 270);
		//this.model = model;
		//this.color = color;
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
