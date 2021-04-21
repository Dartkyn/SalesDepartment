package test.backend;

public class Company {
	
	public Company(Short id, String name, String iNN, String oGRN, String phoneNumber, String email, String kPP,
			String oKPO, String lawAdress) {
		super();
		this.id = id;
		this.name = name;
		INN = iNN;
		OGRN = oGRN;
		PhoneNumber = phoneNumber;
		Email = email;
		KPP = kPP;
		OKPO = oKPO;
		LawAdress = lawAdress;
	}
	
	@Override
	public String toString() 
	{
		return Short.toString(this.id) + " " + this.name + " " + this.INN + " " + this.OGRN + " " + this.PhoneNumber + " " + this.Email + " " + this.KPP +  " " + this.OKPO + " " + this.LawAdress;
	}
	
	private Short id;
	private String name;
	private String INN;
	private String OGRN;
	private String PhoneNumber;
	private String Email;
	private String KPP;
	private String OKPO;
	private String LawAdress;
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
	public String getINN() {
		return INN;
	}
	public void setINN(String iNN) {
		INN = iNN;
	}
	public String getOGRN() {
		return OGRN;
	}
	public void setOGRN(String oGRN) {
		OGRN = oGRN;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getKPP() {
		return KPP;
	}
	public void setKPP(String kPP) {
		KPP = kPP;
	}
	public String getOKPO() {
		return OKPO;
	}
	public void setOKPO(String oKPO) {
		OKPO = oKPO;
	}
	public String getLawAdress() {
		return LawAdress;
	}
	public void setLawAdress(String lawAdress) {
		LawAdress = lawAdress;
	}

}
