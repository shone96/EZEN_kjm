package JavaStandard1111;

import java.text.DecimalFormat;

public class Excercise11_16 {

	public static void main(String[] args) {
		String data = "123,456,789.5";		
		System.out.println(data);
		data = data.replaceAll(",", "");
		System.out.println(Math.round(Double.parseDouble(data)));
		DecimalFormat df = new DecimalFormat("#,####");
		System.out.println(df.format(Math.round(Double.parseDouble(data))));
	}

}
