package oct07;

public class CarExample {
	public static void main(String args[]) {
		
		Car myCar = new Car();
		
		System.out.println("제작회사: " + myCar.company);
		
		myCar.company = "기아";
		System.out.println("변경된 제작회사: " + myCar.company);
		
		Car myCar1 = new Car();
		System.out.println("car1 : " + myCar1.company);
		System.out.println();
		
		Car myCar2 = new Car("K3");
		System.out.println("car2 : " + myCar2.company);
		System.out.println("car2 : " + myCar2.model);
		System.out.println();
		
		Car myCar3 = new Car("K5", "파랑");
		System.out.println("car3 : " + myCar3.company);
		System.out.println("car3 : " + myCar3.model);
		System.out.println("car3 : " + myCar3.color);
		System.out.println();
		
		Car myCar4 = new Car("K7", "빨강", 300);
		System.out.println("car4 : " + myCar4.company);
		System.out.println("car4 : " + myCar4.model);
		System.out.println("car4 : " + myCar4.color);
		System.out.println("car4 : " + myCar4.maxSpeed);

	}

}
