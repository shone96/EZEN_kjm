package oct18_2;

public class Test {
	
	String s;
    Test() {
         s = "constructor";
    }
    void go() {
         System.out.println(s);
    }
	
	
	public static void main(String args[]) {
		Test t = new Test();
        t.go();
		/*
		 * for(int i = 1; i < 6; i++) { for(int j = 0; j < i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		/*String[] arr = {"*", "**", "***", "****", "*****"};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		
	}
    
}

