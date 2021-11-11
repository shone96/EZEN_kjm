package oct25_2;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		//String str = Util.compare("a", "b");
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(20.5, 10);
		System.out.println(result2);
		
		int result3 = Util.compare(20, 20);
		System.out.println(result3);

	}

}
