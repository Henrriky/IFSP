package SEMANA7;

import java.util.Arrays;

public class UtilSortGenerics<T extends Comparable<T>> {

	public void bubble_sort(T[] vetor) {

		int indiceLimite = vetor.length - 1;
		for (int j = 0; j < indiceLimite - 1; j++) {
			for (int i = 0; i < indiceLimite - 1 - j; i++) {
				
				String texto = String.format("\nComparando %.2f com %.2f ", vetor[i], vetor[i + 1]);
				System.out.println(texto);
				
				if (vetor[i].compareTo(vetor[i + 1]) >= 1) {
					texto = String.format("->empurra %.2f para o fundo", vetor[i]);
					System.out.println(texto);
					texto = String.format("-> troca com %.2f", vetor[i + 1]);
					System.out.println(texto);

					T aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
				}
			}
			if (j < indiceLimite - 1) {
				System.out.printf("\n %s", Arrays.toString(vetor));
			}
		}
	}
}
