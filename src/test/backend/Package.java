package test.backend;

public class Package {


	public Package(Short id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() 
	{
		return Short.toString(this.id) + " " + this.name;
	}
	private Short id;
	private String name;
	
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
