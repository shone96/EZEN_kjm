package oct20;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		String str3 = "홍길동";
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"이름이 없습니다."));
		
		System.out.println(Objects.toString(str1) == str3);

	}

}
