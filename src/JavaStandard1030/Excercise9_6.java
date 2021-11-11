package JavaStandard1030;

public class Excercise9_6 {

	public static String fileZero(String src, int length) {
		if(src == null || src.length() == length) {
			return src;
		}else if(length <= 0) {
			return "";
		}else {
			if(length < src.length()) {
				return src.substring(0, length);
			}else {
				int[] arr = new int[length];
				String str = new String();
				for(int i = 0; i < arr.length - src.length(); i++) {
					str += 0;
				}
				return str + src;				
			}
		}
	}
	
	public static void main(String[] args) {
		String src = "12345";		
		System.out.println(fileZero(src, 10));
		System.out.println(fileZero(src, -1));
		System.out.println(fileZero(src, 3));

	}

}
