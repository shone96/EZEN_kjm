package oct26;

import java.util.*;

public class SetRandom {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		
		for(int i = 0; i < 6; i++) {
			int randomNum = (int)(Math.random() * 45) + 1;
			set.add(randomNum);			
		}
		
		Iterator<Integer> iterator = set.iterator();
		
		while(true) {
			int randomNum = (int)(Math.random() * 45) + 1;
			set2.add(randomNum);
			int[] arr = new int[set.size()];
			int[] arr2 = new int[set2.size()];
			Iterator<Integer> iterator2 = set2.iterator();
			
			for(int i = 0; i < set.size(); i++) {
				arr[i] = iterator.next();
				arr2[i] = iterator2.next();
			}
			
			for(int i = 0; i < set.size(); i++) {
				arr[i] = iterator.next();
				arr2[i] = iterator2.next();
			}
			
			
			
			
		}
		
		

	}

}
