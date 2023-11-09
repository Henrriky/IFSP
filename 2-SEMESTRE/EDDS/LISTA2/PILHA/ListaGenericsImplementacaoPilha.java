package LISTA2.PILHA;


public class ListaGenericsImplementacaoPilha<Tipo extends Comparable<Tipo>> implements Pilha<Tipo> {

	private Object[] elementos;
	public int tamanho;
	// private Object[] vetor;
	
	public ListaGenericsImplementacaoPilha() {
		this(10);
	}

	public ListaGenericsImplementacaoPilha(int tamanho) {
		this.elementos = new Object[tamanho];
	}

	
	@Override
	public Tipo push(Tipo x) {
		if (tamanho < elementos.length) {
			elementos[tamanho++] = x;
		} else {
			Object[] novoArray = new Object[tamanho * 2];
			for (int i = 0; i < elementos.length; i++) {
				novoArray[i] = elementos[i];
			}
			elementos = novoArray;
			elementos[tamanho++] = x;
		}
		return x;
	}
	
	@Override
	public Tipo pop() {
		if (tamanho > 0) {
			Tipo elemento = peek();
			this.elementos[tamanho--] = null;
			return elemento;
		}
		return null;
	}
	
	public Tipo peek() {
		if (tamanho > 0) {
			Tipo elemento = (Tipo) this.elementos[tamanho - 1];
			return elemento;
		}
		return null;
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

	public int getTamanho() {
		return tamanho;
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