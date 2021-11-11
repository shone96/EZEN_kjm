package JavaStandard;

public class Exercise6_7 {

	public static void main(String[] args) {
		Mypoint p = new Mypoint(1, 1);
		
		System.out.println(p.getDistance(2,2));
	}
}

class Mypoint{
	int x;
	int y;
	
	Mypoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y) {
		return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
	}
}
