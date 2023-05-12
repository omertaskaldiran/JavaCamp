package kodlamaio.bus;

import java.util.ArrayList;

import kodlamaio.core.logging.Logger;
import kodlamaio.dao.CourseDao;
import kodlamaio.entities.Course;
import kodlamaio.tools.Orm;

public class CourseManager {
	
	private final Orm orm;
	private final Logger[] loggers;
	private ArrayList<Course> courses;
	private CourseDao courseDao;
	
	
    public CourseManager(Orm orm, Logger[] loggers , ArrayList<Course> courses,CourseDao courseDao) {
    	this.orm=orm;
		this.loggers=loggers;
		this.courses=courses;
		this.courseDao=courseDao;
	}

	public void joinCourse(Course course) throws Exception {
		for (Course course1 : courses) {
			if(course.getName()== course1.getName()) {
				throw new Exception("Kurs ismi zaten var");
			}
		}
		 
		orm.ormInformation();
		courseDao.joinCourse(course);
		courses.add(course);
		
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
  }

