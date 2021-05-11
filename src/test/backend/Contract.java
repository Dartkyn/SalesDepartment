package test.backend;

public class Contract {

	public Contract(Short id, String number, String contractDate, Company companyID, String account, City cityID,
			Bank bankID) {
		super();
		this.id = id;
		Number = number;
		ContractDate = contractDate;
		CompanyID = companyID;
		Account = account;
		CityID = cityID;
		BankID = bankID;
	}
	public Contract(String number, String contractDate, Company companyID, String account, City cityID, Bank bankID) {
		super();
		Number = number;
		ContractDate = contractDate;
		CompanyID = companyID;
		Account = account;
		CityID = cityID;
		BankID = bankID;
	}
	private Short id;
	private String Number;
	private String ContractDate;
	private Company CompanyID;
	private String Account;
	private City CityID;
	private Bank BankID;
	
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
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getContractDate() {
		return ContractDate;
	}
	public void setContractDate(String contractDate) {
		ContractDate = contractDate;
	}
	public Company getCompanyID() {
		return CompanyID;
	}
	public void setCompanyID(Company companyID) {
		CompanyID = companyID;
	}
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
	}
	public Bank getBankID() {
		return BankID;
	}
	public void setBankID(Bank bankID) {
		BankID = bankID;
	}
	public City getCityID() {
		return CityID;
	}
	public void setCityID(City cityID) {
		CityID = cityID;
	}
}
