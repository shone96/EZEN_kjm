package Practice;

public class Car {

	String model;
	int speed;
	
	//생성자
	Car(String model){
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/*int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}*/
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 시속 " + speed + "km/h로 달립니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		
	}
	
	public Car(String model) {
		this(model, "은색");
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
	}*/

}
