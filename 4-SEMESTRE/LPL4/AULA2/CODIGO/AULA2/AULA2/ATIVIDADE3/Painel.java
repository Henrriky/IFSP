package AULA2.ATIVIDADE3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Painel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField inputTxtQtdNumeros;
	private JButton btnCancelar, btnIniciar, btnLimpar;
	private JTextArea inputTxtAreaResult;
	
	public Painel () {

		setLayout(new BorderLayout());
		
	
		JPanel painelSuperior = new JPanel(new GridLayout(1, 4, 3, 3));
		painelSuperior.add(new JLabel("Qtde de Números Fibonacci", JLabel.CENTER));
		painelSuperior.add(inputTxtQtdNumeros = new JTextField());

		JScrollPane painelCentral = new JScrollPane(inputTxtAreaResult = new JTextArea());
		inputTxtAreaResult.setEditable(false);
		inputTxtAreaResult.setLineWrap(true);
		inputTxtAreaResult.setWrapStyleWord(true);
		painelCentral.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		

		JPanel painelInferior = new JPanel(new GridLayout(1, 3, 3, 3));
		painelInferior.add(btnCancelar = new JButton("Cancelar"));
		painelInferior.add(btnLimpar = new JButton("Limpar"));
		painelInferior.add(btnIniciar = new JButton("Iniciar"));
		
		JPanel pnPrinc = new JPanel();
		pnPrinc.add(painelInferior);
		add("North", painelSuperior);
		add("Center", painelCentral);
		add("South", pnPrinc);
		
		
	}
	public JButton getBtnCancelar () { return btnCancelar; }
	public JButton getBtnIniciar () { return btnIniciar; }
	public JButton getBtnLimpar () { return btnLimpar; } 
	public JTextArea getInputTxtAreaResult () { return inputTxtAreaResult; } 
	public JTextField getinputTxtQtdNumeros () { return inputTxtQtdNumeros; } 
}
