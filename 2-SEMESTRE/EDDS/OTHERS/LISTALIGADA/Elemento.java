package OTHERS.LISTALIGADA;

public class Elemento<Tipo> {

	private Tipo valor;
	private Elemento<Tipo> proximo;
	
	public Elemento(Tipo valor) {
		setValor(valor);
	}
	
	public Tipo getValor() {
		return valor;
	}
	
	public void setValor(Tipo valor) {
		this.valor = valor;
	}
	
	public Elemento<Tipo> getProximo() {
		return proximo;
	}
	
	public void setProximo(Elemento<Tipo> proximo) {
		this.proximo = proximo;
	}
	
	
	
}
