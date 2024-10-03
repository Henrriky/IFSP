package AULA2.ATIVIDADE5;

import javax.swing.SwingUtilities;

public class Atividade4 {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FibonnaciCTRunnable().setVisible(true);
			}
		});
		
	}

}
