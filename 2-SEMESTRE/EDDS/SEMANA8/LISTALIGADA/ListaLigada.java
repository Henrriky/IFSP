package SEMANA8.LISTALIGADA;

public class ListaLigada<Tipo> {

	private Celula<Tipo> first;
	private Celula<Tipo> last;
	private int tamanho;
	
	public void add(Tipo valor) {
		if (first == null) {
			Celula elemento = new Celula<Tipo>(valor);
			this.first = elemento;
			this.last = elemento;
			tamanho++;
		} else {
			Celula<Tipo> celula = new Celula<Tipo>(valor);
			this.last.setNext(celula);
			this.last = celula;
			tamanho++;
		}
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public boolean remover(Tipo valor) {
		
		//Pegar o valor a ser removido
		//Remover o valor 
		//Atribuir o proximo para o proximo do valor removido
		Celula<Tipo> celula = this.first;
		Celula<Tipo> anterior = this.first;
		while (celula.getNext() != null) {
			if (celula.getValor().equals(valor)) {
				anterior.setNext(celula.getNext());
				anterior.setNext(null);
			}
			anterior = celula;
			celula = celula.getNext();
			
			
		}
		
		return false;
		
	}
	
	public String toString() {
		StringBuilder b = new StringBuilder("");
		Celula<Tipo> anterior = first;
		Celula<Tipo> proximo = first.getNext();
		b.append("[ ");
		
		while (proximo != null) {
			b.append(anterior);
			anterior = proximo;
			proximo = anterior.getNext();
			b.append(", ");
		}
		
		if (proximo == null) {
			b.append(anterior);
		}
				
		b.append("]");
		
		return b.toString();
	}
	
	
	
}
