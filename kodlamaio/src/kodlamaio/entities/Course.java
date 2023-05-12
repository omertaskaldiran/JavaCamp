package kodlamaio.entities;

public class Course {
	
	private String name;
	private String type;
	private int  time;
	private double price;

	public Course() {
		
	}

	public Course(String name, String type, int time , double price) {
		this.name = name;
		this.type = type;
		this.time = time;
		this.price= price;
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
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price)throws Exception {
		if(price >0) {
			this.price = price;
		}else {
			throw new Exception("Kurs ücreti 0 dan küçük olamaz.");
		}

	}

	@Override
	public String toString() {
		return "[name=" + name + ", type=" + type + ", time=" + time + ", price=" + price + "]";
	}

}
