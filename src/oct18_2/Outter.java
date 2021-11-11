package oct18_2;

public class Outter {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method(); //중첩 객체 참조
			
			System.out.println(Outter.this.field);
			Outter.this.method(); //바깥 객체 참조
		}
	}

}
