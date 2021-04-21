package test.backend;

public class InvoiceHeader {
 
	public InvoiceHeader(Short id, String number, String invoiceDate, Short subdivisionId) {
		super();
		this.id = id;
		Number = number;
		InvoiceDate = invoiceDate;
		SubdivisionId = subdivisionId;
	}
	private Short id;
	private String Number;
	private String InvoiceDate;
	private Short SubdivisionId;
	
	@Override
	public String toString() 
	{
		return Short.toString(this.id) + " " + this.Number + " " + this.InvoiceDate + " " + this.SubdivisionId;
	}
	
	public Short getId() {
		return id;
	}
	public void setId(Short id) {
		this.id = id;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getInvoiceDate() {
		return InvoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		InvoiceDate = invoiceDate;
	}
	public Short getSubdivisionId() {
		return SubdivisionId;
	}
	public void setSubdivisionId(Short subdivisionId) {
		SubdivisionId = subdivisionId;
	}
	
}
