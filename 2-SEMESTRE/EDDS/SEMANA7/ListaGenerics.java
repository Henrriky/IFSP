package SEMANA7;

import java.util.Arrays;

public class ListaGenerics<Tipo extends Comparable<Tipo>> {

	private Object[] elementos;
	public int tamanho;
	// private Object[] vetor;

	public ListaGenerics() {
		this(10);
	}

	public ListaGenerics(int tamanho) {
		this.elementos = new Object[tamanho];
	}

	public void bubble_sort() {

		int indiceLimite = tamanho - 1;
		for (int j = 0; j < indiceLimite - 1; j++) {
			for (int i = 0; i < indiceLimite - j; i++) {
				Tipo elemento1 = (Tipo) elementos[i];
				Tipo elemento2 = (Tipo) elementos[i + 1];
				if (elemento1.compareTo(elemento2) >= 1) {
					Tipo aux = elemento1;
					elementos[i] = elemento2;
					elementos[i + 1] = aux;
				}
			}
		}
	}
	
	public void selection_sort () {
		int indiceLimite = tamanho - 1;
		int pos_min;
		/* Percorre todo o vetor até TAMANHO_VETOR-1,
		pois a última posição não precisa testar, pois já estará ordenada */
		for(int i = 0; i < indiceLimite - 1; i++){
			pos_min = i; /* A posição do menor valor recebe a posição que está passando */
			/* Percorre o vetor da posição i+1 até o final */
			for (int j = i + 1; j <= indiceLimite; j++) {
			/* Testa se o elemento da posição que está passando
			é menor que o elemento daquela que tem o menor valor */
				/*Tipo elemento1 = elementos[j];
				Tipo elemento2 = elementos[pos_min];
				elemento1[j] < elementos[pos_min];*/
				Tipo prox = (Tipo) elementos[j];
				Tipo elementoDaIteracao = (Tipo) elementos[pos_min];
				if (prox.compareTo(elementoDaIteracao) <= -1) {
					pos_min = j; /* pos_min recebe a posição do menor valor */
					//System.out.print(prox + " ");
				}
			}
			/* Se a posição do menor for diferente da que está passando, ocorre a troca */
			if (pos_min != i) {
				Tipo aux = (Tipo) elementos[i];
				elementos[i] = elementos[pos_min];
				elementos[pos_min] = aux;
			}
			System.out.println(this);
			//System.out.println(this);
		}
	}

	public void insertion_sort() {
		
		int indiceLimite = tamanho;
		/* 4 3 2
		 * 3 4 2
		 * 3 2 4
		 * 2 3 4
		 * 
		 * */
		
		
		Tipo escolhido;
		Tipo anteriorValor;
		int indiceAnterior, i;
		for (i = 1; i < indiceLimite; i++) {
			escolhido = (Tipo) elementos[i]; //Pega o valor do segundo elemento do array 
			indiceAnterior = i - 1; //Pega o indice do antecessor do elemento escolhido
			//Verifica se o anterior não será um número negativo e verifica se o numero anterior é maior que o elemento a frente dele
			while ((indiceAnterior >= 0) && ( ((Tipo) elementos[indiceAnterior]).compareTo(escolhido) >= 1) ) {
				 /*O segredo está no while, enquanto o número anterior for maior que o sucessor dele ocorre a troca*/
				elementos[indiceAnterior + 1] = elementos[indiceAnterior];
				indiceAnterior--; //Por causa do while é necessário o decremento
			}
			elementos[indiceAnterior + 1] = escolhido;
		}
	}
	
	public void add(Tipo valor) {

		if (tamanho < elementos.length) {
			elementos[tamanho++] = valor;
		} else {
			Object[] novoArray = new Object[tamanho * 2];
			// novoArray = Arrays.copyOf(elementos, tamanho*2);
			for (int i = 0; i < tamanho; i++) {
				novoArray[i] = elementos[i];
			}
			this.elementos = novoArray;
			elementos[tamanho++] = valor;
		}
	}

	public Tipo remove(int posicao) {
		Object valor = null;
		if (posicao >= 0 && posicao < tamanho) {
			valor = elementos[posicao];
			for (int i = posicao; i < (tamanho - 1); i++) {
				elementos[i] = elementos[(i + 1)];
			}
		}
		return (Tipo) valor;
	}

	public Tipo get(int posicao) {
		Object valor = null;
		if (posicao >= 0 && posicao < tamanho) {
			valor = elementos[posicao];
		}
		return (Tipo) valor;
	}

	public boolean contains(Tipo valor) {
		for (int i = 0; i < tamanho; i++) {
			if (elementos[i] == valor) {
				return true;
			}
		}
		return false;
	}

	public int count(Tipo valor) {
		int quantidade = 0;
		for (int i = 0; i < tamanho; i++) {
			if (elementos[i] == valor) {
				quantidade++;
			}
		}
		return quantidade;
	}

	public Tipo remove() {
		if (tamanho > 0) {
			return (Tipo) elementos[--tamanho];
		}
		return null;
	}

	public int getTamanho() {
		return tamanho;
	}

	public int getTamanho2() {
		return this.elementos.length;
	}

	public boolean isVazia() {
		return tamanho == 0;
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0; i < tamanho; i++) {
			if (i != tamanho - 1) {
				b.append(elementos[i]);
				b.append(',');
				b.append(' ');

			} else {
				b.append(elementos[i]);
			}
		}
		b.append(']');
		return b.toString();
	}
}