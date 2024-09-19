
package AULA1.EXERCICIO5;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		// 5. Implemente um programa que faça a clonagem de um objeto Cachorro contendo cinco
		// valores de atributos, porém não utilize o método clone
		
		Cachorro c = new Cachorro(18, "Pinxer", 4.0F, "macho", "Arthur");
		Cachorro copia = (Cachorro) c.clone();
	}
}
