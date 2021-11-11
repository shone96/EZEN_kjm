package oct25_3;

public class Container<T, M> {
	private T key;
	private M value;
	
	public T getKey() {
		return this.key;
	}
	public M getValue() {
		return this.value;
	}
	public void set(T key, M value) {
		this.key = key;
		this.value = value;		
	}	

}
