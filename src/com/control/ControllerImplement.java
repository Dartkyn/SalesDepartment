package com.control;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import test.backend.Bank;
import test.backend.City;
import test.backend.Company;
import test.backend.Contract;
import test.backend.DeliveryShedule;
import test.backend.InvoiceHeader;
import test.backend.InvoiceString;
import test.backend.MasterOfTables;
import test.backend.Package;
import test.backend.Product;
import test.backend.Subdivision;
import test.backend.measureunit;
/** 
 * Класс реализующий интерфейс <b>Controller</b>.
*/
public class ControllerImplement implements Controller {
	
	public ControllerImplement() throws ClassNotFoundException, SQLException {
		super();
		masterOfTables = new MasterOfTables();
		bankz = masterOfTables.getBankz();
		citiez = masterOfTables.getCitiez();
		companiez = masterOfTables.getCompaniez();
		contractz = masterOfTables.getContractz();
		delivShedulz = masterOfTables.getDelivShedulz();
		invHeaderz = masterOfTables.getInvHeaderz();
		invStringz = masterOfTables.getInvStringz();
		unitz = masterOfTables.getUnitz();
		packagez = masterOfTables.getPackagez();
		productz = masterOfTables.getProductz();
		subDiviz = masterOfTables.getSubDiviz();
	}
	public static Statement statmt;
	/** Поле список банков*/
	private List<Bank> bankz;
	/** Поле список городов*/
	private List<City> citiez;
	/** Поле список компаний*/
	private List<Company> companiez;
	/** Поле список договоров*/
	private List<Contract> contractz;
	/** Поле список графиков поставки*/
	private List<DeliveryShedule> delivShedulz;
	/** Поле список заголовков накладной*/
	private List<InvoiceHeader> invHeaderz;
	/** Поле список строк накладной*/
	private List<InvoiceString> invStringz;
	/** Поле список единиц измерений*/
	private List<measureunit> unitz;
	/** Поле список упаковок*/
	private List<Package> packagez;
	/** Поле список товаров*/
	private List<Product> productz;
	/** Поле список подразделений*/
	private List<Subdivision> subDiviz;
	/** Поле список подразделений*/
	private MasterOfTables masterOfTables;
	public Controller Controller() throws ClassNotFoundException, SQLException
	{
		return this;
	}
	@Override
	public List<Bank> getBanks() {
		return bankz;
	}

	@Override
	public List<City> getCities() {
		return citiez;
	}

	@Override
	public List<Company> getCompanies() {
		// TODO Auto-generated method stub
		return companiez;
	}

	@Override
	public List<Contract> getContracts() {
		// TODO Auto-generated method stub
		return contractz;
	}

	@Override
	public List<DeliveryShedule> getDelivShedule() {
		// TODO Auto-generated method stub
		return delivShedulz;
	}

	@Override
	public List<InvoiceHeader> getInvHeader() {
		// TODO Auto-generated method stub
		return invHeaderz;
	}

	@Override
	public List<InvoiceString> getInvString() {
		// TODO Auto-generated method stub
		return invStringz;
	}

	@Override
	public List<measureunit> getMeasUnit() {
		// TODO Auto-generated method stub
		return unitz;
	}

