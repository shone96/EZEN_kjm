package JavaStandard;

public class Exercise6_22 {
	
	static boolean isNumber(String str) {
		if(str == null || str.equals("")) {
			return false;
		}
		
		/*try {
			int result = Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e){
			return false;			
		}*/
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {	
		//Exercise6_22 num = new Exercise6_22();
		String str = "123";
		//System.out.println(str+"는 숫자입니까? "+num.isNumber(str));
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str = "1234o";
		//System.out.println(str+"는 숫자입니까? "+num.isNumber(str));
		System.out.println(str+"는 숫자입니까? "+isNumber(str));

	}

}
