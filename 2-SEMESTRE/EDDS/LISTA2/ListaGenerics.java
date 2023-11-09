package LISTA2;

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
	
	public void heapSort() {
	    int n = tamanho;

	    for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(n, i);
	    }

	    for (int i = n - 1; i >= 0; i--) {
	        Tipo temp = (Tipo) elementos[0];
	        elementos[0] = elementos[i];
	        elementos[i] = temp;

	        heapify(i, 0);
	    }
	}

	private void heapify(int n, int i) {
	    int maior = i;
	    int esquerda = 2 * i + 1;
	    int direita = 2 * i + 2;

	    if (esquerda < n && ((Tipo) elementos[esquerda]).compareTo((Tipo) elementos[maior]) > 0) {
	        maior = esquerda;
	    }

	    if (direita < n && ((Tipo) elementos[direita]).compareTo((Tipo) elementos[maior]) > 0) {
	        maior = direita;
	    }

	    if (maior != i) {
	        Tipo temp = (Tipo) elementos[i];
	        elementos[i] = elementos[maior];
	        elementos[maior] = temp;

	        heapify(n, maior);
	    }
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
	    if (p < r) {
	        int q = (p + r) / 2; //Pegar o elemento do meio
	        mergeSort(p, q);
	        mergeSort(q + 1, r);
	        merge(p, q, r);
	    }
	}
	
	private void merge(int p, int q, int r) {
	    int n1 = q - p + 1;
	    int n2 = r - q;

	    Object[] leftArray = new Object[n1];
	    Object[] rightArray = new Object[n2];

	    for (int i = 0; i < n1; ++i) {
	        leftArray[i] = elementos[p + i];
	    }

	    for (int j = 0; j < n2; ++j) {
	        rightArray[j] = elementos[q + 1 + j];
	    }

	    int i = 0, j = 0;
	    int k = p;

	    while (i < n1 && j < n2) {
	        if (((Tipo) leftArray[i]).compareTo((Tipo) rightArray[j]) <= 0) {
	            elementos[k] = (Tipo) leftArray[i];
	            i++;
	        } else {
	            elementos[k] = (Tipo) rightArray[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < n1) {
	        elementos[k] = (Tipo) leftArray[i];
	        i++;
	        k++;
	    }

	    while (j < n2) {
	        elementos[k] = (Tipo) rightArray[j];
	        j++;
	        k++;
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
	
	public void selection_sort() {
	    int indiceLimite = tamanho;

	    for (int i = 0; i < indiceLimite - 1; i++) {
	        int pos_min = i;

	        for (int j = i + 1; j < indiceLimite; j++) {
	            Tipo prox = (Tipo) elementos[j];
	            Tipo elementoDaIteracao = (Tipo) elementos[pos_min];
	            
	            if (prox.compareTo(elementoDaIteracao) < 0) {
	                pos_min = j;
	            }
	        }

	        if (pos_min != i) {
	            Tipo aux = (Tipo) elementos[i];
	            elementos[i] = elementos[pos_min];
	            elementos[pos_min] = aux;
	        }
	    }
	}

	public void insertion_sort() {
		
		int indiceLimite = tamanho;
		
		
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
	public void addEmOrdem(Tipo valor) {
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
		this.mergeSort();
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
	
	public int buscaBinariaRecursiva(int inicio, int fim, Tipo x) {
		int meio;
		if (inicio <= fim) {
			meio = (inicio + fim)/2;
			if (x.compareTo((Tipo) this.elementos[meio]) == 0) {
				return 1;
			} else if (x.compareTo((Tipo) this.elementos[meio]) == -1) {
				return buscaBinariaRecursiva(inicio, (meio - 1), x);
			} else {
				return buscaBinariaRecursiva((meio + 1), fim, x);
			}
		} else {
			return -1;			
		}
	}
	
	public int buscaBinariaLoop (Tipo x) {
		int inicio = 0;
		int fim = tamanho - 1;
		while (inicio <= fim) {
			int meio = (inicio+fim)/2;
			if (x.compareTo((Tipo) this.elementos[meio]) == 0) {
				return 1;
			} else if (x.compareTo((Tipo) this.elementos[meio]) == -1) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		return -1;
	}
	

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0; i < tamanho; i++) {
			if (i != tamanho - 1) {
				b.append(elementos[i]);
				b.append('\n');
				b.append(' ');

			} else {
				b.append(elementos[i]);
			}
		}
		b.append(']');
		return b.toString();
	}
}