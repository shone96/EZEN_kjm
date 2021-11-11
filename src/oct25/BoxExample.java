package oct25;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();

		System.out.println(name);
		System.out.println(apple);
	}

}
