package AULA2.ATIVIDADE1;

public class TestaThreads {

	public static void main(String[] args) {
		System.out.println("INÍCIO DO TESTE");
		ExemploThread t1 = new ExemploThread(),
					  t2 = new ExemploThread(),
					  t3 = new ExemploThread();
		t1.start();
		t2.start();
		t3.start();
		System.out.println("FIM DO TESTE");

	}

}
