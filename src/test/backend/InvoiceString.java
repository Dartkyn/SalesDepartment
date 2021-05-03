package test.backend;

public class InvoiceString {
	public InvoiceString(Short id, Short amount, Double costUnitProduct, InvoiceHeader invoiceHeaderID,
			Product productID, Double grossWeight, Double netWeight, Double vAT, Package packageID) {
		super();
		this.id = id;
		Amount = amount;
		CostUnitProduct = costUnitProduct;
		InvoiceHeaderID = invoiceHeaderID;
		ProductID = productID;
		GrossWeight = grossWeight;
		NetWeight = netWeight;
		VAT = vAT;
		PackageID = packageID;
	}
	public InvoiceString(InvoiceHeader invoiceHeaderID, measureunit structureUnitID, Product productID,
			Package packageID, Short amount, Double costUnitProduct, Double grossWeight, Double netWeight, Double vAT) {
		super();
		InvoiceHeaderID = invoiceHeaderID;
		StructureUnitID = structureUnitID;
		ProductID = productID;
		PackageID = packageID;
		Amount = amount;
		CostUnitProduct = costUnitProduct;
		GrossWeight = grossWeight;
		NetWeight = netWeight;
		VAT = vAT;
	}
	public InvoiceString(Short id, Short amount, Double costUnitProduct, InvoiceHeader invoiceHeaderID, Product productID, Double grossWeight,
			Double netWeight, Double vAT, measureunit structureUnitID, Package packageID) {
		super();
		this.id = id;
		Amount = amount;
		CostUnitProduct = costUnitProduct;
		InvoiceHeaderID = invoiceHeaderID;
		ProductID = productID;
		GrossWeight = grossWeight;
		NetWeight = netWeight;
		VAT = vAT;
		StructureUnitID = structureUnitID;
		PackageID = packageID;
	}
	public InvoiceString(InvoiceHeader invoiceHeaderID, Product productID, Package packageID, Short amount,
			Double costUnitProduct, Double grossWeight, Double netWeight, Double vAT) {
		super();
		InvoiceHeaderID = invoiceHeaderID;
		ProductID = productID;
		PackageID = packageID;
		Amount = amount;
		CostUnitProduct = costUnitProduct;
		GrossWeight = grossWeight;
		NetWeight = netWeight;
		VAT = vAT;
	}
	private Short id;
	private Short Amount;
	private Double CostUnitProduct;
	private InvoiceHeader InvoiceHeaderID;
	private Product ProductID;
	private Double GrossWeight;
	private Double NetWeight;
	private Double VAT;
	private measureunit StructureUnitID;
	private Package PackageID;
	@Override
	public String toString() 
	{
		return this.Amount + " " + this.CostUnitProduct + " " + this.InvoiceHeaderID + " " + this.ProductID + " " + this.GrossWeight + " " + this.NetWeight + " " + this.VAT + " " + this.PackageID;
	}
	
	public Short getId() {
		return id;
	}
	public void setId(Short id) {
		this.id = id;
	}
	public InvoiceHeader getInvoiceHeaderID() {
		return InvoiceHeaderID;
	}
	public void setInvoiceHeaderID(InvoiceHeader invoiceHeaderID) {
		InvoiceHeaderID = invoiceHeaderID;
	}
	public Product getProductID() {
		return ProductID;
	}
	public void setProductID(Product productID) {
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
	public measureunit getStructureUnitID() {
		return StructureUnitID;
	}
	public void setStructureUnitID(measureunit structureUnitID) {
		StructureUnitID = structureUnitID;
	}
	public Package getPackageID() {
		return PackageID;
	}
	public void setPackageID(Package packageID) {
		PackageID = packageID;
	}
	public Short getAmount() {
		return Amount;
	}
	public void setAmount(Short amount) {
		Amount = amount;
	}
	public Double getCostUnitProduct() {
		return CostUnitProduct;
	}
	public void setCostUnitProduct(Double costUnitProduct) {
		CostUnitProduct = costUnitProduct;
	}
}
