package Practice;

public class Car1 {
	
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("가스가 " + gas + "남아 있습니다.");
				gas -= 1;
			}else {
				System.out.println("가스가 없습니다 : " + gas);
				return;
			}
		}
	}
	

}
