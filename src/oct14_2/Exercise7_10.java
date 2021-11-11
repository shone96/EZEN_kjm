package oct14_2;

public class Exercise7_10 {

	public static void main(String[] args) {
		Mytv2 t = new Mytv2();

		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
		//t.setVolume(20);
		//System.out.println("VOL: " + t.getVolume());
	}

}

class Mytv2{
	boolean isPoweron;
	int channel;
	int volume;
	int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANEL = 100;
	final int MIN_CHANEL = 1;
	public void setChannel(int channel) {	
		if(channel > MAX_CHANEL || channel < MIN_CHANEL) {
			return;
		}
		this.prevChannel = this.channel;
		this.channel = channel;
		
	}
	
	public int getChannel() {		
		return channel;
	}
	
	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME) {
			return;
		}
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
}
