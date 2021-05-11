package test.backend;

public class DeliveryShedule {
	public DeliveryShedule(Short id, String deliveryDate, Short amount, Contract contractID, Product productID, Double cost,
			Package packageID) {
		super();
		this.id = id;
		DeliveryDate = deliveryDate;
		Amount = amount;
		ContractID = contractID;
		ProductID = productID;
		Cost = cost;
		PackageID = packageID;
	}
	public DeliveryShedule(Contract contractID, Product productID, Package packageID, Short amount, Double cost,
			String deliveryDate) {
		super();
		ContractID = contractID;
		ProductID = productID;
		PackageID = packageID;
		Amount = amount;
		Cost = cost;
		DeliveryDate = deliveryDate;
	}
	private Short id;
	private String DeliveryDate;
	private Short Amount;
	private Contract ContractID;
	private Product ProductID;
	private Double Cost;
	private Package PackageID;
	
	@Override
	public String toString() 
	{
		return  this.DeliveryDate + " " + this.Amount + " " + this.ContractID + " " + this.ProductID;
	}
	
	
	public Short getId() {
		return id;
	}
	public void setId(Short id) {
		this.id = id;
	}
	public String getDeliveryDate() {
		return DeliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	public Short getAmount() {
		return Amount;
	}
	public void setAmount(Short amount) {
		Amount = amount;
	}
	public Contract getContractID() {
		return ContractID;
	}
	public void setContractID(Contract contractID) {
		ContractID = contractID;
	}
	public Product getProductID() {
		return ProductID;
	}
	public void setProductID(Product productID) {
		ProductID = productID;
	}
	public Double getCost() {
		return Cost;
	}
	public void setCost(Double cost) {
		Cost = cost;
	}
	public Package getPackageID() {
		return PackageID;
	}
	public void setPackageID(Package packageID) {
		PackageID = packageID;
	}
}
