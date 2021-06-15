package M_Cap.shop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class shop {

	private JFrame frame;
	private JTextField textField;
	private JTextField monitorTextField;
	private JTextField perifericosTextField;
	private JTextField subtotalTextField;
	private JTextField ivaTextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField totalTextField;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shop window = new shop();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public shop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Shop");
		frame.setBounds(100, 100, 552, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Monitor LCD - 400");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(48, 133, 133, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Monitor CRT - 100");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(48, 92, 133, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setBounds(297, 58, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		monitorTextField = new JTextField();
		monitorTextField.setBackground(SystemColor.textInactiveText);
		monitorTextField.setEditable(false);
		monitorTextField.setColumns(10);
		monitorTextField.setBounds(297, 93, 116, 22);
		frame.getContentPane().add(monitorTextField);
		
		perifericosTextField = new JTextField();
		perifericosTextField.setBackground(SystemColor.textInactiveText);
		perifericosTextField.setEditable(false);
		perifericosTextField.setColumns(10);
		perifericosTextField.setBounds(297, 128, 116, 22);
		frame.getContentPane().add(perifericosTextField);
		
		subtotalTextField = new JTextField();
		subtotalTextField.setBackground(SystemColor.textInactiveText);
		subtotalTextField.setEditable(false);
		subtotalTextField.setColumns(10);
		subtotalTextField.setBounds(297, 164, 116, 22);
		frame.getContentPane().add(subtotalTextField);
		
		ivaTextField = new JTextField();
		ivaTextField.setBackground(SystemColor.textInactiveText);
		ivaTextField.setEditable(false);
		ivaTextField.setColumns(10);
		ivaTextField.setBounds(297, 199, 116, 22);
		frame.getContentPane().add(ivaTextField);
		
		JTextPane txtpnPreoBase = new JTextPane();
		txtpnPreoBase.setEditable(false);
		txtpnPreoBase.setBackground(UIManager.getColor("Button.background"));
		txtpnPreoBase.setText("Pre\u00E7o base");
		txtpnPreoBase.setBounds(216, 58, 69, 22);
		frame.getContentPane().add(txtpnPreoBase);
		
		JTextPane txtpnMonitor = new JTextPane();
		txtpnMonitor.setEditable(false);
		txtpnMonitor.setBackground(UIManager.getColor("Button.background"));
		txtpnMonitor.setText("Monitor");
		txtpnMonitor.setBounds(216, 92, 69, 22);
		frame.getContentPane().add(txtpnMonitor);
		
		JTextPane txtpnPerifricos = new JTextPane();
		txtpnPerifricos.setEditable(false);
		txtpnPerifricos.setBackground(UIManager.getColor("Button.background"));
		txtpnPerifricos.setText("Perif\u00E9ricos");
		txtpnPerifricos.setBounds(216, 128, 69, 22);
		frame.getContentPane().add(txtpnPerifricos);
		
		JTextPane txtpnGfg = new JTextPane();
		txtpnGfg.setEditable(false);
		txtpnGfg.setBackground(UIManager.getColor("Button.background"));
		txtpnGfg.setText("Subtotal");
		txtpnGfg.setBounds(216, 164, 69, 22);
		frame.getContentPane().add(txtpnGfg);
		
		JTextPane txtpnIva = new JTextPane();
		txtpnIva.setEditable(false);
		txtpnIva.setBackground(UIManager.getColor("Button.background"));
		txtpnIva.setText("IVA");
		txtpnIva.setBounds(216, 199, 69, 22);
		frame.getContentPane().add(txtpnIva);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Impressora - 100");
		chckbxNewCheckBox.setBounds(48, 226, 127, 25);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxWebcam = new JCheckBox("WebCam - 30");
		chckbxWebcam.setBounds(48, 254, 127, 25);
		frame.getContentPane().add(chckbxWebcam);
		
		JCheckBox chckbxScanner = new JCheckBox("Scanner - 50");
		chckbxScanner.setBounds(48, 284, 127, 25);
		frame.getContentPane().add(chckbxScanner);
		
		JTextPane txtpnTotal = new JTextPane();
		txtpnTotal.setText("TOTAL");
		txtpnTotal.setBackground(SystemColor.menu);
		txtpnTotal.setEditable(false);
		txtpnTotal.setBounds(216, 257, 69, 22);
		frame.getContentPane().add(txtpnTotal);
		
		JButton btnNewButton = new JButton("Efetuar C\u00E1lculos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setBounds(216, 377, 127, 25);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Op\u00E7\u00F5es do monitor", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textHighlight));
		panel.setBounds(37, 63, 152, 127);
		frame.getContentPane().add(panel);
		
		totalTextField = new JTextField();
		totalTextField.setBackground(SystemColor.textInactiveText);
		totalTextField.setEditable(false);
		totalTextField.setColumns(10);
		totalTextField.setBounds(297, 255, 116, 22);
		frame.getContentPane().add(totalTextField);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.menu);
		textPane.setText("-----------------------------------------------------------------------------------------------------------------------------------------");
		textPane.setBounds(34, 28, 488, 22);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("-----------------------------------------------------------------------------------------------------------------------------------------");
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setBounds(34, 342, 488, 22);
		frame.getContentPane().add(textPane_1);
		
		JTextPane txtpnPcShop = new JTextPane();
		txtpnPcShop.setBackground(SystemColor.menu);
		txtpnPcShop.setEditable(false);
		txtpnPcShop.setText("PC - Shop");
		txtpnPcShop.setBounds(216, 0, 69, 22);
		frame.getContentPane().add(txtpnPcShop);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Perif\u00E9ricos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 120, 215)));
		panel_1.setBounds(37, 199, 152, 127);
		frame.getContentPane().add(panel_1);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Efetuar C\u00E1lculos");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			totalTextField.setText("");
		}
	}
}
