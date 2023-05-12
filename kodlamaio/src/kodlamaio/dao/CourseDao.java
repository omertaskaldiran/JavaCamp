package kodlamaio.dao;

import kodlamaio.entities.Course;

public class CourseDao {

 public	void joinCourse(Course course) {
		System.out.println( course.getName() +  " Kursuna katıldınız.");
	};
	
 public void exitCourse(Course course) {
		System.out.println(course.getName() + " Kursundan ayrıldınız.");
	};
	
	 public void updateCourse(Course course) {
			System.out.println(course.getName() + " Kursu güncellediniz");
		};

}
