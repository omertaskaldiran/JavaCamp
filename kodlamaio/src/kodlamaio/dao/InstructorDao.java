package kodlamaio.dao;

import kodlamaio.entities.Instructor;

public class InstructorDao {
	
	public void add(Instructor instructor) {
		System.out.println("Eğitmen eklendi : "+instructor.getName()+" "+instructor.getSurname());
		
	}

	public void delete(Instructor instructor) {
		System.out.println("Eğitmen silindi : "+instructor.getName()+" "+instructor.getSurname());
		
	}

	public void update(Instructor instructor) {
		System.out.println("Eğitmen güncellendi : "+instructor.getName()+" "+instructor.getSurname());
		
	}

}