	@Override
	public List<Package> getPackage() {
		// TODO Auto-generated method stub
		return packagez;
	}

	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return productz;
	}

	@Override
	public List<Subdivision> getSubDivision() {
		// TODO Auto-generated method stub
		return subDiviz;
	}
	public void setBankz(List<Bank> bankz) {
		this.bankz = bankz;
	}
	public void setCitiez(List<City> citiez) {
		this.citiez = citiez;
	}
	public void setCompaniez(List<Company> companiez) {
		this.companiez = companiez;
	}
	public void setContractz(List<Contract> contractz) {
		this.contractz = contractz;
	}
	public void setDelivShedulz(List<DeliveryShedule> delivShedulz) {
		this.delivShedulz = delivShedulz;
	}
	public void setInvHeaderz(List<InvoiceHeader> invHeaderz) {
		this.invHeaderz = invHeaderz;
	}
	public void setInvStringz(List<InvoiceString> invStringz) {
		this.invStringz = invStringz;
	}
	public void setUnitz(List<measureunit> unitz) {
		this.unitz = unitz;
	}
	public void setPackagez(List<Package> packagez) {
		this.packagez = packagez;
	}
	public void setProductz(List<Product> productz) {
		this.productz = productz;
	}
	public void setSubDiviz(List<Subdivision> subDiviz) {
		this.subDiviz = subDiviz;
	}

	@Override
	public Product findProduct(String str) {
		for(Product prod:productz)
		{
			if(prod.toString().contains(str))
				return prod;
		}
		return null;
	}
	@Override
	public measureunit findUnit(String str) {
		for(measureunit unit:unitz)
		{
			if(unit.toString().contains(str))
				return unit;
		}
		return null;
	}
	@Override
	public Package findPackage(String str) {
		for(Package pack:packagez)
		{
			if(pack.toString().contains(str))
				return pack;
		}
		return null;
	}
	@Override
	public InvoiceHeader findHeader(String str) {
		for(InvoiceHeader invHeader:invHeaderz)
		{
			if(invHeader.toString().contains(str))
				return invHeader;
		}
		return null;
	}
	@Override
	public List<InvoiceString> converToInvoiceStrings(InvoiceHeader invHeadID, ArrayList<Product> prodList,
			ArrayList<measureunit> unitList, ArrayList<Package> packageList, ArrayList<Object> amountList,
			ArrayList<Object> grossList, ArrayList<Object> netList, ArrayList<Object> costList,
			ArrayList<Object> vatList) throws SQLException {
		List<InvoiceString> invStrings = new ArrayList<InvoiceString>();
		for(int i = 0; i < prodList.size(); i++)
		{
			invStrings.add(new InvoiceString(invHeadID, unitList.get(i), prodList.get(i), packageList.get(i), 
					(Short)amountList.get(i), (Double)costList.get(i), (Double)grossList.get(i), 
					(Double)netList.get(i), (Double)vatList.get(i)));
			
			//StructureUnitID - ЭТО MEASUREUNIT, ЕДИНИЦА ИЗМЕРЕНИЯ!!!!!
			
			String tmp = "INSERT INTO 'InvoiceString' ("
					+ "'Amount', 'CostUnitProduct', 'InvoiceHeaderID', 'ProductID', 'GrossWeight', 'NetWeight', 'VAT', 'StructureUnitID', 'PackageID') "
					+ "VALUES (" + "'" +
					amountList.get(i) + "'" +  "," + "'" + costList.get(i)+ "'" + "," + "'" + "1" + "'" +  "," + "'" + prodList.get(i).getId() + "'"
					+  "," + "'" + grossList.get(i) + "'" +  "," + "'" + netList.get(i) +"'" + "," + "'" + vatList.get(i) + "'" + "," + "'" + unitList.get(i).getId() + "'" +
							"," + "'" + packageList.get(i).getId() + "'" + ");";
		
			System.out.println(tmp);
			masterOfTables.addToDatabase(tmp);
		}

	
	invStringz.addAll(invStrings);
		return invStrings;
	}
	@Override
	public InvoiceHeader createInvoice(String numberInv, String dateInv, Subdivision subDivID) throws SQLException, ClassNotFoundException{
		InvoiceHeader InvHead = new InvoiceHeader(numberInv, dateInv, subDivID);
		invHeaderz.add(InvHead);
		int tmp_id = subDivID.getId(); //Создаём строку tmp для того, чтобы сформировать SQL-запрос
		String tmp_str_id = Integer.toString(tmp_id); //Достаём из объекта id в виде int
		//Формируем строку и вызываем метод addToDatabase
		String tmp = "INSERT INTO 'InvoiceHeader' ('InvoiceNumber', 'InvoiceDate','SubdivisionID') VALUES (" + "'" + numberInv + "'" + "," + "'" + dateInv + "'" +  "," + "'" + tmp_str_id + "'" +");"; 
		masterOfTables.addToDatabase(tmp);
		System.out.println("Таблица заполнена");
		return InvHead;
	}
	@Override
	public InvoiceHeader createInvoice(String numberInv, String dateInv) throws SQLException {
		InvoiceHeader InvHead = new InvoiceHeader(numberInv, dateInv);
		invHeaderz.add(InvHead);
		//Формируем строку и вызываем метод addToDatabase
		String tmp = "INSERT INTO 'InvoiceHeader' ('InvoiceNumber', 'InvoiceDate') VALUES (" + "'" + numberInv + "'" + "," + "'" + dateInv + "'" +  "," + ");"; 
		masterOfTables.addToDatabase(tmp);
		System.out.println("Таблица заполнена");
		return InvHead; 
	}
	@Override
	public InvoiceHeader updateInvoice(Short invID, String numberInv, String dateInv, Short subDivID,
			List<InvoiceString> stringsInv) {
		//String tmp_str_id = Integer.toString(invID); //Достаём из объекта id в виде int
		//InvoiceHeader InvHead = findHeader(tmp_str_id);
		//invHeaderz.set(InvHead);
		//Формируем строку и вызываем метод addToDatabase
		//String tmp = "UPDATE 'InvoiceHeader' ('InvoiceNumber', 'InvoiceDate','SubdivisionID') VALUES (" + "'" + numberInv + "'" + "," + "'" + dateInv + "'" +  "," + "'" + tmp_str_id + "'" +");"; 
		//masterOfTables.addToDatabase(tmp);
		//System.out.println("Таблица заполнена");
		return null;
	}
	@Override
	public InvoiceHeader updateInvoice(Short invID, String numberInv, String dateInv, List<InvoiceString> stringsInv) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Contract createContract(String numberContract, String contractDate, Company companyID, String account,
			City cityID, Bank bankID) throws SQLException, ClassNotFoundException {
		Contract contract = new Contract(numberContract, contractDate, companyID, account, cityID, bankID);
		contractz.add(contract);
		return contract;
	}
	@Override
	public List<DeliveryShedule> converToDelivSheduls(Contract contractID, ArrayList<Product> prodList,
			ArrayList<Package> packageList, ArrayList<Object> amountProdList, ArrayList<Object> costList,
			ArrayList<Object> dateDelivList) {
		List<DeliveryShedule> delivSheduls = new ArrayList<DeliveryShedule>();
		for(int i = 0;i < prodList.size(); i++)
		{
			delivSheduls.add(new DeliveryShedule(contractID, prodList.get(i), 
					packageList.get(i), (Short)amountProdList.get(i), 
					(Double) costList.get(i), (String) dateDelivList.get(i)));
		}
		delivShedulz.addAll(delivSheduls);
		return delivSheduls;
	}
	@Override
	public List<Contract> getFiltredContracts() {
		List<Contract> resultContr = contractz;
		return resultContr;
	}
	@Override
	public List<InvoiceHeader> getFiltredInvHeader() {
		List<InvoiceHeader> resultInvHeader = invHeaderz;
		return resultInvHeader;
	}
}
