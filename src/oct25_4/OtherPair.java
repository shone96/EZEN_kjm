package oct25_4;

public class OtherPair<T, M> {
	private T key;
	private M value;
	
	public OtherPair(T key, M value) {
		this.key = key;
		this.value = value;
	}
	
	public T getKey() {
		return key;
	}
	public M getValue() {
		return value;
	}
}
