package kodlamaio.bus;

import java.util.ArrayList;

import kodlamaio.core.logging.Logger;
import kodlamaio.dao.CategoryDao;
import kodlamaio.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private ArrayList<Category> categories;
	private final Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, ArrayList<Category> categories,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers=loggers;
	} 
	
	public void addCategory(Category category) throws Exception {
		for (Category category1 : categories) {
			if(category.getName()== category1.getName()) {
				throw new Exception("Kategori ismi aynı olamaz.");
			}
		}
		
			categoryDao.add(category);
			categories.add(category);
			
			for (Logger logger : loggers) {
				logger.log(category.getName());
			}
		}

	}

