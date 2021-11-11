package sep30;

public class Practice {

	public static void main(String[] args) {
		/*
		 * int value = (int) (Math.random() * 6) + 1;
		 * 
		 * System.out.println("value : " + value);
		 */
		//4-8
		/*for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				int sum = (2 * x) + (4 * y);
				if(sum == 10) {
					System.out.println("x = " + x + "," + "y = " + y);
				}
			}
		}*/
		//4-9
		/*String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			//sum += Integer.parseInt(str.charAt(i) + "");
			sum += str.charAt(i) - '0';
			
		}
		System.out.println(sum);*/
		//4-10
		/*int num = 12345;
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num = num / 10;			
		}
		
		System.out.println("sum : " + sum);*/
		
		//4-11
		/*int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + ", " + num2);
		
		for(int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
			
		}*/
		//4-12
		/*for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 4; j++) {
				int x = j + 1 + (i - 1) / 3 * 3;
				int y = i % 3 == 0 ? 3 : i % 3;
				
				if(x > 9) {
					break;
				}
				
				System.out.print(x + "*" + y + "=" + x*y + "\t");
			}	
			System.out.println();
			if(i % 3 == 0) {
				System.out.println();
			}
		}*/
		//4-13
		/*String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i = 0; i < value.length(); i++) {			
			if(value.charAt(i) + ch > 127) {
				isNumber = false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value + "는 숫자입니다.");
		}else {
			System.out.println(value + "는 숫자가 아닙니다.");			
		}*/		
		
		
		
		
		
		
		
	}

}
