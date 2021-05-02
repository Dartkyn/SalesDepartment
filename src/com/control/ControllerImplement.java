package com.control;

import java.sql.SQLException;
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
	public List<InvoiceString> converToInvoiceStrings(InvoiceHeader invHeadID, ArrayList<Product> prodList,
			ArrayList<measureunit> unitList, ArrayList<Package> packageList, ArrayList<Object> amountList,
			ArrayList<Object> grossList, ArrayList<Object> netList, ArrayList<Object> costList,
			ArrayList<Object> vatList) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public InvoiceHeader createInvoice(String numberInv, String dateInv, Subdivision subDivID) {
		InvoiceHeader InvHead = new InvoiceHeader(numberInv, dateInv, subDivID);
		invHeaderz.add(InvHead);
		return InvHead;
	}
	@Override
	public InvoiceHeader createInvoice(String numberInv, String dateInv) {
		InvoiceHeader InvHead = new InvoiceHeader(numberInv, dateInv);
		invHeaderz.add(InvHead);
		return InvHead;
	}
	@Override
	public InvoiceHeader updateInvoice(Short invID, String numberInv, String dateInv, Short subDivID,
			List<InvoiceString> stringsInv) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public InvoiceHeader updateInvoice(Short invID, String numberInv, String dateInv, List<InvoiceString> stringsInv) {
		// TODO Auto-generated method stub
		return null;
	}
}
