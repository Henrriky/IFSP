package AULA1.EXERCICIO4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			// 4. Implemente um programa Java em que o limite da memória Heap será inevitavelmente atingido
			List<String> a = new ArrayList<String>();
			while (true) {
				a.add("Joao");
			}
	}
}
