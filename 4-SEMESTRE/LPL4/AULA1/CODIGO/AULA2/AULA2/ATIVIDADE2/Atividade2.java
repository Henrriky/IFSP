package AULA2.ATIVIDADE2;

import javax.swing.SwingUtilities;

public class Atividade2 {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FibonnaciST().setVisible(true);
			}
		});
		
	}

}
