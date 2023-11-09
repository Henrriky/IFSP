package SEMANA7;

import java.util.Arrays;

public class UtilSort {

	public static void bubble_sort(double[] vetor) {
		
		int indiceLimite = vetor.length - 1;
		int i, j; 
		double aux;
		for ( j = 0; j < indiceLimite-1; j++) {
			for ( i = 0; i < indiceLimite-1-j; i++) {
				System.out.printf("\nComparando %.2f com %.2f ", vetor[i], vetor[i+1]);
				if ( vetor[i] > vetor[i+1]) {
					System.out.printf("->empurra %.2f para o fundo", vetor[i] );
					System.out.printf("-> troca com %.2f", vetor[i+1]);
					
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
				}
			}
			if (j<indiceLimite-1) {
				System.out.printf("\n %s", Arrays.toString(vetor));
			}
		}
	}
}

