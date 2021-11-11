package oct19;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj = new Object();
		
		Date obj2 = new Date();
		
		System.out.println(obj.equals(obj.toString()));
		System.out.println(obj2);
		
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
		

	}

}
