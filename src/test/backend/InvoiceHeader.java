package test.backend;

public class InvoiceHeader {
 
	public InvoiceHeader(String number, String invoiceDate) {
		super();
		Number = number;
		InvoiceDate = invoiceDate;
	}
	public InvoiceHeader(String number, String invoiceDate, Subdivision subdivisionId) {
		super();
		Number = number;
		InvoiceDate = invoiceDate;
		SubdivisionId = subdivisionId;
	}
	public InvoiceHeader(Short id, String number, String invoiceDate, Subdivision subdivisionId) {
		super();
		this.id = id;
		Number = number;
		InvoiceDate = invoiceDate;
		SubdivisionId = subdivisionId;
	}
	public InvoiceHeader(Short id, String number, String invoiceDate) {
		super();
		this.id = id;
		Number = number;
		InvoiceDate = invoiceDate;
	}
	private Short id;
	private String Number;
	private String InvoiceDate;
	private Subdivision SubdivisionId;
	
	@Override
	public String toString() 
	{
		return  this.Number + " " + this.InvoiceDate;
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
	public Subdivision getSubdivisionId() {
		return SubdivisionId;
	}
	public void setSubdivisionId(Subdivision subdivisionId) {
		SubdivisionId = subdivisionId;
	}
	
}
