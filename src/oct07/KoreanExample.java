package oct07;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("빅자바", "1111-5555");
		System.out.println("k1 name : " + k1.name);
		System.out.println("k1 ssn : " + k1.ssn);
		
		Korean k2 = new Korean("이자바", "33333-245555");
		System.out.println("k2 name : " + k2.name);
		System.out.println("k2 ssn : " + k2.ssn);
		
		Korean k3 = new Korean();
		System.out.println("k3 name : " + k3.name);
		System.out.println("k3 ssn : " + k3.ssn);
		System.out.println("k3 num : " + k3.num);
	}
}
