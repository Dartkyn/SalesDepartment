package test.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class MasterOfTables {
	public MasterOfTables() throws ClassNotFoundException, SQLException {
		super();
		Connection conn;
		Statement statmt;
		ResultSet resSet;
		conn = null;
		Class.forName("org.sqlite.JDBC");
		conn = DriverManager.getConnection("jdbc:sqlite:alpha.sqlite3");
		System.out.println("База Подключена!");
		statmt = conn.createStatement();
		List<measureunit> MeasureUnitList  = new LinkedList<>();
		resSet = statmt.executeQuery("SELECT * FROM MeasureUnit");
		
		while(resSet.next())
		{
			 Short id = (short) resSet.getInt("MeasureUnitId");
			 String name = resSet.getString("MeasureUnitName");
			 String code = resSet.getString("MeasureUnitCode");
			 MeasureUnitList.add(new measureunit(id,name,code));
		}	
		this.unitz = MeasureUnitList;//
		for (measureunit test:MeasureUnitList)
		{
		System.out.println(test.toString());
		}
		
		System.out.println("Таблица выведена");
		
		List<City> CityList  = new LinkedList<>();
		resSet = statmt.executeQuery("SELECT * FROM City");
		
		while(resSet.next())
		{
			 Short id = (short) resSet.getInt("CityId");
			 String name = resSet.getString("CityName");
			 CityList.add(new City(id,name));
		}	
		this.citiez = CityList;//
		for (City test:CityList)
		{
		System.out.println(test.toString());
		}
		
		System.out.println("Таблица выведена");
		
		List<Bank> BankList  = new LinkedList<>();
		resSet = statmt.executeQuery("SELECT * FROM Bank");
		
		while(resSet.next())
		{
			 Short id = (short) resSet.getInt("BankId");
			 String name = resSet.getString("BankName");
			 String CorrespondingAccount = resSet.getString("CorrespondingAccount");
			 String BIK = resSet.getString("BIK");
			 String INN = resSet.getString("INN");
			 BankList.add(new Bank(id,name,CorrespondingAccount,BIK,INN));
		}	
		this.bankz = BankList;//
		for (Bank test:BankList)
		{
		System.out.println(test.toString());
		}
		
		System.out.println("Таблица выведена");
	
	  List<Company> CompanyList  = new LinkedList<>();
	  resSet = statmt.executeQuery("SELECT * FROM Company");
	
	  while(resSet.next())
	  {
		 Short id = (short) resSet.getInt("Company_Id");
		 String name = resSet.getString("Name");
		 String INN = resSet.getString("INN");
		 String OGRN = resSet.getString("OGRN");
		 String PhoneNumber = resSet.getString("PhoneNumber");
		 String Email = resSet.getString("Email");
		 String KPP = resSet.getString("KPP");
		 String OKPO = resSet.getString("OKPO");
		 String LawAdress = resSet.getString("LawAdress");
		 CompanyList.add(new Company(id,name,INN, OGRN, PhoneNumber, Email, KPP, OKPO, LawAdress));
	  }	
	this.companiez = CompanyList;//
	  for (Company test:CompanyList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	  List<Package> PackageList  = new LinkedList<>();
	  resSet = statmt.executeQuery("SELECT * FROM Package");
	
	  while(resSet.next())
	  {
		 Short id = (short) resSet.getInt("PackageId");
		 String name = resSet.getString("PackageName");
		 PackageList.add(new Package(id,name));
	  }	
	 
	  this.packagez = PackageList;//
	  
	  for (Package test:PackageList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	
	  List<Product> ProductList  = new LinkedList<>();
	  resSet = statmt.executeQuery("SELECT * FROM Product");
	
	  while(resSet.next())
	  {
		 Short id = (short) resSet.getInt("ProductId");
		 String name = resSet.getString("ProductName");
		 String ProductCode = resSet.getString("ProductCode");
		 ProductList.add(new Product(id,name, ProductCode));
	  }	
	
	  this.productz = ProductList;//
	  
	  for (Product test:ProductList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	  List<Subdivision> SubdivisionList  = new LinkedList<>();
	  resSet = statmt.executeQuery("SELECT * FROM Subdivision");
	
	  while(resSet.next())
	  {
		 Short id = (short) resSet.getInt("SubdivisionId");
		 String name = resSet.getString("SubdivisionName");
		 String SubdivisionCode = resSet.getString("SubdivisionCode");
		 SubdivisionList.add(new Subdivision(id,name, SubdivisionCode));
	  }	
	
	  this.subDiviz = SubdivisionList;//
	  
	  for (Subdivision test:SubdivisionList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	  List<InvoiceHeader> InvoiceHeaderList  = new LinkedList<>();
	  resSet = statmt.executeQuery("SELECT * FROM InvoiceHeader");
	
	  while(resSet.next())
	  {
		 Short id = (short) resSet.getInt("InvoiceHeaderId");
		 String Number = resSet.getString("InvoiceNumber");
		 String InvoiceDate = resSet.getString("InvoiceDate");
		 Short SubdivisionId = (short) resSet.getInt("SubdivisionId");
		 InvoiceHeaderList.add(new InvoiceHeader(id,Number,InvoiceDate, SubdivisionId));
	  }	
	
	  this.invHeaderz = InvoiceHeaderList;//
	  
	  for (InvoiceHeader test:InvoiceHeaderList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  List<InvoiceString> InvoiceStringList  = new LinkedList<>();
	  resSet = statmt.executeQuery("SELECT * FROM InvoiceString");

	  while(resSet.next())
	  {
		 Short id = (short) resSet.getInt("InvoiceStringID");
		 Short Amount = (short) resSet.getInt("Amount");
		 Double CostUnitProduct = resSet.getDouble("CostUnitProduct");
		 Double GrossWeight = resSet.getDouble("GrossWeight");
		 Double NetWeight = resSet.getDouble("NetWeight");
		 Double VAT = resSet.getDouble("VAT");
		 Short InvoiceHeaderID = (short) resSet.getInt("InvoiceHeaderID");
		 Short ProductID = (short) resSet.getInt("ProductID");
		 Short StructureUnitID = (short) resSet.getInt("StructureUnitID");
		 Short PackageID = (short) resSet.getInt("PackageID");
		 InvoiceStringList.add(new InvoiceString(id,Amount, CostUnitProduct,InvoiceHeaderID, ProductID, GrossWeight, NetWeight, VAT, StructureUnitID, PackageID));
	  }	
	
	  this.invStringz = InvoiceStringList;//
	  
	  for (InvoiceString test:InvoiceStringList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	  List<Contract> ContractList  = new LinkedList<>();
	  resSet = statmt.executeQuery("SELECT * FROM Contract");

	  while(resSet.next())
	  {
		 Short id = (short) resSet.getInt("Contract_ID");
		 Short Number = (short) resSet.getInt("Number");
		 String ContractDate = resSet.getString("ContractDate");
		 String Account = resSet.getString("Account");
		 Short CompanyID = (short) resSet.getInt("Company_ID");
		 Short CityID = (short) resSet.getInt("CityID");
		 Short BankID = (short) resSet.getInt("BankID");
		 ContractList.add(new Contract(id,Number, ContractDate, CompanyID, Account, CityID, BankID));
	  }	
	  
	  this.contractz = ContractList;
	
	  for (Contract test:ContractList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	  List<DeliveryShedule> DeliverySheduleList  = new LinkedList<>();
	  resSet = statmt.executeQuery("SELECT * FROM DeliveryShedule");

	  while(resSet.next())
	  {
		 Short id = (short) resSet.getInt("DeliverySheduleID");
		 Short Amount = (short) resSet.getInt("Amount");
		 Double Cost = resSet.getDouble("Cost");
		 String DeliveryDate = resSet.getString("DeliveryDate");
		 Short ContractID = (short) resSet.getInt("Contract_ID");
		 Short ProductID = (short) resSet.getInt("ProductID"); 
		 Short PackageID = (short) resSet.getInt("PackageID"); 
		 DeliverySheduleList.add(new DeliveryShedule(id,DeliveryDate, Amount,ContractID, ProductID,Cost, PackageID));
	  }	
	
	  this.delivShedulz = DeliverySheduleList;
	  
	  
	  for (DeliveryShedule test:DeliverySheduleList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
		conn.close();
		statmt.close();
		resSet.close();
				
	}
	/** Поле список банков*/
	private List<Bank> bankz;
	/** Поле список городов*/
	private List<City> citiez;
	/** Поле список компаний*/
	private List<Company> companiez;
	/** Поле список договоров*/
	private List<Contract> contractz;
	/** Поле список графиков поставки*/
	private  List<DeliveryShedule> delivShedulz;
	/** Поле список заголовков накладной*/
	private  List<InvoiceHeader> invHeaderz;
	/** Поле список строк накладной*/
	private  List<InvoiceString> invStringz;
	/** Поле список единиц измерений*/
	private  List<measureunit> unitz;
	/** Поле список упаковок*/
	private  List<Package> packagez;
	/** Поле список товаров*/
	private  List<Product> productz;
	/** Поле список подразделений*/
	private  List<Subdivision> subDiviz;
	
	
	public List<Bank> getBankz() {
		return bankz;
	}
	public void setBankz(List<Bank> bankz) {
		this.bankz = bankz;
	}
	public List<City> getCitiez() {
		return citiez;
	}
	public void setCitiez(List<City> citiez) {
		this.citiez = citiez;
	}
	public List<Company> getCompaniez() {
		return companiez;
	}
	public void setCompaniez(List<Company> companiez) {
		this.companiez = companiez;
	}
	public List<Contract> getContractz() {
		return contractz;
	}
	public void setContractz(List<Contract> contractz) {
		this.contractz = contractz;
	}
	public List<DeliveryShedule> getDelivShedulz() {
		return delivShedulz;
	}
	public void setDelivShedulz(List<DeliveryShedule> delivShedulz) {
		this.delivShedulz = delivShedulz;
	}
	public List<InvoiceHeader> getInvHeaderz() {
		return invHeaderz;
	}
	public void setInvHeaderz(List<InvoiceHeader> invHeaderz) {
		this.invHeaderz = invHeaderz;
	}
	public List<InvoiceString> getInvStringz() {
		return invStringz;
	}
	public void setInvStringz(List<InvoiceString> invStringz) {
		this.invStringz = invStringz;
	}
	public List<measureunit> getUnitz() {
		return unitz;
	}
	public void setUnitz(List<measureunit> unitz) {
		this.unitz = unitz;
	}
	public List<Package> getPackagez() {
		return packagez;
	}
	public void setPackagez(List<Package> packagez) {
		this.packagez = packagez;
	}
	public List<Product> getProductz() {
		return productz;
	}
	public void setProductz(List<Product> productz) {
		this.productz = productz;
	}
	public List<Subdivision> getSubDiviz() {
		return subDiviz;
	}
	public void setSubDiviz(List<Subdivision> subDiviz) {
		this.subDiviz = subDiviz;
	}
}
