
package AULA1.EXERCICIO6;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		// 6. Reescreva o programa da questão anterior, agora utilizando o método clone
		
		Cachorro c = new Cachorro(18, "Pinxer", 4.0F, "macho", "Arthur");
		Cachorro copia = (Cachorro) c.clone();
	
		System.out.println(copia);
	}
}
