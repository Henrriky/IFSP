package SEMANA8;

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
	
	public void quicksort() {
		quicksort(0, tamanho - 1);
	}
	
	private void quicksort (int p, int r) {
		if (p < r) {
			int j = separa(p, r);
			quicksort (p, j-1);
			quicksort (j+1, r);
		}
	}
	
	private int separa (int p, int r) {
		Tipo c = (Tipo) elementos[r]; // pivô
		Object t;
		int j = p;
		for (int k = p; /*A*/ k < r; ++k){
			if (((Tipo) elementos[k]).compareTo(c) <= 0) {
				t = (Tipo) elementos[j];
				elementos[j] = elementos[k]; 
				elementos[k] = t;
				++j;
			}
		}
		t = elementos[j]; 
		elementos[j] = elementos[r]; 
		elementos[r] = t;
		return j;
	}
	
	public void mergeSort() {
		mergeSort(0, tamanho - 1);
	}
	
	private void mergeSort(int p, int r) {
		if (p < r-1) {
			int q = (p + r)/2;
			mergeSort(p, q);
			mergeSort(q, r);
			intercala (p, q, r);
		}
		
	}
	
	private void intercala (int p, int q, int r) {
		int i, j;
		Object[] w = new Object[(r-p)];
		
		for (i = p; i < q; ++i){ 
			w[i-p] = elementos[i];
		}
		
		for (j = q; j < r; ++j){ 
			w[r-p+q-j-1] = elementos[j]; 
		}
		
		i = 0;
		j = r-p-1;
	
		for (int k = p; k < r; ++k){
			
			if (((Tipo) w[i]).compareTo(((Tipo) w[j])) <= 0){ 
				elementos[k] = (Tipo) w[i++];
			} else { 
				elementos[k] = (Tipo) w[j--];
			};
		}
		
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
	
	public boolean buscaSequencial(Tipo elemento) {
		for (int i = 0; i < tamanho - 1; i++) {
			if (this.elementos[i].equals(elemento)) {
				return true;
			}
		}
		
		return false;
	}
	
	public int buscaBinaria(int inicio, int fim, Tipo x) {
		int meio;
		if (inicio <= fim) {
			meio = (inicio + fim)/2;
			if (x.compareTo((Tipo) this.elementos[meio]) == 0) {
				return 1;
			} else if (x.compareTo((Tipo) this.elementos[meio]) == -1) {
				return buscaBinaria(inicio, (meio - 1), x);
			} else {
				return buscaBinaria((meio + 1), fim, x);
			}
		} else {
			return -1;			
		}
	}
	public boolean binarySearch (Tipo x) {
		int inicio = 0;
		int fim = tamanho - 1;
		while (inicio <= fim) {
			int meio = (inicio+fim)/2;
			if (x.compareTo((Tipo) this.elementos[meio]) == 0) {
				return true;
			} else if (x.compareTo((Tipo) this.elementos[meio]) == -1) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		return false;
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