package test.backend;

public class Bank {

	private Short id;
	private String name;
	private String CorrespondingAccount;
	private String BIK;
	private String INN;
	
	public Bank(Short id, String name, String CorrespondingAccount, String BIK, String INN) {
		   this.id = id;
		   this.name = name;
		   this.CorrespondingAccount = CorrespondingAccount ;
		   this.BIK = BIK;
		   this.INN = INN;
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
	public String getBIK() {
		return BIK;
	}
	public void setBIK(String bIK) {
		BIK = bIK;
	}
	public String getINN() {
		return INN;
	}
	public void setINN(String iNN) {
		INN = iNN;
	}
	public String getCorrespondingAccount() {
		return CorrespondingAccount;
	}
	public void setCorrespondingAccount(String correspondingAccount) {
		CorrespondingAccount = correspondingAccount;
	}
}
