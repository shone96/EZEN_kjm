package oct13;

public class Cat extends Animal{
	public Cat() {
		this.kind = "포유류2";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
