package oct20;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "번 객체의 finalize가 실행됨");
	}

}
