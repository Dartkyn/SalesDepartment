package com.forms;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.MaskFormatter;

import com.control.Controller;
import com.control.ControllerImplement;

import test.backend.Bank;
import test.backend.City;
import test.backend.Company;
import test.backend.Contract;
import test.backend.InvoiceHeader;
import test.backend.Package;
import test.backend.Product;
import test.backend.Subdivision;
import test.backend.measureunit;

public class WorkForm {

	private JFrame frame;
	private JFormattedTextField numberInvTextField;
	private JTable invRowTable;
	private JTable allInvTable;
	private JFormattedTextField numberContractTextField;
	private JTable delivShedTable;
	private JTable allContractTable;
	private JFormattedTextField textField;
	private static Controller controller;
	private int invCount = 1;
	private int contrCount = 1;
	private Integer countAllInv = 0;
	private Integer countAllContract = 0;
	public int getContrCount() {
		return contrCount;
	}

	public void setContrCount(int contrCount) {
		this.contrCount = contrCount;
	}

	public int getInvCount() {
		return invCount;
	}

	public void setInvCount(int invCount) {
		this.invCount = invCount;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					controller = new ControllerImplement();
					WorkForm window = new WorkForm();
					window.frame.setVisible(true);
					window.frame.setTitle("?????? ?????????????????????? ???????????? ??????????");
					window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public WorkForm() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frame = new JFrame();
		frame.setBounds(100, 100, 1188, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel southPanel = new JPanel();
		frame.getContentPane().add(southPanel, BorderLayout.SOUTH);
		
		JPanel centerPanel = new JPanel();
		frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new CardLayout(0, 0));
		
		JPanel enterPanel = new JPanel();
		centerPanel.add(enterPanel, "name_62424711994489");
		GridBagLayout gbl_enterPanel = new GridBagLayout();
		gbl_enterPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_enterPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_enterPanel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_enterPanel.rowWeights = new double[]{1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		enterPanel.setLayout(gbl_enterPanel);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 20;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		enterPanel.add(panel_2, gbc_panel_2);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridheight = 6;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 1;
		enterPanel.add(panel_4, gbc_panel_4);
		
		JButton btnInvoice = new JButton("?????????????? ?? ??????????????????");
		
		GridBagConstraints gbc_btnInvoice = new GridBagConstraints();
		gbc_btnInvoice.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnInvoice.insets = new Insets(0, 0, 5, 5);
		gbc_btnInvoice.gridx = 11;
		gbc_btnInvoice.gridy = 1;
		enterPanel.add(btnInvoice, gbc_btnInvoice);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.gridheight = 6;
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 19;
		gbc_panel_5.gridy = 1;
		enterPanel.add(panel_5, gbc_panel_5);
		
		JButton btnContract = new JButton("?????????????? ?? ??????????????????");
		
		GridBagConstraints gbc_btnContract = new GridBagConstraints();
		gbc_btnContract.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnContract.insets = new Insets(0, 0, 5, 5);
		gbc_btnContract.gridx = 11;
		gbc_btnContract.gridy = 3;
		enterPanel.add(btnContract, gbc_btnContract);
		btnContract.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_19668433211996");
			}
		});
		
		JButton btnClose = new JButton("??????????");
		GridBagConstraints gbc_btnClose = new GridBagConstraints();
		gbc_btnClose.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnClose.insets = new Insets(0, 0, 5, 5);
		gbc_btnClose.gridx = 11;
		gbc_btnClose.gridy = 6;
		enterPanel.add(btnClose, gbc_btnClose);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 20;
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 7;
		enterPanel.add(panel_3, gbc_panel_3);
		
		JPanel newInvocePanel = new JPanel();
		centerPanel.add(newInvocePanel, "name_19561014887317");
		GridBagLayout gbl_newInvocePanel = new GridBagLayout();
		gbl_newInvocePanel.columnWidths = new int[]{0, 0, 0, 0, 0, 151, 0, 0};
		gbl_newInvocePanel.rowHeights = new int[]{0, 0, 89, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_newInvocePanel.columnWeights = new double[]{0.01, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0};
		gbl_newInvocePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		newInvocePanel.setLayout(gbl_newInvocePanel);
		
		JLabel lblNewLabel_4 = new JLabel("???????????????? ??????????????????");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 6;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 0;
		newInvocePanel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("?????????? ??????????????????");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 1;
		newInvocePanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		numberInvTextField = new JFormattedTextField(new MaskFormatter("3-########-##"));
		numberInvTextField.setToolTipText("?????????????????????? ?? ?????????????? ????????????????-??????, ??????  ?? - ??????, ?? - ??????????, ?? - ????????, ?? ?????? - ?????????? ???? ?????????????? ???? ????????");
		GridBagConstraints gbc_numberInvTextField = new GridBagConstraints();
		gbc_numberInvTextField.insets = new Insets(0, 0, 5, 5);
		gbc_numberInvTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_numberInvTextField.gridx = 2;
		gbc_numberInvTextField.gridy = 1;
		newInvocePanel.add(numberInvTextField, gbc_numberInvTextField);
		numberInvTextField.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("??????????????????????????");
		GridBagConstraints gbc_lblNewLabel_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_1.gridx = 3;
		gbc_lblNewLabel_3_1.gridy = 1;
		newInvocePanel.add(lblNewLabel_3_1, gbc_lblNewLabel_3_1);
		
		JComboBox<Subdivision> subDivisComboBox = new JComboBox<Subdivision>();
		for(Subdivision product:controller.getSubDivision())
		{
			subDivisComboBox.addItem(product);
		}
		Subdivision sub = null;
		subDivisComboBox.addItem(sub);
		subDivisComboBox.setSelectedItem(sub);
		GridBagConstraints gbc_subDivisComboBox = new GridBagConstraints();
		gbc_subDivisComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_subDivisComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_subDivisComboBox.gridx = 4;
		gbc_subDivisComboBox.gridy = 1;
		newInvocePanel.add(subDivisComboBox, gbc_subDivisComboBox);
		
		JLabel lblNewLabel_4_1 = new JLabel("???????? ?????????????? ??????????????????");
		GridBagConstraints gbc_lblNewLabel_4_1 = new GridBagConstraints();
		gbc_lblNewLabel_4_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4_1.gridx = 5;
		gbc_lblNewLabel_4_1.gridy = 1;
		newInvocePanel.add(lblNewLabel_4_1, gbc_lblNewLabel_4_1);
		
		JFormattedTextField dateInvFormattedTextField = new JFormattedTextField(new MaskFormatter("##.##.####"));
		dateInvFormattedTextField.setColumns(10);
		GridBagConstraints gbc_dateInvFormattedTextField = new GridBagConstraints();
		gbc_dateInvFormattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_dateInvFormattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateInvFormattedTextField.gridx = 6;
		gbc_dateInvFormattedTextField.gridy = 1;
		newInvocePanel.add(dateInvFormattedTextField, gbc_dateInvFormattedTextField);
		JButton btnInsertInvRow = new JButton("???????????????? ????????????");
		GridBagConstraints gbc_btnInsertInvRow = new GridBagConstraints();
		gbc_btnInsertInvRow.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnInsertInvRow.insets = new Insets(0, 0, 5, 5);
		gbc_btnInsertInvRow.gridx = 0;
		gbc_btnInsertInvRow.gridy = 2;
		newInvocePanel.add(btnInsertInvRow, gbc_btnInsertInvRow);
		
		JScrollPane scrollInvoiceNewPane = new JScrollPane();
		GridBagConstraints gbc_scrollInvoiceNewPane = new GridBagConstraints();
		gbc_scrollInvoiceNewPane.gridheight = 9;
		gbc_scrollInvoiceNewPane.fill = GridBagConstraints.BOTH;
		gbc_scrollInvoiceNewPane.gridwidth = 7;
		gbc_scrollInvoiceNewPane.gridx = 1;
		gbc_scrollInvoiceNewPane.gridy = 2;
		newInvocePanel.add(scrollInvoiceNewPane, gbc_scrollInvoiceNewPane);
		String[] coulmnHeader= {
				"??? ??/??",
				"??????????, ??????",
				"????. ??????.",
				"?????? ????????????????",
				"????????????????????",
				"?????????? ????????????",
				"?????????? ??????????",
				"????????, ??????. ??????.",
				"??????"
				};
		String[][] data= {
				{"","","","","","","","","","",""}
				};
		invRowTable = new JTable(data, coulmnHeader);
		invRowTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", "", "", null, null, null, null, null},
			},
			new String[] {
				"\u2116 \u043F/\u043F", "\u0422\u043E\u0432\u0430\u0440", "\u0415\u0434. \u0438\u0437\u043C.", "\u0412\u0438\u0434 \u0443\u043F\u0430\u043A\u043E\u0432\u043A\u0438", "\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E", "\u041C\u0430\u0441\u0441\u0430 \u0431\u0440\u0443\u0442\u0442\u043E", "\u041C\u0430\u0441\u0441\u0430 \u043D\u0435\u0442\u0442\u043E", "\u0426\u0435\u043D\u0430, \u0440\u0443\u0431. \u043A\u043E\u043F.", "\u041D\u0414\u0421"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Short.class, Double.class, Double.class, Double.class, Double.class
			};
			@Override
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true, true, true, true
			};
			@Override
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		invRowTable.getColumnModel().getColumn(0).setPreferredWidth(50);
		invRowTable.getColumnModel().getColumn(0).setMaxWidth(50);
		invRowTable.getColumnModel().getColumn(1).setPreferredWidth(152);
		invRowTable.getColumnModel().getColumn(2).setPreferredWidth(105);
		invRowTable.getColumnModel().getColumn(2).setMaxWidth(200);
		invRowTable.getColumnModel().getColumn(3).setPreferredWidth(105);
		invRowTable.getColumnModel().getColumn(3).setMaxWidth(200);
		invRowTable.getColumnModel().getColumn(4).setPreferredWidth(89);
		invRowTable.getColumnModel().getColumn(4).setMaxWidth(250);
		invRowTable.getColumnModel().getColumn(5).setPreferredWidth(97);
		invRowTable.getColumnModel().getColumn(5).setMaxWidth(250);
		invRowTable.getColumnModel().getColumn(6).setPreferredWidth(89);
		invRowTable.getColumnModel().getColumn(6).setMaxWidth(250);
		invRowTable.getColumnModel().getColumn(7).setPreferredWidth(110);
		invRowTable.getColumnModel().getColumn(7).setMaxWidth(250);
		invRowTable.getColumnModel().getColumn(8).setMaxWidth(75);
		scrollInvoiceNewPane.setViewportView(invRowTable);
		invRowTable.setValueAt(invCount, 0, 0);
		JComboBox<Product> comboBox = new JComboBox<Product>();
		for(Product product:controller.getProduct())
		{
			comboBox.addItem(product);
		}
		TableColumn productColumn = invRowTable.getColumnModel().getColumn(1);
		productColumn.setCellEditor(new DefaultCellEditor(comboBox));
		JComboBox<measureunit> unitcomboBox = new JComboBox<measureunit>();
		for(measureunit unit:controller.getMeasUnit())
		{
			unitcomboBox.addItem(unit);
		}
		TableColumn unitColumn = invRowTable.getColumnModel().getColumn(2);
		unitColumn.setCellEditor(new DefaultCellEditor(unitcomboBox));
		JComboBox<Package> packageInvComboBox = new JComboBox<Package>();
		for(Package pack: controller.getPackage())
		{
			packageInvComboBox.addItem(pack);
		}
		TableColumn packageInvColumn = invRowTable.getColumnModel().getColumn(3);
		packageInvColumn.setCellEditor(new DefaultCellEditor(packageInvComboBox));
		JButton btnDelInvRow = new JButton("?????????????? ????????????");
		GridBagConstraints gbc_btnDelInvRow = new GridBagConstraints();
		gbc_btnDelInvRow.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDelInvRow.anchor = GridBagConstraints.NORTH;
		gbc_btnDelInvRow.insets = new Insets(0, 0, 5, 5);
		gbc_btnDelInvRow.gridx = 0;
		gbc_btnDelInvRow.gridy = 3;
		newInvocePanel.add(btnDelInvRow, gbc_btnDelInvRow);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		newInvocePanel.add(panel, gbc_panel);
		
		JButton btnGotoInvoiceList = new JButton("?? ???????????? ??????????????????");
		GridBagConstraints gbc_btnGotoInvoiceList = new GridBagConstraints();
		gbc_btnGotoInvoiceList.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGotoInvoiceList.insets = new Insets(0, 0, 5, 5);
		gbc_btnGotoInvoiceList.gridx = 0;
		gbc_btnGotoInvoiceList.gridy = 8;
		newInvocePanel.add(btnGotoInvoiceList, gbc_btnGotoInvoiceList);
		
		
		JButton btnSaveInvoice = new JButton("?????????????????? ??????????????????");
		GridBagConstraints gbc_btnSaveInvoice = new GridBagConstraints();
		gbc_btnSaveInvoice.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSaveInvoice.insets = new Insets(0, 0, 5, 5);
		gbc_btnSaveInvoice.gridx = 0;
		gbc_btnSaveInvoice.gridy = 9;
		newInvocePanel.add(btnSaveInvoice, gbc_btnSaveInvoice);
		
		JButton btnExit = new JButton("?????????????????? ???? ??????????????");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 10;
		newInvocePanel.add(btnExit, gbc_btnExit);
		JPanel showInvoicePanel = new JPanel();
		centerPanel.add(showInvoicePanel, "name_19617120491862");
		GridBagLayout gbl_showInvoicePanel = new GridBagLayout();
		gbl_showInvoicePanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_showInvoicePanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_showInvoicePanel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_showInvoicePanel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		showInvoicePanel.setLayout(gbl_showInvoicePanel);
		
		JLabel label = new JLabel("???????????? ??????????????????");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		showInvoicePanel.add(label, gbc_label);
		
		JScrollPane allInvScrollPane = new JScrollPane();
		GridBagConstraints gbc_allInvScrollPane = new GridBagConstraints();
		gbc_allInvScrollPane.gridheight = 3;
		gbc_allInvScrollPane.gridwidth = 2;
		gbc_allInvScrollPane.fill = GridBagConstraints.BOTH;
		gbc_allInvScrollPane.gridx = 1;
		gbc_allInvScrollPane.gridy = 1;
		showInvoicePanel.add(allInvScrollPane, gbc_allInvScrollPane);
		String[] coulmnInvHeader= {
				"??? ??/??",
				"?????????? ??????????????????",
				"???????? ?????????????? ??????????????????"
				};
		String[][] dataInv= {
				{"","",""}
				};
		allInvTable = new JTable(dataInv,coulmnInvHeader);
		allInvTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u2116 \u043F/\u043F", "\u041D\u043E\u043C\u0435\u0440 \u043D\u0430\u043A\u043B\u0430\u0434\u043D\u043E\u0439", "\u0414\u0430\u0442\u0430 \u0432\u044B\u043F\u0438\u0441\u043A\u0438 \u043D\u0430\u043A\u043B\u0430\u0434\u043D\u043E\u0439"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			@Override
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		allInvTable.getColumnModel().getColumn(0).setPreferredWidth(38);
		allInvTable.getColumnModel().getColumn(0).setMaxWidth(500);
		DefaultTableModel modelAllInvHead = (DefaultTableModel) allInvTable.getModel();
		for(InvoiceHeader invHead:controller.getFiltredInvHeader())
		{	countAllInv++;
			String[] str= new String[]{countAllInv.toString(), invHead.getNumber(), invHead.getInvoiceDate()};
			modelAllInvHead.addRow(str);
		}
		allInvScrollPane.setViewportView(allInvTable);
		
		JButton btnCreateNewInvoice = new JButton("???????????????? ??????????????????");

		GridBagConstraints gbc_btnCreateNewInvoice = new GridBagConstraints();
		gbc_btnCreateNewInvoice.insets = new Insets(0, 0, 5, 5);
		gbc_btnCreateNewInvoice.gridx = 0;
		gbc_btnCreateNewInvoice.gridy = 2;
		showInvoicePanel.add(btnCreateNewInvoice, gbc_btnCreateNewInvoice);
		
		JButton btnBackToMain = new JButton("?????????????????? ???? ??????????????");

		GridBagConstraints gbc_btnBackToMain = new GridBagConstraints();
		gbc_btnBackToMain.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBackToMain.insets = new Insets(0, 0, 0, 5);
		gbc_btnBackToMain.gridx = 0;
		gbc_btnBackToMain.gridy = 3;
		showInvoicePanel.add(btnBackToMain, gbc_btnBackToMain);
		
		JPanel newContractPanel = new JPanel();
		centerPanel.add(newContractPanel, "name_19668433211996");
		GridBagLayout gbl_newContractPanel = new GridBagLayout();
		gbl_newContractPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_newContractPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_newContractPanel.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_newContractPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		newContractPanel.setLayout(gbl_newContractPanel);
		
		JLabel label_1 = new JLabel("??????????????");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 0;
		newContractPanel.add(label_1, gbc_label_1);
		
		JLabel label_3 = new JLabel("?????????? ????????????????");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 1;
		newContractPanel.add(label_3, gbc_label_3);
		
		numberContractTextField = new JFormattedTextField(new MaskFormatter("1-########-##"));
		numberContractTextField.setToolTipText("?????????????????????? ?? ?????????????? ????????????????-??????, ??????  ?? - ??????, ?? - ??????????, ?? - ????????, ?? ?????? - ?????????? ???? ?????????????? ???? ????????");
		GridBagConstraints gbc_numberContractTextField = new GridBagConstraints();
		gbc_numberContractTextField.insets = new Insets(0, 0, 5, 5);
		gbc_numberContractTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_numberContractTextField.gridx = 2;
		gbc_numberContractTextField.gridy = 1;
		newContractPanel.add(numberContractTextField, gbc_numberContractTextField);
		numberContractTextField.setColumns(10);
		
		JLabel label_3_1 = new JLabel("???????? ???????????????????? ????????????????");
		GridBagConstraints gbc_label_3_1 = new GridBagConstraints();
		gbc_label_3_1.anchor = GridBagConstraints.EAST;
		gbc_label_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_3_1.gridx = 3;
		gbc_label_3_1.gridy = 1;
		newContractPanel.add(label_3_1, gbc_label_3_1);
		
		JFormattedTextField dateContrFormattedTextField = new JFormattedTextField(new MaskFormatter("##.##.####"));
		GridBagConstraints gbc_dateContrFormattedTextField = new GridBagConstraints();
		gbc_dateContrFormattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_dateContrFormattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateContrFormattedTextField.gridx = 4;
		gbc_dateContrFormattedTextField.gridy = 1;
		newContractPanel.add(dateContrFormattedTextField, gbc_dateContrFormattedTextField);
		
		JLabel label_3_1_1 = new JLabel("??????????????????????");
		GridBagConstraints gbc_label_3_1_1 = new GridBagConstraints();
		gbc_label_3_1_1.anchor = GridBagConstraints.EAST;
		gbc_label_3_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_3_1_1.gridx = 5;
		gbc_label_3_1_1.gridy = 1;
		newContractPanel.add(label_3_1_1, gbc_label_3_1_1);
		
		JComboBox<Company> companyComboBox = new JComboBox<Company>();
		for(Company product:controller.getCompanies())
		{
			companyComboBox.addItem(product);
		}
		GridBagConstraints gbc_companyComboBox = new GridBagConstraints();
		gbc_companyComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_companyComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_companyComboBox.gridx = 6;
		gbc_companyComboBox.gridy = 1;
		newContractPanel.add(companyComboBox, gbc_companyComboBox);
		
		JLabel label_3_2 = new JLabel("???????????????????? ??????????");
		GridBagConstraints gbc_label_3_2 = new GridBagConstraints();
		gbc_label_3_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_3_2.anchor = GridBagConstraints.EAST;
		gbc_label_3_2.gridx = 1;
		gbc_label_3_2.gridy = 2;
		newContractPanel.add(label_3_2, gbc_label_3_2);
		
		JComboBox<City> cityComboBox = new JComboBox<City>();
		for(City product:controller.getCities())
		{
			cityComboBox.addItem(product);
		}
		
		GridBagConstraints gbc_cityComboBox = new GridBagConstraints();
		gbc_cityComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_cityComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_cityComboBox.gridx = 2;
		gbc_cityComboBox.gridy = 2;
		newContractPanel.add(cityComboBox, gbc_cityComboBox);
		
		JLabel label_3_2_1 = new JLabel("????????");
		GridBagConstraints gbc_label_3_2_1 = new GridBagConstraints();
		gbc_label_3_2_1.anchor = GridBagConstraints.EAST;
		gbc_label_3_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_3_2_1.gridx = 3;
		gbc_label_3_2_1.gridy = 2;
		newContractPanel.add(label_3_2_1, gbc_label_3_2_1);
		
		JComboBox<Bank> bankComboBox = new JComboBox<Bank>();
		for(Bank product:controller.getBanks())
		{
			bankComboBox.addItem(product);
		}
		GridBagConstraints gbc_bankComboBox = new GridBagConstraints();
		gbc_bankComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_bankComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_bankComboBox.gridx = 4;
		gbc_bankComboBox.gridy = 2;
		newContractPanel.add(bankComboBox, gbc_bankComboBox);
		
		JLabel label_3_2_1_1 = new JLabel("???????????????????? ????????");
		GridBagConstraints gbc_label_3_2_1_1 = new GridBagConstraints();
		gbc_label_3_2_1_1.anchor = GridBagConstraints.EAST;
		gbc_label_3_2_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_3_2_1_1.gridx = 5;
		gbc_label_3_2_1_1.gridy = 2;
		newContractPanel.add(label_3_2_1_1, gbc_label_3_2_1_1);
		
		textField = new JFormattedTextField(new MaskFormatter("###################"));
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 6;
		gbc_textField.gridy = 2;
		newContractPanel.add(textField, gbc_textField);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 13;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 6;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		newContractPanel.add(scrollPane, gbc_scrollPane);
		String[] coulmnAddContractHeader= {
				"??? ??/??",
				"??????????, ??????",
				"?????? ????????????????",
				"???????????????????? ???????????? ?? ????????????????",
				"????????, ??????. ??????.",
				"???????? ???????????????? ????????????"
				};
		String[][] dataAddContract= {
				{"","","","","",""},
				};
		delivShedTable = new JTable(dataAddContract,coulmnAddContractHeader);
		delivShedTable.setCellSelectionEnabled(true);
		delivShedTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", "", null, null, ""},
			},
			new String[] {
				"\u2116 \u043F/\u043F", "\u0422\u043E\u0432\u0430\u0440", "\u0412\u0438\u0434 \u0443\u043F\u0430\u043A\u043E\u0432\u043A\u0438", "\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0442\u043E\u0432\u0430\u0440\u0430 \u043A \u043E\u0442\u0433\u0440\u0443\u0437\u043A\u0435", "\u0426\u0435\u043D\u0430, \u0440\u0443\u0431. \u043A\u043E\u043F.", "\u0414\u0430\u0442\u0430 \u043F\u043E\u0441\u0442\u0430\u0432\u043A\u0438 \u0442\u043E\u0432\u0430\u0440\u0430"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Short.class, Double.class, String.class
			};
			@Override
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		delivShedTable.getColumnModel().getColumn(0).setPreferredWidth(48);
		delivShedTable.getColumnModel().getColumn(0).setMaxWidth(50);
		delivShedTable.getColumnModel().getColumn(1).setPreferredWidth(120);
		delivShedTable.getColumnModel().getColumn(1).setMaxWidth(600);
		delivShedTable.getColumnModel().getColumn(2).setPreferredWidth(100);
		delivShedTable.getColumnModel().getColumn(2).setMaxWidth(150);
		delivShedTable.getColumnModel().getColumn(3).setPreferredWidth(146);
		delivShedTable.getColumnModel().getColumn(3).setMaxWidth(170);
		delivShedTable.getColumnModel().getColumn(4).setPreferredWidth(114);
		delivShedTable.getColumnModel().getColumn(4).setMaxWidth(150);
		delivShedTable.getColumnModel().getColumn(5).setPreferredWidth(165);
		delivShedTable.getColumnModel().getColumn(5).setMaxWidth(170);
		scrollPane.setViewportView(delivShedTable);
		delivShedTable.setValueAt(contrCount, 0, 0);
		JComboBox<Product> productComboBox = new JComboBox<Product>();
		for(Product product:controller.getProduct())
		{
			productComboBox.addItem(product);
		}
		TableColumn productContractColumn = delivShedTable.getColumnModel().getColumn(1);
		productContractColumn.setCellEditor(new DefaultCellEditor(productComboBox));
		JComboBox<Package> packageComboBox = new JComboBox<Package>();
		for(Package pack: controller.getPackage())
		{
			packageComboBox.addItem(pack);
		}
		TableColumn packageColumn = delivShedTable.getColumnModel().getColumn(2);
		packageColumn.setCellEditor(new DefaultCellEditor(packageComboBox));
		
		JFormattedTextField dateDelivFormattedTextField = new JFormattedTextField(new MaskFormatter("##.##.####"));
		TableColumn dateDelivContractColumn = delivShedTable.getColumnModel().getColumn(5);
		dateDelivContractColumn.setCellEditor(new DefaultCellEditor(dateDelivFormattedTextField));
		
		JButton btnNewContractStrButton = new JButton("???????????????? ????????????");
		
		GridBagConstraints gbc_btnNewContractStrButton = new GridBagConstraints();
		gbc_btnNewContractStrButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewContractStrButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewContractStrButton.gridx = 0;
		gbc_btnNewContractStrButton.gridy = 3;
		newContractPanel.add(btnNewContractStrButton, gbc_btnNewContractStrButton);
		
		JButton btnDelContractString = new JButton("?????????????? ????????????");

		GridBagConstraints gbc_btnDelContractString = new GridBagConstraints();
		gbc_btnDelContractString.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDelContractString.insets = new Insets(0, 0, 5, 5);
		gbc_btnDelContractString.gridx = 0;
		gbc_btnDelContractString.gridy = 4;
		newContractPanel.add(btnDelContractString, gbc_btnDelContractString);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 5;
		newContractPanel.add(panel_1, gbc_panel_1);
		
		JButton btnShowAllContracts = new JButton("?????????????? ?? ??????????????????");
		
		GridBagConstraints gbc_btnShowAllContracts = new GridBagConstraints();
		gbc_btnShowAllContracts.insets = new Insets(0, 0, 5, 5);
		gbc_btnShowAllContracts.gridx = 0;
		gbc_btnShowAllContracts.gridy = 13;
		newContractPanel.add(btnShowAllContracts, gbc_btnShowAllContracts);
		
		JButton btnSaveContract = new JButton("?????????????????? ??????????????????");
		GridBagConstraints gbc_btnSaveContract = new GridBagConstraints();
		gbc_btnSaveContract.insets = new Insets(0, 0, 5, 5);
		gbc_btnSaveContract.gridx = 0;
		gbc_btnSaveContract.gridy = 14;
		newContractPanel.add(btnSaveContract, gbc_btnSaveContract);
		
		JButton btnExitContract = new JButton("?????????????????? ???? ??????????????");

		GridBagConstraints gbc_btnExitContract = new GridBagConstraints();
		gbc_btnExitContract.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExitContract.insets = new Insets(0, 0, 0, 5);
		gbc_btnExitContract.gridx = 0;
		gbc_btnExitContract.gridy = 15;
		newContractPanel.add(btnExitContract, gbc_btnExitContract);
		
		JPanel showContractPanel = new JPanel();
		centerPanel.add(showContractPanel, "name_19671339404383");
		GridBagLayout gbl_showContractPanel = new GridBagLayout();
		gbl_showContractPanel.columnWidths = new int[]{0, 0, 0};
		gbl_showContractPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_showContractPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_showContractPanel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		showContractPanel.setLayout(gbl_showContractPanel);
		
		JLabel label_2 = new JLabel("???????????? ??????????????????");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 0;
		showContractPanel.add(label_2, gbc_label_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 3;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 1;
		showContractPanel.add(scrollPane_1, gbc_scrollPane_1);
		String[] coulmnContractHeader= {
				"??? ??/??",
				"?????????? ????????????????",
				"???????? ????????????????????"
				};
		String[][] dataContract= {
				{"","",""},
				{"","",""},
				{"","",""},
				{"","",""},
				{"","",""}
				};
		allContractTable = new JTable(dataContract, coulmnContractHeader);
		allContractTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u2116 \u043F/\u043F", "\u041D\u043E\u043C\u0435\u0440 \u0434\u043E\u0433\u043E\u0432\u043E\u0440\u0430", "\u041D\u043E\u043C\u0435\u0440 \u0434\u043E\u0433\u043E\u0432\u043E\u0440\u0430", "\u041E\u0440\u0433\u0430\u043D\u0438\u0437\u0430\u0446\u0438\u044F"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, true
			};
			@Override
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		allContractTable.getColumnModel().getColumn(0).setPreferredWidth(43);
		allContractTable.getColumnModel().getColumn(0).setMaxWidth(50);
		DefaultTableModel modelAllContract = (DefaultTableModel) allContractTable.getModel();
		for(Contract contract:controller.getFiltredContracts())
		{	countAllContract++;
			String[] str= new String[]{countAllContract.toString(), contract.getNumber(), contract.getContractDate(),
					contract.getCompanyID().getName()};
			modelAllContract.addRow(str);
		}
		scrollPane_1.setViewportView(allContractTable);
		
		JButton btnCreateNewContract = new JButton("???????????????? ??????????????");

		GridBagConstraints gbc_btnCreateNewContract = new GridBagConstraints();
		gbc_btnCreateNewContract.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCreateNewContract.insets = new Insets(0, 0, 5, 5);
		gbc_btnCreateNewContract.gridx = 0;
		gbc_btnCreateNewContract.gridy = 2;
		showContractPanel.add(btnCreateNewContract, gbc_btnCreateNewContract);
		
		JButton btnBackFromContracts = new JButton("?????????????????? ???? ??????????????");
		
		GridBagConstraints gbc_btnBackFromContracts = new GridBagConstraints();
		gbc_btnBackFromContracts.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBackFromContracts.insets = new Insets(0, 0, 0, 5);
		gbc_btnBackFromContracts.gridx = 0;
		gbc_btnBackFromContracts.gridy = 3;
		showContractPanel.add(btnBackFromContracts, gbc_btnBackFromContracts);
		/**
		???????????????????? ???????????? ???????????????? ???? ?????????? ???????????????? ??????????????????
		 */
		btnInvoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 CardLayout cl = (CardLayout)(centerPanel.getLayout());
				    cl.show(centerPanel, "name_19561014887317");
				    
			}
		});
		/**
		???????????????????? ???????????? ???????????????? ???? ?????????? ?????????????????? ??????????????????
		 */
		btnGotoInvoiceList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_19617120491862");
			}
		});
		/**
		???????????????????? ???????????? ???????????????? ???? ?????????? ?????????????????? ??????????????????
		 */
		btnShowAllContracts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_19671339404383");
			}
		});
		/**
		???????????????????? ???????????? ???????????????? ???? ?????????? ???????????????? ??????????????????
		 */
		btnCreateNewInvoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_19561014887317");
			}
		});
		/**
		???????????????????? ???????????? ???????????????? ???? ?????????? ???????????????? ????????????????
		 */
		btnCreateNewContract.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_19668433211996");
			}
		});
		/**
		???????????????????? ???????????? ???????????? ???? ?????????????? ??????????
		 */
		btnBackFromContracts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_62424711994489");
			}
		});
		/**
		???????????????????? ???????????? ???????????? ???? ?????????????? ??????????
		 */
		btnExitContract.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_62424711994489");
			}
		});
		/**
		???????????????????? ???????????? ???????????? ???? ?????????????? ??????????
		 */
		btnBackToMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_62424711994489");
			}
		});
		/**
		???????????????????? ???????????? ???????????? ???? ?????????????? ??????????
		 */
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_62424711994489");
			}
		});
		/**
		???????????????????? ???????????? ???????????????? ????????????????????
		 */
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		/**
		???????????????????? ???????????? ???????????????????? ????????????  ??????????????????
		 */
		btnInsertInvRow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 DefaultTableModel model = (DefaultTableModel) invRowTable.getModel();
				 setInvCount(getInvCount()+1);
			     model.addRow(new Object[]{getInvCount(), "", "","",""});
			}
		});
		/**
		???????????????????? ???????????? ???????????????? ????????????  ??????????????????
		 */
		btnDelInvRow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 DefaultTableModel model = (DefaultTableModel) invRowTable.getModel();
				 int index = invRowTable.getSelectedRow();
				 if(index >= 0);
				 {
					model.removeRow(index);
					int value = index+1;
					for(int i = index;i < getInvCount() - 1; i++)
					{
						invRowTable.setValueAt(value, i, 0);
						value++;
					}
					setInvCount(value - 1);
				 }
			}
		});
		/**
		???????????????????? ???????????? ???????????????????? ???????????? ?????????????? ????????????????
		 */
		btnNewContractStrButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) delivShedTable.getModel();
				setContrCount(getContrCount()+1);
			    model.addRow(new Object[]{getContrCount(),"", "",0, 0.0, ""});
			}
		});
		/**
		???????????????????? ???????????? ???????????????? ???????????? ?????????????? ????????????????
		 */
		btnDelContractString.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 DefaultTableModel model = (DefaultTableModel) delivShedTable.getModel();
				 int index = delivShedTable.getSelectedRow();
				 if(index >= 0);
				 {
					model.removeRow(index);
					int value = index+1;
					for(int i = index;i < getContrCount() - 1; i++)
					{
						delivShedTable.setValueAt(value, i, 0);
						value++;
					}
					setContrCount(value - 1);
				 }
			}
		});
		/**
		???????????????????? ???????????? ???????????????????? ??????????????????
		 */
		btnSaveInvoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InvoiceHeader invHead = null;
				Boolean fl = subDivisComboBox.getSelectedItem() == null;
				try {
					if(fl)
					{
						invHead = controller.createInvoice(numberInvTextField.getText(), 
								dateInvFormattedTextField.getText());
					}
					else
					{
						invHead = controller.createInvoice(numberInvTextField.getText(), 
								dateInvFormattedTextField.getText(),
								subDivisComboBox.getItemAt(subDivisComboBox.getSelectedIndex()));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				countAllInv++;
				String[] str= new String[]{countAllInv.toString(), invHead.getNumber(), invHead.getInvoiceDate()};
				modelAllInvHead.addRow(str);
				ArrayList<Product> prodList = new ArrayList<Product>(invRowTable.getModel().getRowCount());
				ArrayList<measureunit> unitList = new ArrayList<measureunit>(invRowTable.getModel().getRowCount());
				ArrayList<Package> packageList = new ArrayList<Package>(invRowTable.getModel().getRowCount());
				ArrayList<Object> amountList = new ArrayList<Object>(invRowTable.getModel().getRowCount());
				ArrayList<Object> grossList = new ArrayList<Object>(invRowTable.getModel().getRowCount());
				ArrayList<Object> netList = new ArrayList<Object>(invRowTable.getModel().getRowCount());
				ArrayList<Object> costList = new ArrayList<Object>(invRowTable.getModel().getRowCount());
				ArrayList<Object> vatList = new ArrayList<Object>(invRowTable.getModel().getRowCount());
				for(int i = 0; i< invRowTable.getModel().getRowCount(); i++)
				{
					int k = 0;
					String tempString = invRowTable.getModel().getValueAt(i, ++k).toString();
					prodList.add(i, controller.findProduct(tempString));
					tempString = invRowTable.getModel().getValueAt(i, ++k).toString();
					unitList.add(i,controller.findUnit(tempString));
					tempString = invRowTable.getModel().getValueAt(i, ++k).toString();
					packageList.add(i,controller.findPackage(tempString));
					amountList.add(i, invRowTable.getModel().getValueAt(i, ++k));
					grossList.add(i,invRowTable.getModel().getValueAt(i, ++k));
					netList.add(i,invRowTable.getModel().getValueAt(i, ++k));
					costList.add(i,invRowTable.getModel().getValueAt(i, ++k));
					vatList.add(i,invRowTable.getModel().getValueAt(i, ++k));
				}
				System.out.println(prodList);
				System.out.println(amountList);
				System.out.println(grossList);
				System.out.println(netList);
				System.out.println(costList);
				System.out.println(vatList);
				try {
					System.out.println(controller.converToInvoiceStrings(invHead, prodList, unitList, packageList, amountList, grossList, netList, costList, vatList));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		/**
		???????????????????? ???????????? ???????????????????? ????????????????
		 */
		btnSaveContract.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Contract contract = null;
				try {
					contract = controller.createContract(numberContractTextField.getText(),
							dateContrFormattedTextField.getText(), companyComboBox.getItemAt(companyComboBox.getSelectedIndex()),
							textField.getText(), cityComboBox.getItemAt(cityComboBox.getSelectedIndex()), bankComboBox.getItemAt(bankComboBox.getSelectedIndex()));
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				countAllContract++;
				String[] str= new String[]{countAllContract.toString(), contract.getNumber(), contract.getContractDate(),
						contract.getCompanyID().getName()};
				modelAllContract.addRow(str);
				int numberRow = delivShedTable.getModel().getRowCount();
				ArrayList<Product> prodList = new ArrayList<Product>(numberRow);
				ArrayList<Package> packageList = new ArrayList<Package>(numberRow);
				ArrayList<Object> amountList = new ArrayList<Object>(numberRow);
				ArrayList<Object> costList = new ArrayList<Object>(numberRow);
				ArrayList<Object> dateDelivList = new ArrayList<Object>(numberRow);
				for(int i = 0; i< delivShedTable.getModel().getRowCount(); i++)
				{
					int k = 0;
					String tempString = delivShedTable.getModel().getValueAt(i, ++k).toString();
					prodList.add(i, controller.findProduct(tempString));
					tempString = delivShedTable.getModel().getValueAt(i, ++k).toString();
					packageList.add(i,controller.findPackage(tempString));
					amountList.add(i, delivShedTable.getModel().getValueAt(i, ++k));
					costList.add(i,delivShedTable.getModel().getValueAt(i, ++k));
					dateDelivList.add(i,delivShedTable.getModel().getValueAt(i, ++k));
				}
				System.out.println(contract);
				System.out.println(prodList);
				System.out.println(amountList);
				System.out.println(costList);
				System.out.println(dateDelivList);
				try {
					System.out.println(controller.converToDelivSheduls(contract,
							prodList, 
							packageList, 
							amountList,
							costList, 
							dateDelivList));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}
