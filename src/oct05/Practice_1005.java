package oct05;

public class Practice_1005 {

	public static void main(String[] args) {
		//5-7
		/*		if(args.length != 1) {
					System.out.println("USAGE: java Exercise5_7 3120");
					System.exit(0);
				}
					// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
				int money = Integer.parseInt(args[0]);
				System.out.println("money="+money);
				int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
				int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
				
				for(int i=0;i<coinUnit.length;i++) {
					int coinNum = 0;
					 (1) 아래의 로직에 맞게 코드를 작성하시오.
					1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
					2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
					(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
					3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
					
					
					coinNum = money / coinUnit[i];					
					if(coin[i] <= coinNum) {
						coinNum = coin[i];
						money = money - coinUnit[i] * coin[i];
						coin[i] = coin[i] - coinNum;
					}else {
						money = money - coinUnit[i] * coinNum;
						coin[i] = coin[i] - coinNum;
					}
					
					System.out.println(coinUnit[i]+"원: "+coinNum);
					
					
				}
				if(money > 0) {
					System.out.println("거스름돈이 부족합니다.");
					System.exit(0); // 프로그램을 종료한다.
				}
					System.out.println("=남은 동전의 개수 =");
					
				for(int i=0;i<coinUnit.length;i++) {
					System.out.println(coinUnit[i]+"원:"+coin[i]);
				}
		*/
		//5-8
		/*int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		
		for(int i = 0; i < answer.length; i++) {
			
			 * if(answer[i] % 4 == 1) { counter[0] += 1; }else if(answer[i] % 4 == 2) {
			 * counter[1] += 1; }else if(answer[i] % 4 == 3) { counter[2] += 1; }else {
			 * counter[3] += 1; }
			 
			counter[answer[i] - 1]++;
		}
		
		for(int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);		
			for(int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}*/
		//5-9
		/*char[][] star = {
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'}
		};
		char[][] result = new char[star[0].length][star.length];
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				
				(1) 알맞은 코드를 넣어 완성하시오.
				
				int x = j;
				int y = star.length - i - 1;
						
				result[x][y] = star[i][j];				
			}
		}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}*/
		//5-10
		/*char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
						// 0   1   2   3   4   5   6   7   8   9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		String result = "";
			// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			
			(1) 알맞은 코드를 넣어 완성하시오.
			*					
			if('a' <= ch && ch <= 'z') {
				result += abcCode[ch - 'a'];
			}else if('0' <= ch && ch <= '9') {
				result += numCode[ch - '0'];
			}
			
			
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		*/
		//5-11
		/*int[][] score = {
			{100, 100, 100}
			, {20, 20, 20}
			, {30, 30, 30}
			, {40, 40, 40}
			, {50, 50, 50}
		};
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {				
			
			(1) 알맞은 코드를 넣어 완성하시오.
			
				result[i][j] = score[i][j];				
				result[i][score[0].length] += result[i][j];				
				result[score.length][j] += result[i][j];				
				result[score.length][score[0].length] += result[i][j];
				
			}
		}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}*/		
		String str1 = "1번";
		String str2 = "1번";
		
		String str3 = new String("2번");
		String str4 = new String("2번");
		
		System.out.println(str1 == str2);		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		

	}

}
