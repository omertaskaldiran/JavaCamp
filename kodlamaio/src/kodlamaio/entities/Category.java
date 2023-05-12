package kodlamaio.entities;

public class Category {
	
	private String name;
	private String type;
	
	public Category() {
		
	}

	public Category(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + ", type=" + type + "]";
	}

}
