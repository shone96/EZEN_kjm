package oct15;

public class Car {
//	Tire frontLeftTire = new HankookTire();
//	Tire frontRightTire = new HankookTire();
//	Tire backRightTire = new HankookTire();
//	Tire backLeftTire = new HankookTire();
	Tire[] tires = {
			 new HankookTire()
			,new HankookTire()
			,new HankookTire()
			,new HankookTire()
	};
	
	void run() {
//		frontLeftTire.run();
//		frontRightTire.run();
//		backLeftTire.run();
//		backRightTire.run();
		for(Tire tire : tires) {
			tire.roll();
		}
	}

}
