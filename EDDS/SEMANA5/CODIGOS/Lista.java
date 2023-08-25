package semana5;

import java.util.Arrays;

public class Lista {
	
	private Integer[] elementos;
	public int tamanho;
	
	public Lista () {
		this(10);
	}
	
	public Lista (int tamanho) {
		this.elementos = new Integer[tamanho];
	}
	
	public void add(int valor) {
		
		if (tamanho < elementos.length) {
			elementos[tamanho++] = valor;
		} else {
			Integer[] novoArray = new Integer[tamanho*2];
			//novoArray = Arrays.copyOf(elementos, tamanho*2);
			for (int i = 0; i < tamanho; i++) {
				novoArray[i] = elementos[i];
			}
			this.elementos = novoArray;
			elementos[tamanho++] = valor;
		}
	}
	
	public int remove() {
		if (tamanho > 0) {
			return elementos[--tamanho];			
		}
		return 0;
	}
	
	public int getTamanho () {
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
				b.append(',');
			} else {
				b.append(elementos[i]);
			}
		}
		b.append(']');
		return b.toString();
	}
	

	
}
