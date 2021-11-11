package JavaStandard1101;

public class Excercise10_1 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner.iv);
	}

}

class Outer{
	class Inner{
		int iv = 100;
	}
}