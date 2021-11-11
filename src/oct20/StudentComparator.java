package oct20;

import java.util.Comparator;

import oct20.ComparatorExample.Student;

public class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		if(a.sno < b.sno) {
			return -1;
		}else if(a.sno == b.sno) {
			return 0;
		}else {
			return 1;
		}
	}

}
