package com.forms;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class WorkForm {

	private JFrame frame;
	private JTextField textField;
	private JTable invRowTable;

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
		frame.setBounds(100, 100, 737, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(new Color(255, 250, 205));
		frame.getContentPane().add(westPanel, BorderLayout.WEST);
		GridBagLayout gbl_westPanel = new GridBagLayout();
		gbl_westPanel.columnWidths = new int[]{0, 0};
		gbl_westPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_westPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_westPanel.rowWeights = new double[]{0.00, 0.00, 0.005, 0.0, 0.0, 0.5, 0.0, 0.05, 0.0, 0.05, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		westPanel.setLayout(gbl_westPanel);
		
		JLabel lblNewLabel = new JLabel("Дата");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		westPanel.add(lblNewLabel, gbc_lblNewLabel);
		String date = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
		
		JLabel lblNewLabel_1 = new JLabel("04/14/2021");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		westPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(255, 250, 205));
		GridBagConstraints gbc_panel_2_1 = new GridBagConstraints();
		gbc_panel_2_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2_1.fill = GridBagConstraints.BOTH;
		gbc_panel_2_1.gridx = 0;
		gbc_panel_2_1.gridy = 2;
		westPanel.add(panel_2_1, gbc_panel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Время текущей сессии");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		westPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		String time =  new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		JLabel lblNewLabel_1_1 = new JLabel(time);
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1_1.gridx = 0;
		gbc_lblNewLabel_1_1.gridy = 4;
		westPanel.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 250, 205));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 5;
		westPanel.add(panel_2, gbc_panel_2);
		
		JButton btnNewInvoice = new JButton("Накладные");
		GridBagConstraints gbc_btnNewInvoice = new GridBagConstraints();
		gbc_btnNewInvoice.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewInvoice.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewInvoice.gridx = 0;
		gbc_btnNewInvoice.gridy = 6;
		westPanel.add(btnNewInvoice, gbc_btnNewInvoice);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(255, 250, 205));
		GridBagConstraints gbc_panel_2_2 = new GridBagConstraints();
		gbc_panel_2_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2_2.gridx = 0;
		gbc_panel_2_2.gridy = 7;
		westPanel.add(panel_2_2, gbc_panel_2_2);
		
		JButton btnNewContract = new JButton("Договора");
		GridBagConstraints gbc_btnNewContract = new GridBagConstraints();
		gbc_btnNewContract.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewContract.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewContract.gridx = 0;
		gbc_btnNewContract.gridy = 8;
		westPanel.add(btnNewContract, gbc_btnNewContract);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(255, 250, 205));
		GridBagConstraints gbc_panel_2_3 = new GridBagConstraints();
		gbc_panel_2_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2_3.fill = GridBagConstraints.BOTH;
		gbc_panel_2_3.gridx = 0;
		gbc_panel_2_3.gridy = 9;
		westPanel.add(panel_2_3, gbc_panel_2_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 250, 205));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 12;
		westPanel.add(panel_5, gbc_panel_5);
		
		JPanel southPanel = new JPanel();
		frame.getContentPane().add(southPanel, BorderLayout.SOUTH);
		
		JPanel centerPanel = new JPanel();
		frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new CardLayout(0, 0));
		
		JPanel newInvocePanel = new JPanel();
		centerPanel.add(newInvocePanel, "name_19561014887317");
		GridBagLayout gbl_newInvocePanel = new GridBagLayout();
		gbl_newInvocePanel.columnWidths = new int[]{0, 0, 151, 0};
		gbl_newInvocePanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_newInvocePanel.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0};
		gbl_newInvocePanel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		newInvocePanel.setLayout(gbl_newInvocePanel);
		
		JLabel lblNewLabel_3 = new JLabel("Номер накладной");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		newInvocePanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		newInvocePanel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Дата выписки накладной");
		GridBagConstraints gbc_lblNewLabel_4_1 = new GridBagConstraints();
		gbc_lblNewLabel_4_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4_1.gridx = 2;
		gbc_lblNewLabel_4_1.gridy = 0;
		newInvocePanel.add(lblNewLabel_4_1, gbc_lblNewLabel_4_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setColumns(10);
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 0);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 3;
		gbc_formattedTextField.gridy = 0;
		newInvocePanel.add(formattedTextField, gbc_formattedTextField);
		
		JScrollPane scrollInvoiceNewPane = new JScrollPane();
		GridBagConstraints gbc_scrollInvoiceNewPane = new GridBagConstraints();
		gbc_scrollInvoiceNewPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollInvoiceNewPane.fill = GridBagConstraints.BOTH;
		gbc_scrollInvoiceNewPane.gridwidth = 4;
		gbc_scrollInvoiceNewPane.gridx = 0;
		gbc_scrollInvoiceNewPane.gridy = 1;
		newInvocePanel.add(scrollInvoiceNewPane, gbc_scrollInvoiceNewPane);
		
		invRowTable = new JTable(10, 10);
		scrollInvoiceNewPane.setViewportView(invRowTable);
		
		JButton btnInsertInvRow = new JButton("Добавить строку");
		GridBagConstraints gbc_btnInsertInvRow = new GridBagConstraints();
		gbc_btnInsertInvRow.insets = new Insets(0, 0, 5, 5);
		gbc_btnInsertInvRow.gridx = 1;
		gbc_btnInsertInvRow.gridy = 2;
		newInvocePanel.add(btnInsertInvRow, gbc_btnInsertInvRow);
		
		JButton btnDelInvRow = new JButton("Удалить строку");
		GridBagConstraints gbc_btnDelInvRow = new GridBagConstraints();
		gbc_btnDelInvRow.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDelInvRow.insets = new Insets(0, 0, 5, 5);
		gbc_btnDelInvRow.gridx = 2;
		gbc_btnDelInvRow.gridy = 2;
		newInvocePanel.add(btnDelInvRow, gbc_btnDelInvRow);
		
		JButton btnGotoInvoiceList = new JButton("Перейти к списку накладной");
		btnGotoInvoiceList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout crd = (CardLayout)centerPanel.getLayout();
			}
		});
		GridBagConstraints gbc_btnGotoInvoiceList = new GridBagConstraints();
		gbc_btnGotoInvoiceList.insets = new Insets(0, 0, 0, 5);
		gbc_btnGotoInvoiceList.gridx = 0;
		gbc_btnGotoInvoiceList.gridy = 3;
		newInvocePanel.add(btnGotoInvoiceList, gbc_btnGotoInvoiceList);
		
		JButton btnSaveInvoice = new JButton("Сохранить изменения");
		GridBagConstraints gbc_btnSaveInvoice = new GridBagConstraints();
		gbc_btnSaveInvoice.insets = new Insets(0, 0, 0, 5);
		gbc_btnSaveInvoice.gridx = 2;
		gbc_btnSaveInvoice.gridy = 3;
		newInvocePanel.add(btnSaveInvoice, gbc_btnSaveInvoice);
		
		JButton btnExit = new JButton("Выйти");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.gridx = 3;
		gbc_btnExit.gridy = 3;
		newInvocePanel.add(btnExit, gbc_btnExit);
		
		JPanel showInvoicePanel = new JPanel();
		centerPanel.add(showInvoicePanel, "name_19617120491862");
		GridBagLayout gbl_showInvoicePanel = new GridBagLayout();
		gbl_showInvoicePanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_showInvoicePanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_showInvoicePanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_showInvoicePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		showInvoicePanel.setLayout(gbl_showInvoicePanel);
		
		JLabel label = new JLabel("2");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridx = 2;
		gbc_label.gridy = 3;
		showInvoicePanel.add(label, gbc_label);
		
		JPanel newContractPanel = new JPanel();
		centerPanel.add(newContractPanel, "name_19668433211996");
		GridBagLayout gbl_newContractPanel = new GridBagLayout();
		gbl_newContractPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_newContractPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_newContractPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_newContractPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		newContractPanel.setLayout(gbl_newContractPanel);
		
		JLabel label_1 = new JLabel("3");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 2;
		newContractPanel.add(label_1, gbc_label_1);
		
		JPanel showContractPanel = new JPanel();
		centerPanel.add(showContractPanel, "name_19671339404383");
		GridBagLayout gbl_showContractPanel = new GridBagLayout();
		gbl_showContractPanel.columnWidths = new int[]{0, 0, 0};
		gbl_showContractPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_showContractPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_showContractPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		showContractPanel.setLayout(gbl_showContractPanel);
		
		JLabel label_2 = new JLabel("4");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 3;
		showContractPanel.add(label_2, gbc_label_2);
		
		JPanel newDelivShedPanel = new JPanel();
		centerPanel.add(newDelivShedPanel, "name_19674487712341");
		GridBagLayout gbl_newDelivShedPanel = new GridBagLayout();
		gbl_newDelivShedPanel.columnWidths = new int[]{0, 0, 0};
		gbl_newDelivShedPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_newDelivShedPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_newDelivShedPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		newDelivShedPanel.setLayout(gbl_newDelivShedPanel);
		
		JLabel label_3 = new JLabel("5");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 3;
		newDelivShedPanel.add(label_3, gbc_label_3);
		
		JPanel showDelivSedPanel = new JPanel();
		centerPanel.add(showDelivSedPanel, "name_19677969546928");
		GridBagLayout gbl_showDelivSedPanel = new GridBagLayout();
		gbl_showDelivSedPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_showDelivSedPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_showDelivSedPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_showDelivSedPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		showDelivSedPanel.setLayout(gbl_showDelivSedPanel);
		
		JLabel label_4 = new JLabel("6");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.gridx = 2;
		gbc_label_4.gridy = 2;
		showDelivSedPanel.add(label_4, gbc_label_4);
	}
}
