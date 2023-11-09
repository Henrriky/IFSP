package LISTA2.FILA;

public class ListaGenericsImplementacaoFila<Tipo extends Comparable<Tipo>> implements Fila<Tipo> {

	private Object[] elementos;
	public int tamanho;
	// private Object[] vetor;
	
	public ListaGenericsImplementacaoFila() {
		this(10);
	}

	public ListaGenericsImplementacaoFila(int tamanho) {
		this.elementos = new Object[tamanho];
	}
	

	
	@Override
	public Tipo enqueue(Tipo x) {
		if (tamanho < elementos.length) {
			elementos[tamanho++] = x;
		} else {
			Object[] novoArray = new Object[tamanho * 2];
			for (int i = 0; i < elementos.length - 1; i++) {
				novoArray[i] = elementos[i];
			}
			elementos = novoArray;
			elementos[tamanho++] = x;
		}
		
		return x;
	}
	
	@Override
	public Tipo dequeue() {
		if (tamanho > 0) {
			Tipo elemento = peek();
			for (int i = 1; i < elementos.length; i++) {
				elementos[i - 1] = elementos[i];
			}
			tamanho--;
			return elemento;
		}
		return null;
	}
	
	@Override
	public Tipo peek() {
		if (tamanho > 0) {
			return (Tipo) elementos[0];
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