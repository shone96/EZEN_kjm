package oct26;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 개수: " + set.size());

	}

}
