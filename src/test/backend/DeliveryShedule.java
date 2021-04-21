package test.backend;

public class DeliveryShedule {
	
	public DeliveryShedule(Short id, String deliveryDate, Short amount, Short contractID, Short productID, Double cost,
			Short packageID) {
		super();
		this.id = id;
		DeliveryDate = deliveryDate;
		Amount = amount;
		ContractID = contractID;
		ProductID = productID;
		Cost = cost;
		PackageID = packageID;
	}
	private Short id;
	private String DeliveryDate;
	private Short Amount;
	private Short ContractID;
	private Short ProductID;
	private Double Cost;
	private Short PackageID;
	
	@Override
	public String toString() 
	{
		return Short.toString(this.id) + " " + this.DeliveryDate + " " + this.Amount + " " + this.ContractID + " " + this.ProductID + " " + this.Cost + " " + this.PackageID;
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
	public Short getContractID() {
		return ContractID;
	}
	public void setContractID(Short contractID) {
		ContractID = contractID;
	}
	public Short getProductID() {
		return ProductID;
	}
	public void setProductID(Short productID) {
		ProductID = productID;
	}
	public Double getCost() {
		return Cost;
	}
	public void setCost(Double cost) {
		Cost = cost;
	}
	public Short getPackageID() {
		return PackageID;
	}
	public void setPackageID(Short packageID) {
		PackageID = packageID;
	}
}
