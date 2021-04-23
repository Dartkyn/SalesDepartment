package com.control;

import java.util.List;

import test.backend.Bank;
import test.backend.City;
import test.backend.Company;
import test.backend.Contract;
import test.backend.DeliveryShedule;
import test.backend.InvoiceHeader;
import test.backend.InvoiceString;
import test.backend.Package;
import test.backend.Product;
import test.backend.Subdivision;
import test.backend.measureunit;
/** 
 * Класс реализующий интерфейс <b>Controller</b>.
*/
public class ControllerImplement implements Controller {
	
	public ControllerImplement() {
		super();
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
	public Controller Controller()
	{
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public List<Bank> getBanks() {
		return bankz;
	}

	@Override
	public List<City> getCities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> getCompanies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contract> getContracts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeliveryShedule> getDelivShedule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvoiceHeader> getInvHeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvoiceString> getInvString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<measureunit> getMeasUnit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Package> getPackage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subdivision> getSubDivision() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void createInvoice(String numberInv, String dateInv, Short subDivID, List<InvoiceString> stringsInv) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void createInvoice(String numberInv, String dateInv, List<InvoiceString> stringsInv) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateInvoice(String numberInv, String dateInv, Short subDivID, List<InvoiceString> stringsInv) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateInvoice(String numberInv, String dateInv, List<InvoiceString> stringsInv) {
		// TODO Auto-generated method stub
		
	}
}
