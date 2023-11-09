package OTHERS.GRAFO;

public class Aresta<Tipo> {

	private Double peso;
	private Vertice<Tipo> inicio;
	private Vertice<Tipo> fim;
	
	public Aresta(Double peso, Vertice<Tipo> inicio, Vertice<Tipo> fim) {
		this.peso = peso;
		this.inicio = inicio;
		this.fim = fim;
	}
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Vertice<Tipo> getInicio() {
		return inicio;
	}
	public void setInicio(Vertice<Tipo> inicio) {
		this.inicio = inicio;
	}
	public Vertice<Tipo> getFim() {
		return fim;
	}
	public void setFim(Vertice<Tipo> fim) {
		this.fim = fim;
	}
	
	
	
}
