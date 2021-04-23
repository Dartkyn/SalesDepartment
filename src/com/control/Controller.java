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
 * Интерфейс для работы с данными в программе
*/
public interface Controller {
    /**
     * Функция получения списка <b>Банков</b>
     * @return возвращает список всех банков из базы
     */
	public List<Bank> getBanks();
    /**
     * Функция получения списка <b>Городов</b>
     * @return возвращает список всех городов из базы
     */
	public List<City> getCities();
	/**
     * Функция получения списка <b>Компаний</b>
     * @return возвращает список всех компаний из базы
     */
	public List<Company> getCompanies();
	/**
     * Функция получения списка <b>Договоров</b>
     * @return возвращает список всех договоров из базы
     */
	public List<Contract> getContracts();
	/**
     * Функция получения списка <b>Графиков поставки</b>
     * @return возвращает список всех графиков поставки из базы
     */
	public List<DeliveryShedule> getDelivShedule();
	/**
     * Функция получения списка <b>Заголовков накладной</b>
     * @return возвращает список всех заголовков накладной из базы
     */
	public List<InvoiceHeader> getInvHeader();
	/**
     * Функция получения списка <b>Строк накладной</b>
     * @return возвращает список всех строк накладной из базы
     */
	public List<InvoiceString> getInvString();
	/**
     * Функция получения списка <b>Единиц измерения</b>
     * @return возвращает список всех единиц измерения из базы
     */
	public List<measureunit> getMeasUnit();
	/**
     * Функция получения списка <b>Упаковок</b>
     * @return возвращает список всех упаковок из базы
     */
	public List<Package> getPackage();
	/**
     * Функция получения списка <b>Товаров</b>
     * @return возвращает список всех товаров из базы
     */
	public List<Product> getProduct();
	/**
     * Функция получения списка <b>Подразделений</b>
     * @return возвращает список всех подразделений из базы
     */
	public List<Subdivision> getSubDivision();
	/**
     * Функция создания внутреннией <b>Накладной</b>
     * @param numberInv - номер накладной
     * @param dateInv - дата выписки накладной
     *  @param subDivID - ID подразделения для внутренних накладных
     *  @param stringsInv - список строк накладных, взятых из таблицы
     */
	public void createInvoice(String numberInv, String dateInv, Short subDivID, List<InvoiceString> stringsInv);
	/**
     * Функция создания внешней <b>Накладной</b>
     * @param numberInv - номер накладной
     * @param dateInv - дата выписки накладной
     *  @param stringsInv - список строк накладных, взятых из таблицы
     */
	public void createInvoice(String numberInv, String dateInv, List<InvoiceString> stringsInv);
	/**
     * Функция обновления внутренней <b>Накладной</b>
     * @param numberInv - номер накладной
     * @param dateInv - дата выписки накладной
     *  @param subDivID - ID подразделения для внутренних накладных
     *  @param stringsInv - список строк накладных, взятых из таблицы
     */
	public void updateInvoice(String numberInv, String dateInv, Short subDivID, List<InvoiceString> stringsInv);
	/**
     * Функция обновления внешней <b>Накладной</b>
     * @param numberInv - номер накладной
     * @param dateInv - дата выписки накладной
     *  @param stringsInv - список строк накладных, взятых из таблицы
     */
	public void updateInvoice(String numberInv, String dateInv, List<InvoiceString> stringsInv);
	
}
