package JavaStandard1030;

public class Excercise9_10 {
	
	static String format(String str, int length, int alignment) {
		int diff = length - str.length();
		if(diff < 0) {
			return str.substring(0, length);			
		}
		
		char[] source= str.toCharArray();
		char[] chr = new char[length];
		for(int i = 0; i < chr.length; i++) {
			chr[i] = ' ';
		}
		
		switch(alignment) {
			case 0 :
			default :
				System.arraycopy(source, 0, chr, 0, source.length);
				break;
			case 1 :
				System.arraycopy(source, 0, chr, diff / 2, source.length);
				break;
			case 2 :
				System.arraycopy(source, 0, chr, diff, source.length);
				break;
		}
		
		
		return new String(chr);
		
	}

	public static void main(String[] args) {
		String str = "가나다";
		
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));

	}

}
