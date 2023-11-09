package SEMANA8.LISTALIGADA;

public class Celula<Tipo> {
	
	private Celula<Tipo> next;
	private Celula<Tipo> before;
	private Tipo valor;
	
	public Celula(Tipo valor) {
		this.valor = valor;
	}
	
	public Celula<Tipo> getNext() {
		return next;
	}
	public void setNext(Celula<Tipo> next) {
		this.next = next;
	}
	public Celula<Tipo> getBefore() {
		return before;
	}
	public void setBefore(Celula<Tipo> before) {
		this.before = before;
	}
	
	public Tipo getValor() {
		return this.valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.valor + ""; 
	}
	
	

	
	
}
