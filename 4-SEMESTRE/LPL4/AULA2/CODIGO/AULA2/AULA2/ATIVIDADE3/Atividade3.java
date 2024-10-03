package AULA2.ATIVIDADE3;

import javax.swing.SwingUtilities;

public class Atividade3 {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FibonnaciCT().setVisible(true);
			}
		});
		
	}

}
