package JavaStandard1101;

public class Excercise10_2 {

	public static void main(String[] args) {
		Outer1.Inner inter = new Outer1.Inner();
		System.out.println(inter.iv);
		

	}

}

class Outer1{
	static class Inner{
		int iv = 200;
	}
}