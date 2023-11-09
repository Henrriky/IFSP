package OTHERS.LISTALIGADA;

public class IteratorListaLigada<Tipo> {
	private Elemento<Tipo> elemento;
	
	public IteratorListaLigada(Elemento<Tipo> atual) {
		this.elemento = atual;
	}
	
	public boolean temProximo() {
		if (elemento.getProximo() == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public Elemento<Tipo> getProximo() {
		elemento = elemento.getProximo();
		return elemento;
	}
	
	
}
