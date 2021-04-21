package test.backend;

public class Subdivision {
	
	public Subdivision(Short id, String name, String subdivisionCode) {
		super();
		this.id = id;
		this.name = name;
		SubdivisionCode = subdivisionCode;
	}
	private Short id;
	private String name;
	private String SubdivisionCode;
	
	@Override
	public String toString() 
	{
		return Short.toString(this.id) + " " + this.name + " " + this.SubdivisionCode;
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
	public String getSubdivisionCode() {
		return SubdivisionCode;
	}
	public void setProductCode(String subdivisionCode) {
		SubdivisionCode = subdivisionCode;
	}

}
