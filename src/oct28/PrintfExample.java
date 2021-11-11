package oct28;

import java.util.Date;

public class PrintfExample {

	public static void main(String[] args) {
		System.out.printf("상품의 가격 : %d원\n", 123);
		System.out.printf("상품의 가격 : %6d원\n", 123);
		System.out.printf("상품의 가격 : %-3d원\n", 123);
		System.out.printf("상품의 가격 : %08d원\n", 123);
		
		System.out.printf("반지름이 %d인 원의 넓이 : %5.5f\n", 10, Math.PI*10*10);
		System.out.printf("반지름이 %d인 원의 넓이 : %10.5f\n", 10, Math.PI*10*10);
		System.out.printf("반지름이 %d인 원의 넓이 : %15.5f\n", 10, Math.PI*10*10);
		
		
		System.out.printf("%6d | %-10s | %10s\n", 1, "홍길동", "도적");
		
		Date now = new Date();
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다\n", now, now, now);
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다\n", now);
		System.out.printf("오늘은 %2$tH시 %1$tM분 %1$tS초 입니다\n", now, now);
		
		

	}

}
