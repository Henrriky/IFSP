package OTHERS.LISTALIGADA;

public class ListaLigada<Tipo> {

	private Elemento<Tipo> primeiro;
	private Elemento<Tipo> ultimo;
	private int tamanho;
	
	public ListaLigada() {
		setTamanho(0);
	}
	
	public Elemento<Tipo> getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro(Elemento<Tipo> primeiro) {
		this.primeiro = primeiro;
	}
	public Elemento<Tipo> getUltimo() {
		return ultimo;
	}
	public void setUltimo(Elemento<Tipo> ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(Tipo novoValor) {
		
		Elemento<Tipo> novoElemento = new Elemento<Tipo>(novoValor);
		if (this.primeiro == null & ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		} else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		this.tamanho++;
		
	}
	
	
	public void remover(Tipo valorProcurado) {
		Elemento<Tipo> anterior = null;
		Elemento<Tipo> atual = this.primeiro;
		for (int i = 0; i < this.getTamanho(); i++) {
			if (atual.getValor().equals(valorProcurado)) {
				if (this.tamanho == 1) {
					this.primeiro = null;
					this.ultimo = null;
				} else if (atual == primeiro) {
					this.primeiro = atual.getProximo();
					atual.setProximo(null);
				} else if (atual == ultimo) {
					this.ultimo = anterior;
					anterior.setProximo(null);
				} else {
					anterior.setProximo(atual.getProximo());
					atual = null;
				}
				this.tamanho--;
				break;					
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}
	
	public Elemento<Tipo> get(int posicao) {
		Elemento<Tipo> atual = this.primeiro;
		for (int i = 0; i < posicao; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo(); 
			}
		}
		return atual;
	}
	
	public IteratorListaLigada<Tipo> getIterator() {
		return new IteratorListaLigada<Tipo>(this.primeiro);
	}
	
	
	
		
	
}
