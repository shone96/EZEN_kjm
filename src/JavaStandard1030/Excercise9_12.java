package JavaStandard1030;

public class Excercise9_12 {

	static int getRand(int from, int to){
		System.out.println("11111111: " + (Math.abs(to-from)+1));
		System.out.println("2222222: " + Math.min(from,to));
		return (int)(Math.random() * (Math.abs(to-from)+1))+ Math.min(from,to);
		
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			System.out.print(getRand(-10, -3) + ",");
		}

	}

}
