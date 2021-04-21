package test.backend;

public class InvoiceString {
	public InvoiceString(Short id, Short amount, Short invoiceHeaderID, Short productID, Double grossWeight,
			Double netWeight, Double vAT, Short structureUnitID, Short packageID) {
		super();
		this.id = id;
		setAmount(amount);
		InvoiceHeaderID = invoiceHeaderID;
		ProductID = productID;
		GrossWeight = grossWeight;
		NetWeight = netWeight;
		VAT = vAT;
		StructureUnitID = structureUnitID;
		PackageID = packageID;
	}
	private Short id;
	private Short Amount;
	private Short InvoiceHeaderID;
	private Short ProductID;
	private Double GrossWeight;
	private Double NetWeight;
	private Double VAT;
	private Short StructureUnitID;
	private Short PackageID;
	
	
	public Short getId() {
		return id;
	}
	public void setId(Short id) {
		this.id = id;
	}
	public Short getInvoiceHeaderID() {
		return InvoiceHeaderID;
	}
	public void setInvoiceHeaderID(Short invoiceHeaderID) {
		InvoiceHeaderID = invoiceHeaderID;
	}
	public Short getProductID() {
		return ProductID;
	}
	public void setProductID(Short productID) {
		ProductID = productID;
	}
	public Double getGrossWeight() {
		return GrossWeight;
	}
	public void setGrossWeight(Double grossWeight) {
		GrossWeight = grossWeight;
	}
	public Double getVAT() {
		return VAT;
	}
	public void setVAT(Double vAT) {
		VAT = vAT;
	}
	public Double getNetWeight() {
		return NetWeight;
	}
	public void setNetWeight(Double netWeight) {
		NetWeight = netWeight;
	}
	public Short getStructureUnitID() {
		return StructureUnitID;
	}
	public void setStructureUnitID(Short structureUnitID) {
		StructureUnitID = structureUnitID;
	}
	public Short getPackageID() {
		return PackageID;
	}
	public void setPackageID(Short packageID) {
		PackageID = packageID;
	}
	public Short getAmount() {
		return Amount;
	}
	public void setAmount(Short amount) {
		Amount = amount;
	}
}
