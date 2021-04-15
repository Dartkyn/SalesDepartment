package com.forms;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

public class WorkForm {

	private JFrame frame;
	private JTextField numberInvTextField;
	private JTable invRowTable;
	private JTable allInvTable;
	private JTextField numberContractTextField;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					WorkForm window = new WorkForm();
					window.frame.setVisible(true);
					window.frame.setTitle("АРМ специалиста отдела сбыта");
					window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WorkForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1188, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String date = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
		String time =  new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		
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
		gbl_enterPanel.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
		
		JButton btnInvoice = new JButton("Перейти к накладным");
		
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
		
		JButton btnContract = new JButton("Перейти к договорам");
		
		GridBagConstraints gbc_btnContract = new GridBagConstraints();
		gbc_btnContract.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnContract.insets = new Insets(0, 0, 5, 5);
		gbc_btnContract.gridx = 11;
		gbc_btnContract.gridy = 6;
		enterPanel.add(btnContract, gbc_btnContract);
		
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
		gbl_newInvocePanel.columnWidths = new int[]{0, 0, 0, 151, 0, 0};
		gbl_newInvocePanel.rowHeights = new int[]{0, 0, 89, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_newInvocePanel.columnWeights = new double[]{0.01, 1.0, 1.0, 0.0, 1.0, 0.0};
		gbl_newInvocePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		newInvocePanel.setLayout(gbl_newInvocePanel);
		
		JLabel lblNewLabel_4 = new JLabel("Товарная накладная");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 4;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 0;
		newInvocePanel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Номер накладной");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 1;
		newInvocePanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		numberInvTextField = new JTextField();
		GridBagConstraints gbc_numberInvTextField = new GridBagConstraints();
		gbc_numberInvTextField.insets = new Insets(0, 0, 5, 5);
		gbc_numberInvTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_numberInvTextField.gridx = 2;
		gbc_numberInvTextField.gridy = 1;
		newInvocePanel.add(numberInvTextField, gbc_numberInvTextField);
		numberInvTextField.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Дата выписки накладной");
		GridBagConstraints gbc_lblNewLabel_4_1 = new GridBagConstraints();
		gbc_lblNewLabel_4_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4_1.gridx = 3;
		gbc_lblNewLabel_4_1.gridy = 1;
		newInvocePanel.add(lblNewLabel_4_1, gbc_lblNewLabel_4_1);
		
		JFormattedTextField dateInvFormattedTextField = new JFormattedTextField();
		dateInvFormattedTextField.setColumns(10);
		GridBagConstraints gbc_dateInvFormattedTextField = new GridBagConstraints();
		gbc_dateInvFormattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_dateInvFormattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateInvFormattedTextField.gridx = 4;
		gbc_dateInvFormattedTextField.gridy = 1;
		newInvocePanel.add(dateInvFormattedTextField, gbc_dateInvFormattedTextField);
		JButton btnInsertInvRow = new JButton("Добавить строку");
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
		gbc_scrollInvoiceNewPane.gridwidth = 5;
		gbc_scrollInvoiceNewPane.gridx = 1;
		gbc_scrollInvoiceNewPane.gridy = 2;
		newInvocePanel.add(scrollInvoiceNewPane, gbc_scrollInvoiceNewPane);
		String[] coulmnHeader= {
				"№ п/п",
				"Товар",
				"Единица измерения",
				"Вид упаковки",
				"Количество",
				"Масса брутто",
				"Масса нетто",
				"Цена, руб. коп.",
				"Сумма без учета НДС, руб. коп.",
				"НДС",
				"Сумма с учетом НДС, руб. коп."
				};
		String[][] data= {
				{"","","","","","","","","","",""},
				{"","","","","","","","","","",""},
				{"","","","","","","","","","",""},
				{"","","","","","","","","","",""},
				{"","","","","","","","","","",""}
				};
		invRowTable = new JTable(data, coulmnHeader);
		scrollInvoiceNewPane.setViewportView(invRowTable);
		TableColumn productColumn = invRowTable.getColumnModel().getColumn(1);
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Snowboarding");
		comboBox.addItem("Rowing");
		comboBox.addItem("Chasing toddlers");
		comboBox.addItem("Speed reading");
		comboBox.addItem("Teaching high school");
		comboBox.addItem("None");
		productColumn.setCellEditor(new DefaultCellEditor(comboBox));
		TableColumn unitColumn = invRowTable.getColumnModel().getColumn(2);
		JComboBox<String> unitcomboBox = new JComboBox<String>();
		unitcomboBox.addItem("123");
		unitcomboBox.addItem("5667");
		unitcomboBox.addItem("14124");
		unitcomboBox.addItem("S2356as");
		unitcomboBox.addItem("trtrty");
		unitcomboBox.addItem("None");
		unitColumn.setCellEditor(new DefaultCellEditor(unitcomboBox));
		
		JButton btnDelInvRow = new JButton("Удалить строку");
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
		
		JButton btnGotoInvoiceList = new JButton("К списку накладных");
		GridBagConstraints gbc_btnGotoInvoiceList = new GridBagConstraints();
		gbc_btnGotoInvoiceList.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGotoInvoiceList.insets = new Insets(0, 0, 5, 5);
		gbc_btnGotoInvoiceList.gridx = 0;
		gbc_btnGotoInvoiceList.gridy = 8;
		newInvocePanel.add(btnGotoInvoiceList, gbc_btnGotoInvoiceList);
		
		
		JButton btnSaveInvoice = new JButton("Сохранить изменения");
		GridBagConstraints gbc_btnSaveInvoice = new GridBagConstraints();
		gbc_btnSaveInvoice.insets = new Insets(0, 0, 5, 5);
		gbc_btnSaveInvoice.gridx = 0;
		gbc_btnSaveInvoice.gridy = 9;
		newInvocePanel.add(btnSaveInvoice, gbc_btnSaveInvoice);
		
		JButton btnExit = new JButton("Выйти");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 10;
		newInvocePanel.add(btnExit, gbc_btnExit);
		JPanel showInvoicePanel = new JPanel();
		centerPanel.add(showInvoicePanel, "name_19617120491862");
		GridBagLayout gbl_showInvoicePanel = new GridBagLayout();
		gbl_showInvoicePanel.columnWidths = new int[]{0, 0};
		gbl_showInvoicePanel.rowHeights = new int[]{0, 0, 0};
		gbl_showInvoicePanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_showInvoicePanel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		showInvoicePanel.setLayout(gbl_showInvoicePanel);
		
		JLabel label = new JLabel("Список накладных");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		showInvoicePanel.add(label, gbc_label);
		
		JScrollPane allInvScrollPane = new JScrollPane();
		GridBagConstraints gbc_allInvScrollPane = new GridBagConstraints();
		gbc_allInvScrollPane.fill = GridBagConstraints.BOTH;
		gbc_allInvScrollPane.gridx = 0;
		gbc_allInvScrollPane.gridy = 1;
		showInvoicePanel.add(allInvScrollPane, gbc_allInvScrollPane);
		
		allInvTable = new JTable(13,10);
		allInvScrollPane.setViewportView(allInvTable);
		
		JPanel newContractPanel = new JPanel();
		centerPanel.add(newContractPanel, "name_19668433211996");
		GridBagLayout gbl_newContractPanel = new GridBagLayout();
		gbl_newContractPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_newContractPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_newContractPanel.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_newContractPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		newContractPanel.setLayout(gbl_newContractPanel);
		
		JLabel label_1 = new JLabel("Договор");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 0;
		newContractPanel.add(label_1, gbc_label_1);
		
		JLabel label_3 = new JLabel("Номер договора");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 1;
		newContractPanel.add(label_3, gbc_label_3);
		
		numberContractTextField = new JTextField();
		GridBagConstraints gbc_numberContractTextField = new GridBagConstraints();
		gbc_numberContractTextField.insets = new Insets(0, 0, 5, 5);
		gbc_numberContractTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_numberContractTextField.gridx = 2;
		gbc_numberContractTextField.gridy = 1;
		newContractPanel.add(numberContractTextField, gbc_numberContractTextField);
		numberContractTextField.setColumns(10);
		
		JLabel label_3_1 = new JLabel("Дата заключения договора");
		GridBagConstraints gbc_label_3_1 = new GridBagConstraints();
		gbc_label_3_1.anchor = GridBagConstraints.EAST;
		gbc_label_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_3_1.gridx = 3;
		gbc_label_3_1.gridy = 1;
		newContractPanel.add(label_3_1, gbc_label_3_1);
		
		JFormattedTextField dateContrFormattedTextField = new JFormattedTextField();
		GridBagConstraints gbc_dateContrFormattedTextField = new GridBagConstraints();
		gbc_dateContrFormattedTextField.insets = new Insets(0, 0, 5, 0);
		gbc_dateContrFormattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateContrFormattedTextField.gridx = 4;
		gbc_dateContrFormattedTextField.gridy = 1;
		newContractPanel.add(dateContrFormattedTextField, gbc_dateContrFormattedTextField);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 14;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		newContractPanel.add(scrollPane, gbc_scrollPane);
		
		table = new JTable(10,10);
		scrollPane.setViewportView(table);
		
		JButton btnNewContractStrButton = new JButton("Добавить строку");
		GridBagConstraints gbc_btnNewContractStrButton = new GridBagConstraints();
		gbc_btnNewContractStrButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewContractStrButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewContractStrButton.gridx = 0;
		gbc_btnNewContractStrButton.gridy = 3;
		newContractPanel.add(btnNewContractStrButton, gbc_btnNewContractStrButton);
		
		JButton btnDelContractString = new JButton("Удалить строку");
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
		
		JButton btnShowAllContracts = new JButton("Перейти к договорам");
		
		GridBagConstraints gbc_btnShowAllContracts = new GridBagConstraints();
		gbc_btnShowAllContracts.insets = new Insets(0, 0, 5, 5);
		gbc_btnShowAllContracts.gridx = 0;
		gbc_btnShowAllContracts.gridy = 13;
		newContractPanel.add(btnShowAllContracts, gbc_btnShowAllContracts);
		
		JButton btnSaveContract = new JButton("Сохранить изменения");
		GridBagConstraints gbc_btnSaveContract = new GridBagConstraints();
		gbc_btnSaveContract.insets = new Insets(0, 0, 5, 5);
		gbc_btnSaveContract.gridx = 0;
		gbc_btnSaveContract.gridy = 14;
		newContractPanel.add(btnSaveContract, gbc_btnSaveContract);
		
		JButton btnExitContract = new JButton("Выход");
		GridBagConstraints gbc_btnExitContract = new GridBagConstraints();
		gbc_btnExitContract.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExitContract.insets = new Insets(0, 0, 0, 5);
		gbc_btnExitContract.gridx = 0;
		gbc_btnExitContract.gridy = 15;
		newContractPanel.add(btnExitContract, gbc_btnExitContract);
		
		JPanel showContractPanel = new JPanel();
		centerPanel.add(showContractPanel, "name_19671339404383");
		GridBagLayout gbl_showContractPanel = new GridBagLayout();
		gbl_showContractPanel.columnWidths = new int[]{0, 0};
		gbl_showContractPanel.rowHeights = new int[]{0, 0, 0};
		gbl_showContractPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_showContractPanel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		showContractPanel.setLayout(gbl_showContractPanel);
		
		JLabel label_2 = new JLabel("Список договоров");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 0;
		showContractPanel.add(label_2, gbc_label_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 1;
		showContractPanel.add(scrollPane_1, gbc_scrollPane_1);
		
		table_1 = new JTable(12, 5);
		scrollPane_1.setViewportView(table_1);
		btnInvoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 CardLayout cl = (CardLayout)(centerPanel.getLayout());
				    cl.show(centerPanel, "name_19561014887317");
				    
			}
		});
		btnContract.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_19668433211996");
			}
		});
		btnGotoInvoiceList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_19617120491862");
			}
		});
		btnShowAllContracts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout)(centerPanel.getLayout());
			    cl.show(centerPanel, "name_19671339404383");
			}
		});
	}
}
