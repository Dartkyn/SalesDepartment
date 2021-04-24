package test.backend;

public class measureunit {

	private Short id;
	private String name;
	private String code;
	
	public measureunit(Short id, String name, String code) {
		   this.id = id;
		   this.name = name;
		   this.code = code;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
