package oct14;

public interface RemoteControl {
	//상수
	public final static int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	public String NAME = "홍길동";
	
	//추상메소드
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//default 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음");
		}else {
			System.out.println("무음 해제");
		}
	}
	
	
	//정적 메소드
	static void changeBettery() {
		System.out.println("건전지를 교환합니다.");
	}

}
