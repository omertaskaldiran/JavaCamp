package kodlamaio;

import java.util.ArrayList;

import kodlamaio.bus.CategoryManager;
import kodlamaio.bus.CourseManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.dao.CategoryDao;
import kodlamaio.dao.CourseDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.tools.Hibernate;



public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		System.out.println("************************************************************************");

  		Course course1 = new Course();
  		course1.setName("Java");
  		course1.setPrice(2);
  		course1.setTime(250);
  		course1.setType("Yazılım Geliştirme");
  		
  		Course course2 = new Course();
  		course2.setName("JS");
  		course2.setPrice(2);
  		course2.setTime(270);
  		course2.setType("Yazılım Geliştirme");
  		
        ArrayList<Course> courseList = new ArrayList<>();
  		CourseManager courseManager = new CourseManager(new Hibernate(),loggers,courseList,new CourseDao());
		courseManager.joinCourse(course1);
		courseManager.joinCourse(course2);
		
		System.out.println("************************************************************************");
		
		Category category1= new Category();
		category1.setName("Yazılım");
		category1.setType("Online");
		
		Category category2= new Category();
		category2.setName("Donanım");
		category2.setType("Yerinde");

		ArrayList<Category> categoryList = new ArrayList<>();
		CategoryManager categoryManager =  new CategoryManager(new CategoryDao(), categoryList, loggers);
		categoryManager.addCategory(category1);
		categoryManager.addCategory(category2);

		System.out.println("************************************************************************");



	}

}
