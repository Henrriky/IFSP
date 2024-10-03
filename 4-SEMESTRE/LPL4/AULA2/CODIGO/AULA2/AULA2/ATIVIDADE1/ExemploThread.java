package AULA2.ATIVIDADE1;


public class ExemploThread extends Thread {
	@Override
	public void run () {
		System.out.println("Início: " + getName());
		for (int i = 1; i < 4; i++) {
			System.out.println(i + "-" + getName());
		}
		System.out.println("Fim: " + getName());
	}
}
