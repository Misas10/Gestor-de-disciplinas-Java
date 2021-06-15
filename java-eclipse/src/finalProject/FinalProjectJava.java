package finalProject;

import java.awt.EventQueue;

// MY IMPORTS
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class FinalProjectJava {

	private JFrame frmGestorDeDisciplinas;
	private JTextField nota1Portugues;
	private JTextField nota1Matematica;
	private JTextField nota1FisQuimica;
	private JTextField nota1Ingles;
	private JTextField nota1Historia;
	private JTextField nota1Geografia;
	private JTextField nota2Portugues;
	private JTextField nota3Portugues;
	private JTextField nota2Matematica;
	private JTextField nota3Matematica;
	private JTextField nota2FisQuimica;
	private JTextField nota3FisQuimica;
	private JTextField nota2Ingles;
	private JTextField nota3Ingles;
	private JTextField nota2Historia;
	private JTextField nota3Historia;
	private JTextField nota2Geografia;
	private JTextField nota3Geografia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalProjectJava window = new FinalProjectJava();
					window.frmGestorDeDisciplinas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FinalProjectJava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestorDeDisciplinas = new JFrame();
		frmGestorDeDisciplinas.getContentPane().setEnabled(false);
		frmGestorDeDisciplinas.setTitle("Gestor de Disciplinas");
		frmGestorDeDisciplinas.setBounds(100, 100, 902, 683);
		frmGestorDeDisciplinas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestorDeDisciplinas.getContentPane().setLayout(null);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(0, 0, 0, 0);
		frmGestorDeDisciplinas.getContentPane().add(horizontalStrut);
		
		JLabel label_37 = new JLabel("");
		label_37.setBounds(0, 0, 0, 0);
		frmGestorDeDisciplinas.getContentPane().add(label_37);
		
		JLabel label_33 = new JLabel("");
		label_33.setBounds(0, 0, 0, 0);
		frmGestorDeDisciplinas.getContentPane().add(label_33);
		
		JLabel label_35 = new JLabel("");
		label_35.setBounds(0, 0, 0, 0);
		frmGestorDeDisciplinas.getContentPane().add(label_35);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 113, 55);
		frmGestorDeDisciplinas.getContentPane().add(label);
		
		JLabel label_43 = new JLabel("");
		label_43.setBounds(0, 0, 0, 0);
		frmGestorDeDisciplinas.getContentPane().add(label_43);
		
		JLabel label_41 = new JLabel("");
		label_41.setBounds(0, 0, 0, 0);
		frmGestorDeDisciplinas.getContentPane().add(label_41);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setBounds(0, 0, 0, 0);
		frmGestorDeDisciplinas.getContentPane().add(horizontalStrut_2);
		
		JLabel label_39 = new JLabel("");
		label_39.setBounds(0, 0, 0, 0);
		frmGestorDeDisciplinas.getContentPane().add(label_39);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(0, 0, 0, 0);
		frmGestorDeDisciplinas.getContentPane().add(horizontalStrut_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(118, 0, 114, 55);
		frmGestorDeDisciplinas.getContentPane().add(label_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(650, 0, 103, 55);
		frmGestorDeDisciplinas.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(758, 0, 106, 55);
		frmGestorDeDisciplinas.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(0, 60, 113, 55);
		frmGestorDeDisciplinas.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(118, 60, 114, 55);
		frmGestorDeDisciplinas.getContentPane().add(label_6);
		
		JLabel lblNewLabel_1 = new JLabel("1\u00BA Teste");
		lblNewLabel_1.setBounds(262, 60, 116, 55);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frmGestorDeDisciplinas.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2\u00BA Teste");
		lblNewLabel_1_1.setBounds(383, 60, 116, 55);
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		frmGestorDeDisciplinas.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3\u00BA Teste");
		lblNewLabel_1_2.setBounds(504, 60, 116, 55);
		lblNewLabel_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		frmGestorDeDisciplinas.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("M\u00E9dia");
		lblNewLabel_1_2_1.setBounds(684, 79, 34, 16);
		frmGestorDeDisciplinas.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(0, 120, 113, 56);
		frmGestorDeDisciplinas.getContentPane().add(label_7);
		
		JLabel lblNewLabel = new JLabel("Portugu\u00EAs");
		lblNewLabel.setBounds(118, 120, 114, 56);
		frmGestorDeDisciplinas.getContentPane().add(lblNewLabel);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setBounds(0, 0, 0, 0);
		frmGestorDeDisciplinas.getContentPane().add(horizontalStrut_4);
		
		nota1Portugues = new JTextField();
		nota1Portugues.setBounds(262, 137, 116, 22);
		nota1Portugues.setText("0");
		frmGestorDeDisciplinas.getContentPane().add(nota1Portugues);
		nota1Portugues.setColumns(10);
		
		nota2Portugues = new JTextField();
		nota2Portugues.setBounds(383, 137, 116, 22);
		nota2Portugues.setText("0");
		nota2Portugues.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota2Portugues);
		
		nota3Portugues = new JTextField();
		nota3Portugues.setBounds(504, 137, 116, 22);
		nota3Portugues.setText("0");
		nota3Portugues.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota3Portugues);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setBounds(0, 0, 0, 0);
		frmGestorDeDisciplinas.getContentPane().add(horizontalStrut_3);
		
		JTextArea mediaPortugues = new JTextArea();
		mediaPortugues.setBounds(650, 120, 103, 56);
		mediaPortugues.setForeground(Color.BLACK);
		mediaPortugues.setEnabled(false);
		frmGestorDeDisciplinas.getContentPane().add(mediaPortugues);
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(0, 181, 113, 56);
		frmGestorDeDisciplinas.getContentPane().add(label_11);
		
		JLabel lblMatemtica = new JLabel("Matem\u00E1tica");
		lblMatemtica.setBounds(118, 181, 114, 56);
		frmGestorDeDisciplinas.getContentPane().add(lblMatemtica);
		
		nota1Matematica = new JTextField();
		nota1Matematica.setBounds(262, 198, 116, 22);
		nota1Matematica.setText("0");
		nota1Matematica.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota1Matematica);
		
		nota2Matematica = new JTextField();
		nota2Matematica.setBounds(383, 198, 116, 22);
		nota2Matematica.setText("0");
		nota2Matematica.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota2Matematica);
		
		nota3Matematica = new JTextField();
		nota3Matematica.setBounds(504, 198, 116, 22);
		nota3Matematica.setText("0");
		nota3Matematica.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota3Matematica);
		
		JTextArea mediaMatematica = new JTextArea();
		mediaMatematica.setBounds(650, 181, 103, 56);
		mediaMatematica.setEnabled(false);
		frmGestorDeDisciplinas.getContentPane().add(mediaMatematica);
		
		JLabel label_15 = new JLabel("");
		label_15.setBounds(0, 242, 113, 56);
		frmGestorDeDisciplinas.getContentPane().add(label_15);
		
		JLabel lblFsicoqumica = new JLabel("F\u00EDsico-Qu\u00EDmica");
		lblFsicoqumica.setBounds(118, 242, 114, 56);
		frmGestorDeDisciplinas.getContentPane().add(lblFsicoqumica);
		
		nota1FisQuimica = new JTextField();
		nota1FisQuimica.setBounds(262, 259, 116, 22);
		nota1FisQuimica.setText("0");
		nota1FisQuimica.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota1FisQuimica);
		
		nota2FisQuimica = new JTextField();
		nota2FisQuimica.setBounds(383, 259, 116, 22);
		nota2FisQuimica.setText("0");
		nota2FisQuimica.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota2FisQuimica);
		
		nota3FisQuimica = new JTextField();
		nota3FisQuimica.setBounds(504, 259, 116, 22);
		nota3FisQuimica.setText("0");
		nota3FisQuimica.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota3FisQuimica);
		
		JTextArea mediaFisQuimica = new JTextArea();
		mediaFisQuimica.setBounds(650, 242, 103, 56);
		mediaFisQuimica.setEnabled(false);
		frmGestorDeDisciplinas.getContentPane().add(mediaFisQuimica);
		
		JLabel label_19 = new JLabel("");
		label_19.setBounds(0, 303, 113, 56);
		frmGestorDeDisciplinas.getContentPane().add(label_19);
		
		JLabel lblIngls = new JLabel("Ingl\u00EAs");
		lblIngls.setBounds(118, 303, 114, 56);
		frmGestorDeDisciplinas.getContentPane().add(lblIngls);
		
		nota1Ingles = new JTextField();
		nota1Ingles.setBounds(262, 320, 116, 22);
		nota1Ingles.setText("0");
		nota1Ingles.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota1Ingles);
		
		nota2Ingles = new JTextField();
		nota2Ingles.setBounds(383, 320, 116, 22);
		nota2Ingles.setText("0");
		nota2Ingles.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota2Ingles);
		
		nota3Ingles = new JTextField();
		nota3Ingles.setBounds(504, 320, 116, 22);
		nota3Ingles.setText("0");
		nota3Ingles.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota3Ingles);
		
		JTextArea mediaIngles = new JTextArea();
		mediaIngles.setBounds(650, 303, 103, 56);
		mediaIngles.setEnabled(false);
		frmGestorDeDisciplinas.getContentPane().add(mediaIngles);
		
		JLabel label_23 = new JLabel("");
		label_23.setBounds(0, 364, 113, 56);
		frmGestorDeDisciplinas.getContentPane().add(label_23);
		
		JLabel lblNewLabel_3_1 = new JLabel("Hist\u00F3ria");
		lblNewLabel_3_1.setBounds(118, 364, 114, 56);
		frmGestorDeDisciplinas.getContentPane().add(lblNewLabel_3_1);
		
		nota1Historia = new JTextField();
		nota1Historia.setBounds(262, 381, 116, 22);
		nota1Historia.setText("0");
		nota1Historia.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota1Historia);
		
		nota2Historia = new JTextField();
		nota2Historia.setBounds(383, 381, 116, 22);
		nota2Historia.setText("0");
		nota2Historia.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota2Historia);
		
		nota3Historia = new JTextField();
		nota3Historia.setBounds(504, 381, 116, 22);
		nota3Historia.setText("0");
		nota3Historia.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota3Historia);
		
		JTextArea mediaHistoria = new JTextArea();
		mediaHistoria.setBounds(650, 364, 103, 56);
		mediaHistoria.setEnabled(false);
		frmGestorDeDisciplinas.getContentPane().add(mediaHistoria);
		
		JLabel label_27 = new JLabel("");
		label_27.setBounds(0, 425, 113, 61);
		frmGestorDeDisciplinas.getContentPane().add(label_27);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Geograf\u00EDa");
		lblNewLabel_3_1_1.setBounds(118, 425, 114, 61);
		frmGestorDeDisciplinas.getContentPane().add(lblNewLabel_3_1_1);
		
		nota1Geografia = new JTextField();
		nota1Geografia.setBounds(262, 444, 116, 22);
		nota1Geografia.setText("0");
		nota1Geografia.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota1Geografia);
		
		nota2Geografia = new JTextField();
		nota2Geografia.setBounds(383, 444, 116, 22);
		nota2Geografia.setText("0");
		nota2Geografia.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota2Geografia);
		
		nota3Geografia = new JTextField();
		nota3Geografia.setBounds(504, 444, 116, 22);
		nota3Geografia.setText("0");
		nota3Geografia.setColumns(10);
		frmGestorDeDisciplinas.getContentPane().add(nota3Geografia);
		
		JTextArea mediaGeografia = new JTextArea();
		mediaGeografia.setBounds(650, 425, 103, 61);
		mediaGeografia.setEnabled(false);
		frmGestorDeDisciplinas.getContentPane().add(mediaGeografia);
		
		JButton btnNewButton = new JButton("Obter M\u00E9dia");
		btnNewButton.setBounds(517, 521, 103, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Media de Portuguess
				Double media_portugues = (
						Double.parseDouble(nota1Portugues.getText()) + 
						Double.parseDouble(nota2Portugues.getText()) + 
						Double.parseDouble(nota3Portugues.getText())) / 3;
				mediaPortugues.setText(new DecimalFormat("#,##0.00").format(media_portugues));
				
				// Media de Matemática
				Double media_matematica = (
						Double.parseDouble(nota1Matematica.getText()) + 
						Double.parseDouble(nota2Matematica.getText()) + 
						Double.parseDouble(nota3Matematica.getText())) / 3;
				mediaMatematica.setText(new DecimalFormat("#,##0.00").format(media_matematica));
				
				// Média de Físico-Química
				Double media_fisQuimica = (
						Double.parseDouble(nota1FisQuimica.getText()) + 
						Double.parseDouble(nota2FisQuimica.getText()) + 
						Double.parseDouble(nota3FisQuimica.getText())) / 3;
				mediaFisQuimica.setText(new DecimalFormat("#,##0.00").format(media_fisQuimica));
				
				// Média de Inglês
				Double media_ingles = (
						Double.parseDouble(nota1Ingles.getText()) + 
						Double.parseDouble(nota2Ingles.getText()) + 
						Double.parseDouble(nota3Ingles.getText())) / 3;
				mediaIngles.setText(new DecimalFormat("#,##0.00").format(media_ingles));
				
				// Média de História
				Double media_historia = (
						Double.parseDouble(nota1Historia.getText()) + 
						Double.parseDouble(nota2Historia.getText()) + 
						Double.parseDouble(nota3Historia.getText())) / 3;
				mediaHistoria.setText(new DecimalFormat("#,##0.00").format(media_historia));
				
				// Média de Geografia
				Double media_geografia = (
						Double.parseDouble(nota1Geografia.getText()) + 
						Double.parseDouble(nota2Geografia.getText()) + 
						Double.parseDouble(nota3Geografia.getText())) / 3;
				mediaGeografia.setText(new DecimalFormat("#,##0.00").format(media_geografia));
			}
		});
		
		String programPath = "C:/Gestor de Disciplinas/";
		String str = "";

		try {
			
			// Cria uma pasta chamada 'Gestor de Disciplinas'
			File programFile = new File(programPath);
			programFile.mkdir();
			File fullPath = new File(programPath + "config.txt");
			//  boolean doesFileExists = ;
			
			if(fullPath.exists()) {
				// Lê o ficheito config.txt
				BufferedReader in = new BufferedReader(new FileReader(fullPath));
				// String str;
				while ((str = in.readLine()) != null) {
					System.out.println(str);
				}
			}

		} catch(Exception e1) {
			e1.printStackTrace();
		}
		
		
		JTextPane mensaguensDeTexto = new JTextPane();
		mensaguensDeTexto.setForeground(Color.GREEN);
		mensaguensDeTexto.setBackground(SystemColor.menu);
		mensaguensDeTexto.setEditable(false);
		mensaguensDeTexto.setBounds(125, 13, 628, 22);
		frmGestorDeDisciplinas.getContentPane().add(mensaguensDeTexto);
		
		JButton btnGuardarNota = new JButton("Guardar Notas");
		btnGuardarNota.setBounds(383, 521, 116, 25);

		// Permite selecionar um ficheiro ou uma pasta
		JFileChooser fileChooser = new JFileChooser(str);
		
		// Adiciona da extensão .txt como um 'filtro'
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Ficheiro de texto (.txt)", "txt");
		fileChooser.setFileFilter(filter);
		
		// Cria uma variável para a criação de um timer
		Timer timer = new Timer();

		btnGuardarNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Formatação da Data
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HHmmss");
				LocalDateTime data_hoje = LocalDateTime.now();
				
				try {
					
					File notas = new File(programPath + "notas/" + dtf.format(data_hoje) + ".txt");
					// notas.mkdir();
					
					FileWriter writer = new FileWriter(notas, true);
						
						mensaguensDeTexto.setText("Ficheiro guardado com sucesso (em " + notas + ")");
						
						try {
							
							BufferedWriter bufferedWriter = new BufferedWriter(writer);
							
							bufferedWriter.write("Média de português: " + mediaPortugues.getText());
							bufferedWriter.newLine();
							
							bufferedWriter.write("Média de matemática: " + mediaMatematica.getText());
							bufferedWriter.newLine();
							
							bufferedWriter.write("Média de Fisico-Química: " + mediaFisQuimica.getText());
							bufferedWriter.newLine();
							
							bufferedWriter.write("Média de inglês: " + mediaIngles.getText());
							bufferedWriter.newLine();
							
							bufferedWriter.write("Média de Historia: " + mediaHistoria.getText());
							bufferedWriter.newLine();
							
							bufferedWriter.write("Média de Geografia: " + mediaGeografia.getText());
							bufferedWriter.newLine();
							
							bufferedWriter.close();
							
						} catch(Exception e4) {
							e4.printStackTrace();
							
						}
						
						// Um timer que aguarda durante 30 segundos para o texto desaparecer
						timer.schedule(new TimerTask() {
							  @Override
							  public void run() {
								 mensaguensDeTexto.setText("");
							  }
							}, 5*1000);
						
					
				} catch (Exception e5) {
					// TODO Auto-generated catch block
					e5.printStackTrace();
				}
			}
		});
		
		JButton btnVerNotas = new JButton("Ver notas");
		btnVerNotas.setBounds(262, 521, 103, 25);
		btnVerNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					File fullPath = new File(programPath + "config.txt");
					String str = null;
					
					try {
						if(fullPath.exists()) {
							// Lê o ficheito config.txt
							@SuppressWarnings("resource")
							BufferedReader in = new BufferedReader(new FileReader(fullPath));
							while (in.readLine() != null) {
								str = in.readLine();
							}
							
						}
					} catch(Exception e1) {
						e1.printStackTrace();
					}
					
					final String path = str;
					System.out.println(str);

				try {
					Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:/Gestor de Disciplinas/notas/");
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		});
		frmGestorDeDisciplinas.getContentPane().add(btnVerNotas);
		frmGestorDeDisciplinas.getContentPane().add(btnGuardarNota);
		frmGestorDeDisciplinas.getContentPane().add(btnNewButton);
		
	}
}
