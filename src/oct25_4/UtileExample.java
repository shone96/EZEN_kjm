package oct25_4;

public class UtileExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childpair = new ChildPair<>("홍삼원", 20);
		Integer childage = Util.getValue(childpair, "홍삼순");
		System.out.println(childage);

	}

}
