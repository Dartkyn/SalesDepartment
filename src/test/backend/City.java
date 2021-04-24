package test.backend;

public class City {

	private Short id;
	private String name;
	public City(Short id, String name) {
		   this.id = id;
		   this.name = name;
		}
	@Override
	public String toString() 
	{
		return this.name;
	}
	public Short getId() {
		return id;
	}
	public void setId(Short id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
