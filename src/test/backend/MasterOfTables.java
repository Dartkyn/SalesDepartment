package test.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class MasterOfTables {
	private Statement statmt;
	private ResultSet resSet;
	private Connection conn;
	
	public MasterOfTables() throws ClassNotFoundException, SQLException {
		super();
		/** Стандартные штуки для sqlite */
		this.conn = null;
		Class.forName("org.sqlite.JDBC");
		this.conn = DriverManager.getConnection("jdbc:sqlite:alpha.sqlite3");
		System.out.println("База Подключена!");
		this.statmt = this.conn.createStatement();
		List<measureunit> MeasureUnitList  = new LinkedList<>(); /**Создаём пустой список
		экземпляров класса, делаем запрос к таблице, циклически заполняем список и так для всех таблиц */
		this.resSet = this.statmt.executeQuery("SELECT * FROM MeasureUnit");
		
		while(this.resSet.next())
		{
			 Short id = (short) this.resSet.getInt("MeasureUnitId");
			 String name = this.resSet.getString("MeasureUnitName");
			 String code = this.resSet.getString("MeasureUnitCode");
			 MeasureUnitList.add(new measureunit(id,name,code));
		}	
		this.unitz = MeasureUnitList;//
		for (measureunit test:MeasureUnitList)
		{
		System.out.println(test.toString());
		}
		
		System.out.println("Таблица выведена");
		
		List<City> CityList  = new LinkedList<>();
		this.resSet = this.statmt.executeQuery("SELECT * FROM City");
		
		while(this.resSet.next())
		{
			 Short id = (short) this.resSet.getInt("CityId");
			 String name = this.resSet.getString("CityName");
			 CityList.add(new City(id,name));
		}	
		this.citiez = CityList;//
		for (City test:CityList)
		{
		System.out.println(test.toString());
		}
		
		System.out.println("Таблица выведена");
		
		List<Bank> BankList  = new LinkedList<>();
		this.resSet = this.statmt.executeQuery("SELECT * FROM Bank");
		
		while(this.resSet.next())
		{
			 Short id = (short) this.resSet.getInt("BankId");
			 String name = this.resSet.getString("BankName");
			 String CorrespondingAccount = this.resSet.getString("CorrespondingAccount");
			 String BIK = this.resSet.getString("BIK");
			 String INN = this.resSet.getString("INN");
			 BankList.add(new Bank(id,name,CorrespondingAccount,BIK,INN));
		}	
		this.bankz = BankList;//
		for (Bank test:BankList)
		{
		System.out.println(test.toString());
		}
		
		System.out.println("Таблица выведена");
	
	  List<Company> CompanyList  = new LinkedList<>();
	  this.resSet = this.statmt.executeQuery("SELECT * FROM Company");
	
	  while(this.resSet.next())
	  {
		 Short id = (short) this.resSet.getInt("Company_Id");
		 String name = this.resSet.getString("Name");
		 String INN = this.resSet.getString("INN");
		 String OGRN = this.resSet.getString("OGRN");
		 String PhoneNumber = this.resSet.getString("PhoneNumber");
		 String Email = this.resSet.getString("Email");
		 String KPP = this.resSet.getString("KPP");
		 String OKPO = this.resSet.getString("OKPO");
		 String LawAdress = this.resSet.getString("LawAdress");
		 CompanyList.add(new Company(id,name,INN, OGRN, PhoneNumber, Email, KPP, OKPO, LawAdress));
	  }	
	this.companiez = CompanyList;//
	  for (Company test:CompanyList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	  List<Package> PackageList  = new LinkedList<>();
	  this.resSet = this.statmt.executeQuery("SELECT * FROM Package");
	
	  while(this.resSet.next())
	  {
		 Short id = (short) this.resSet.getInt("PackageId");
		 String name = this.resSet.getString("PackageName");
		 PackageList.add(new Package(id,name));
	  }	
	 
	  this.packagez = PackageList;//
	  
	  for (Package test:PackageList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	
	  List<Product> ProductList  = new LinkedList<>();
	  this.resSet = this.statmt.executeQuery("SELECT * FROM Product");
	
	  while(this.resSet.next())
	  {
		 Short id = (short) this.resSet.getInt("ProductId");
		 String name = this.resSet.getString("ProductName");
		 String ProductCode = this.resSet.getString("ProductCode");
		 ProductList.add(new Product(id,name, ProductCode));
	  }	
	
	  this.productz = ProductList;//
	  
	  for (Product test:ProductList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	  List<Subdivision> SubdivisionList  = new LinkedList<>();
	  this.resSet = this.statmt.executeQuery("SELECT * FROM Subdivision");
	
	  while(this.resSet.next())
	  {
		 Short id = (short) this.resSet.getInt("SubdivisionId");
		 String name = this.resSet.getString("SubdivisionName");
		 String SubdivisionCode = this.resSet.getString("SubdivisionCode");
		 SubdivisionList.add(new Subdivision(id,name, SubdivisionCode));
	  }	
	
	  this.subDiviz = SubdivisionList;//
	  
	  for (Subdivision test:SubdivisionList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	  List<InvoiceHeader> InvoiceHeaderList  = new LinkedList<>();
	  this.resSet = this.statmt.executeQuery("SELECT * FROM InvoiceHeader");
	
	  while(this.resSet.next())
	  {
		 Short id = (short) this.resSet.getInt("InvoiceHeaderId");
		 String Number = this.resSet.getString("InvoiceNumber");
		 String InvoiceDate = this.resSet.getString("InvoiceDate");
		 Short SubdivisionId = (short) this.resSet.getInt("SubdivisionId");
		 if(SubdivisionId != null)
		 {
			 for(Subdivision sub:subDiviz)
				 {
				 if(sub.getId().equals(SubdivisionId))
				 {
					 InvoiceHeader invHead = new InvoiceHeader(id, Number,InvoiceDate, sub);
					 InvoiceHeaderList.add(invHead);
					 break;
				 }
				 }
			  
		 }
		 else
		 {
			 InvoiceHeader invHead = new InvoiceHeader(id, Number,InvoiceDate);
			 InvoiceHeaderList.add(invHead); 
		 }
	  }	
	
	  this.invHeaderz = InvoiceHeaderList;//
	  
	  for (InvoiceHeader test:InvoiceHeaderList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  List<InvoiceString> InvoiceStringList  = new LinkedList<>();
	  this.resSet = this.statmt.executeQuery("SELECT * FROM InvoiceString");

	  while(this.resSet.next())
	  {
		 Short id = (short) this.resSet.getInt("InvoiceStringID");
		 Short Amount = (short) this.resSet.getInt("Amount");
		 Double CostUnitProduct = this.resSet.getDouble("CostUnitProduct");
		 Double GrossWeight = this.resSet.getDouble("GrossWeight");
		 Double NetWeight = this.resSet.getDouble("NetWeight");
		 Double VAT = this.resSet.getDouble("VAT");
		 Short InvoiceHeaderID = (short) this.resSet.getInt("InvoiceHeaderID");
		 InvoiceHeader invHeader = null;
		 if(InvoiceHeaderID != null)
		 {
			 for(InvoiceHeader sub:invHeaderz)
				 {
				 if(sub.getId().equals(InvoiceHeaderID))
				 {
					 invHeader = sub;
					 break;
				 }
				 }
			  
		 }
		 Short ProductID = (short) this.resSet.getInt("ProductID");
		 Product prod = null;
		 if(ProductID != null)
		 {
			 for(Product sub:productz)
				 {
				 if(sub.getId().equals(ProductID))
				 {
					 prod = sub;
					 break;
				 }
				 }
			  
		 }
		 Short StructureUnitID = (short) this.resSet.getInt("StructureUnitID");
		 measureunit unit = null;
		 if(StructureUnitID != null)
		 {
			 for(measureunit sub:unitz)
				 {
				 if(sub.getId().equals(StructureUnitID))
				 {
					 unit = sub;
					 break;
				 }
				 }
			  
		 }
		 Short PackageID = (short) this.resSet.getInt("PackageID");
		 Package pack = null;
		 if(PackageID != null)
		 {
			 for(Package sub:packagez)
				 {
				 if(sub.getId().equals(PackageID))
				 {
					 pack = sub;
					 break;
				 }
				 }
			  
		 }
		 InvoiceStringList.add(new InvoiceString(id,Amount, CostUnitProduct,invHeader, prod, GrossWeight, NetWeight, VAT, unit, pack));
	  }	
	
	  this.invStringz = InvoiceStringList;//
	  
	  for (InvoiceString test:InvoiceStringList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	  List<Contract> ContractList  = new LinkedList<>();
	  this.resSet = this.statmt.executeQuery("SELECT * FROM Contract");

	  while(this.resSet.next())
	  {
		 Short id = (short) this.resSet.getInt("Contract_ID");
		 String Number = this.resSet.getString("Number");
		 String ContractDate = this.resSet.getString("ContractDate");
		 String Account = this.resSet.getString("Account");
		 Short CompanyID = (short) this.resSet.getInt("Company_ID");
		 Company comp = null;
		 if(CompanyID != null)
		 {
			 for(Company sub:companiez)
				 {
				 if(sub.getId().equals(CompanyID))
				 {
					 comp = sub;
					 break;
				 }
				 }
			  
		 }
		 Short CityID = (short) this.resSet.getInt("CityID");
		 City city = null;
		 if(CityID != null)
		 {
			 for(City sub:citiez)
				 {
				 if(sub.getId().equals(CityID))
				 {
					 city = sub;
					 break;
				 }
				 }
			  
		 }
		 Short BankID = (short) this.resSet.getInt("BankID");
		 Bank bank = null;
		 if(BankID != null)
		 {
			 for(Bank sub:bankz)
				 {
				 if(sub.getId().equals(BankID))
				 {
					 bank = sub;
					 break;
				 }
				 }
			  
		 }
		 ContractList.add(new Contract(id,Number, ContractDate, comp, Account, city, bank));
	  }	
	  
	  this.contractz = ContractList;
	
	  for (Contract test:ContractList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	  List<DeliveryShedule> DeliverySheduleList  = new LinkedList<>();
	  this.resSet = this.statmt.executeQuery("SELECT * FROM DeliveryShedule");

	  while(this.resSet.next())
	  {
		 Short id = (short) this.resSet.getInt("DeliverySheduleID");
		 Short Amount = (short) this.resSet.getInt("Amount");
		 Double Cost = this.resSet.getDouble("Cost");
		 String DeliveryDate = this.resSet.getString("DeliveryDate");
		 Short ContractID = (short) this.resSet.getInt("Contract_ID");
		 Contract contr = null;
		 if(ContractID != null)
		 {
			 for(Contract sub:contractz)
				 {
				 if(sub.getId().equals(ContractID))
				 {
					 contr = sub;
					 break;
				 }
				 }
			  
		 }
		 Short ProductID = (short) this.resSet.getInt("ProductID");
		 Product prod = null;
		 if(ProductID != null)
		 {
			 for(Product sub:productz)
				 {
				 if(sub.getId().equals(ProductID))
				 {
					 prod = sub;
					 break;
				 }
				 }
			  
		 }
		 Short PackageID = (short) this.resSet.getInt("PackageID");
		 Package pack = null;
		 if(PackageID != null)
		 {
			 for(Package sub:packagez)
				 {
				 if(sub.getId().equals(PackageID))
				 {
					 pack = sub;
					 break;
				 }
				 }
			  
		 }
		 DeliverySheduleList.add(new DeliveryShedule(id,DeliveryDate, Amount,contr, prod,Cost, pack));
	  }	
	
	  this.delivShedulz = DeliverySheduleList;
	  
	  
	  for (DeliveryShedule test:DeliverySheduleList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	   /** В итоге работы конструктора получаем списки, заполненные данными из таблицам из БД, код ниже 
	    * закрывает подключение к БД
	    */
		//this.conn.close();
		//this.statmt.close();
		//this.resSet.close();
				
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
	public void addToDatabase(String tmp) throws SQLException {
		/**
		 * Функция добавления строки в базу данных
		 * @param tmp - сформированная в ControllerImplement строка SQL-запроса INSERT
		 */
		statmt.execute(tmp);
		System.out.println("Запись " + tmp + " успешно добавлена в базу данных.");
	}
}
