package test.backend;

public class Product {

	public Product(Short id, String name, String productCode) {
		super();
		this.id = id;
		this.name = name;
		ProductCode = productCode;
	}
	private Short id;
	private String name;
	private String ProductCode;
	
	@Override
	public String toString() 
	{
		return Short.toString(this.id) + " " + this.name + " " + this.ProductCode;
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
	public String getProductCode() {
		return ProductCode;
	}
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
}
