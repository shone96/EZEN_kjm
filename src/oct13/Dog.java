package oct13;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류1";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
