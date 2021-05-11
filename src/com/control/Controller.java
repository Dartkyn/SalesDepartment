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
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
     */
	public InvoiceHeader createInvoice(String numberInv, String dateInv, Subdivision subDivID) throws SQLException, ClassNotFoundException;
	/**
     * Функция создания внешней <b>Накладной</b>
     * @return созданную шапку накладной
     * @param numberInv - номер накладной
     * @param dateInv - дата выписки накладной
     *  @param stringsInv - список строк накладных, взятых из таблицы
     *  @throws SQLException
     */
	public InvoiceHeader createInvoice(String numberInv, String dateInv) throws SQLException;
	/**
     * Функция обновления внутренней <b>Накладной</b>
     * @return созданную шапку накладной
     *  @param invID - ID накладной
     * @param numberInv - номер накладной
     * @param dateInv - дата выписки накладной
     *  @param subDivID - ID подразделения для внутренних накладных
     *  @param stringsInv - список строк накладных, взятых из таблицы
	 * @throws SQLException 
     */
	public InvoiceHeader updateInvoice(Short invID, String numberInv, String dateInv, Short subDivID, List<InvoiceString> stringsInv) ;
	/**
     * Функция обновления внешней <b>Накладной</b>
     * @return обновленную шапку накладной
     *  @param invID - ID накладной
     * @param numberInv - номер накладной
     * @param dateInv - дата выписки накладной
     *  @param stringsInv - список строк накладных, взятых из таблицы
     */
	public InvoiceHeader updateInvoice(Short invID, String numberInv, String dateInv, List<InvoiceString> stringsInv);
	/**
     * Функция получения списка строк<b>Накладной</b> из данных в таблице
     * @param Short invHeadID - ID шапки накладной
     *  @param ArrayList<Product> prodList - содержимое таблицы - список продуктов
     * @param ArrayList<measureunit> - содержимое таблицы - список единиц измерения
     * @param ArrayList<Package> packageList - содержимое таблицы - список упаковок
     *  @param ArrayList<Object> amountList - содержимое таблицы - список количеств товара
     *  @param ArrayList<Object> grossList - содержимое таблицы - список брутто массы товара
     *  @param ArrayList<Object> netList - содержимое таблицы - список нетто массы товара
     *  @param ArrayList<Object> costList - содержимое таблицы - список цены за единицу товара
     *  @param ArrayList<Object> vatList - содержимое таблицы - список НДС на  товар
     *   @return возвращает <b>List<InvoiceString></b> - сформированный список строк накладной
	 * @throws SQLException 
     */
	public List<InvoiceString> converToInvoiceStrings(InvoiceHeader invHeadID, ArrayList<Product> prodList, ArrayList<measureunit> unitList, ArrayList<Package> packageList,
			ArrayList<Object> amountList, ArrayList<Object> grossList, ArrayList<Object> netList, ArrayList<Object> costList,
			ArrayList<Object> vatList) throws SQLException;
	/**
     * Функция получения <b>Товара</b> по строке 
     * @param str - строка таблицы, явлеется подстрокой при Product.toString()
     * @return возвращает Товар
     */
	public Product findProduct(String str);
	/**
     * Функция получения <b>Единицы измерения</b> по строке 
     * @param str - строка таблицы, явлеется подстрокой при measureunit.toString()
     * @return возвращает Единицу измерения
     */
	public measureunit findUnit(String str);
	/**
     * Функция получения <b>Упаковки</b> по строке 
     * @param str - строка таблицы, явлеется подстрокой при Package.toString()
     * @return возвращает Упаковку
     */
	public Package findPackage(String str);
	/**
     * Функция получения <b>Заголовка накладной</b> по строке 
     * @param str - строка таблицы, явлеется подстрокой при invoiceHeader.toString()
     * @return возвращает Заголовок накладной
     */
	public InvoiceHeader findHeader(String str);
	/**
     * Функция создания <b>Договора</b>
     * @param numberContract - номер договора
     * @param contractDate - дата заключения контракта
     * @param companyID - ID компании, с которой заключается договор
     * @param account - список строк накладных, взятых из таблицы
     * @param cityID - ID города, в котором заключается договор
     * @param bankID - ID банка
     * @return возвращает созданный контракт
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
     */
	public Contract createContract(String numberContract, String contractDate, Company companyID, String account, City cityID, Bank bankID) throws SQLException, ClassNotFoundException;
	/**
     * Функция получения списка строк<b>Графика поставки</b> из данных в таблице
     * @param Short invHeadID - ID шапки накладной
     *  @param ArrayList<Product> prodList - содержимое таблицы - список продуктов
     * @param ArrayList<Package> packageList - содержимое таблицы - список упаковок
     *  @param ArrayList<Object> amountProdList - содержимое таблицы - список количеств товара к отгрузке
     *  @param ArrayList<Object> costList - содержимое таблицы - список цены за единицу товара
     *  @param ArrayList<Object> dateDelivList - содержимое таблицы - дат поставки товаров
     *   @return возвращает <b>List<DeliveryShedule></b> - сформированный список строк графика поставки
     */
	public List<DeliveryShedule> converToInvoiceStrings(Contract contractID, ArrayList<Product> prodList,ArrayList<Package> packageList,
			ArrayList<Object> amountProdList, ArrayList<Object> costList,
			ArrayList<Object> dateDelivList);
}
