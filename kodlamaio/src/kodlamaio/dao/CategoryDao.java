package kodlamaio.dao;

import kodlamaio.entities.Category;

public class CategoryDao {
	
	public void add(Category category) {
		System.out.println("Kategori eklendi :" + category.getName());
		
	}

	public void delete(Category category) {
		System.out.println("Kategori silindi : " + category.getName());
		
	}

	public void update(Category category) {
		System.out.println("Kategori guncellendi : " + category.getName());
		
	}

}
