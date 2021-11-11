package oct07;

public class DivideExample {

	public static void main(String[] args) {
		Divide num = new Divide();
		
		num.poweron();
		System.out.println(num.divide(10, 5));
		
		int x = 100;
		int y = 10;
		
		System.out.println(num.divide(x, y));

	}

}
