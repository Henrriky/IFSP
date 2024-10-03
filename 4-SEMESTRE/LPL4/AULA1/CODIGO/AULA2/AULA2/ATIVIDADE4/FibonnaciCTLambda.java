package AULA2.ATIVIDADE4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class FibonnaciCTLambda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private Painel painel;
	private boolean cancel;
	
	public FibonnaciCTLambda () {
		super("Fibonnaci Sem Thread");
		setContentPane(painel = new Painel());
		painel.getBtnCancelar().addActionListener(this);
		painel.getBtnLimpar().addActionListener(this);
		painel.getBtnIniciar().addActionListener(this);
		setSize(400, 400);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == painel.getBtnIniciar()) {
			cancel = false;
			painel.getInputTxtAreaResult().setText(null);
			painel.getBtnLimpar().setEnabled(false);
			painel.getBtnIniciar().setEnabled(false);
			new Thread(() -> {
				calculaFibonnaci(Integer.parseInt(painel.getinputTxtQtdNumeros().getText()));
				painel.getBtnLimpar().setEnabled(true);
				painel.getBtnIniciar().setEnabled(true);
			}).start();
		} else if (e.getSource() == painel.getBtnLimpar()) {
			painel.getInputTxtAreaResult().setText(null);
		} else {
			cancel = true;
			painel.getBtnLimpar().setEnabled(true);
			painel.getBtnIniciar().setEnabled(true);
		}
	}
	
	public void calculaFibonnaci (int n) {
		for (int i = 0; i < n && !cancel; i++) {
			painel.getInputTxtAreaResult().append(fibonacci(i) + ", ");
        }
	}
	
	public int fibonacci (int n) {
			if (n <= 1) {
				return n;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
	}
}
