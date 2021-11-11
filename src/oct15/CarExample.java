package oct15;

public class CarExample {

	public static void main(String[] args) {
//		Car car = new Car();
//		
//		car.run();
		
//		car.frontLeftTire = new KumhoTire();
//		car.frontRightTire = new KumhoTire();
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
		
		
		//car.run();

	}

}
