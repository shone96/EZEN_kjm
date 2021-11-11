package oct25;

import java.util.Arrays;

public class WildCardExample {

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workCourse = new Course<Worker>("직장인과정", 5);	
		workCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);		
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highstudentCourse = new Course<HighStudent>("고등학생 과정", 5);		
		highstudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workCourse);
		registerCourse(studentCourse);
		registerCourse(highstudentCourse);
		System.out.println();
		
		//registerCourseStudent(personCourse);
		//registerCourseStudent(workCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highstudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workCourse);
		//registerCourseWorker(studentCourse);
		//registerCourseWorker(highstudentCourse);
		System.out.println();
		

	}

}
