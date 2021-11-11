package Practice;

public class CarExample1 {

	public static void main(String[] args) {
		Car1 myCar1 = new Car1();
		
		myCar1.setGas(5);
		
		boolean gasState = myCar1.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar1.run();
		}
		
		if(myCar1.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");			
		}else {
			System.out.println("가스를 주입하세요.");
		}

	}

}
