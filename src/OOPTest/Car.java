package OOPTest;

public class Car {
	protected int speed; //자동차 속도
	protected String name; //자동차 이름
	
	Car(){
		speed = 0;
		name = null;		
	}
	
	Car(String name){
		this.name = name;
	}

	public void speedUp() {
		speed ++;
	}
	
	public void speedDown() {
		speed --;
	}
	
	public void stop() {
		speed = 0;
	}
	
	public void display() {
		System.out.println("자동차 이름 : " + name + "속도 : " + speed);
	}
}
