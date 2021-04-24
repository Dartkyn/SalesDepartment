package test.backend;

public class Contract {

	public Contract(Short id, Short number, String contractDate, Short companyID, String account, Short cityID,
			Short bankID) {
		super();
		this.id = id;
		Number = number;
		ContractDate = contractDate;
		CompanyID = companyID;
		Account = account;
		CityID = cityID;
		BankID = bankID;
	}
	private Short id;
	private Short Number;
	private String ContractDate;
	private Short CompanyID;
	private String Account;
	private Short CityID;
	private Short BankID;
	
	@Override
	public String toString() 
	{
		return this.Number + " " + this.ContractDate + " " + this.CompanyID  + this.CityID+ " " + this.BankID;
	}
	
	public Short getId() {
		return id;
	}
	public void setId(Short id) {
		this.id = id;
	}
	public Short getNumber() {
		return Number;
	}
	public void setNumber(Short number) {
		Number = number;
	}
	public String getContractDate() {
		return ContractDate;
	}
	public void setContractDate(String contractDate) {
		ContractDate = contractDate;
	}
	public Short getCompanyID() {
		return CompanyID;
	}
	public void setCompanyID(Short companyID) {
		CompanyID = companyID;
	}
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
	}
	public Short getBankID() {
		return BankID;
	}
	public void setBankID(Short bankID) {
		BankID = bankID;
	}
	public Short getCityID() {
		return CityID;
	}
	public void setCityID(Short cityID) {
		CityID = cityID;
	}
}
