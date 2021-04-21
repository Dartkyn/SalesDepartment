package test.backend;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class conn {
	public static Connection conn;
	public static Statement statmt;
	public static ResultSet resSet;
	
	// --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
	public static void Conn() throws ClassNotFoundException, SQLException 
	   {
		   conn = null;
		   Class.forName("org.sqlite.JDBC");
		   conn = DriverManager.getConnection("jdbc:sqlite:alpha.sqlite3");
		   
		   System.out.println("База Подключена!");
	   }
	
	// --------Создание таблицы--------
	public static void CreateDB() throws ClassNotFoundException, SQLException
	   {
		statmt = conn.createStatement();
		statmt.execute("CREATE TABLE if not exists 'users' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' text, 'phone' INT);");
		
		System.out.println("Таблица создана или уже существует.");
	   }
	
	// --------Заполнение таблицы--------
	public static void WriteDB() throws SQLException
	{
		   statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Petya', 125453); ");
		   statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Vasya', 321789); ");
		   statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Masha', 456123); ");
		  
		   System.out.println("Таблица заполнена");
	}
	
	// -------- Вывод таблицы--------
	public static void ReadDB() throws ClassNotFoundException, SQLException
	   {
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
	
	  for (InvoiceHeader test:InvoiceHeaderList)
	  {
	   System.out.println(test.toString());
	  }
	
	  System.out.println("Таблица выведена");
	  
	  
    }
	
		// --------Закрытие--------
		public static void CloseDB() throws ClassNotFoundException, SQLException
		   {
			conn.close();
			statmt.close();
			resSet.close();
			
			System.out.println("Соединения закрыты");
		   }

}
