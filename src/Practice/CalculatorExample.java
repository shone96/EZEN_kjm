package Practice;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		double result1 = myCal.areaRectangle(7,4);
		double result2 = myCal.areaRectangle(7);
		
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);
		

	}

}
