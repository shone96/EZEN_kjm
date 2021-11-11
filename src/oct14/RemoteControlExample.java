package oct14;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl.changeBettery();
		
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		RemoteControl rc1 = new Television();
		rc1.setMute(true);
		
		/*RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				
			}
			
			@Override
			public void turnOff() {
				
			}
			
			@Override
			public void setVolume(int volume) {
				
			}
		};*/


	}

}
