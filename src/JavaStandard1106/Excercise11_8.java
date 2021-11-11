package JavaStandard1106;

import java.util.*;

public class Excercise11_8 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list);
		
		int prevRank = - 1;
		int prevTotal = - 1;
		int length = list.size();
		
		for(int i = 0; i < length; i++) {
			Student1 s = (Student1) list.get(i);			
			
			if(s.total == prevTotal) {
				s.schoolRank = prevRank;
			}else {
				s.schoolRank = i + 1;
			}
			
			prevRank = s.schoolRank;
			prevTotal = s.total;
			
		}		
	}
	
	public static void main(String[] args) {		
		ArrayList list = new ArrayList();
		list.add(new Student1("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student1("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student1("김자바", 1, 2, 80, 80, 90));
		list.add(new Student1("이자바", 2, 1, 70, 90, 70));
		list.add(new Student1("박자바", 2, 2, 60, 100, 80));
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

class Student1 implements Comparable{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;	
	int total;
	int schoolRank;
	
	Student1(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor + eng + math;
	}
	
	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student1) {
			Student1 s1 = (Student1) o;
			return s1.total - this.total;
		}else {
			return -1;			
		}
	}
	
	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage() + "," + schoolRank;
	}
}
