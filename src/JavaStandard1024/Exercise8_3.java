package JavaStandard1024;

public class Exercise8_3 {


}

class NumberException extends Exception{
	
}

class InvalidNumberException extends NumberException{
	
}

class NotANumberException extends NumberException{
	
}

class Parent{
	int a;
	int b;
	
	Parent(){
		this(0, 0);
	}
	
	Parent(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void add(int a, int b) throws InvalidNumberException, NotANumberException{			
		
	}
}

class Child extends Parent{
	Child(){
		
	}
	
	Child(int a, int b){
		super(a, b);
	}
	
	//자바의정석 63/476 오류난다는 부분인데 오류가안뜸
	void add(int a, int b) throws InvalidNumberException, NotANumberException {
		
	}
}


