package oct18_2;

public class A {
	B field1 = new B();
	C field2 = new C();
	int field11;	
	static int field12;
	
	
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//static B field3 = new B();
	static C field4 = new C();
	
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	
	
	class B{
		void method() {
			field11 = 10;
			method1();
			
			field12 = 20;
			method2();
		}
	}
	
	static class C {
		void method() {
			//field11 = 10;
			//method1();
			
			field12 = 20;
			method2();
			
		}
	}

}
