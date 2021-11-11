package oct25_2;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hi");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(12345);
		int value = box2.get();

		System.out.println(str);
		System.out.println(value);
		System.out.println(12345 == value);
	}

}
