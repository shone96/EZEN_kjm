package oct18_2;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//익명 객체 필드 사용
		anony.field.turnOn();
		anony.field.turnOff();
		//익명 객체 로컬 변수 사용
		anony.method1();
		//익명 객체 매개값 사용
		anony.method2(
			new RemoteControl() {				
				@Override
				public void turnOn() {
					System.out.println("스마트티비를 켭니다.");
				
				}
				
				@Override
				public void turnOff() {
					System.out.println("스마트티비를 끕니다.");
					
				}					
			}
		
		);	

	}

}
