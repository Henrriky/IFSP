package SEMANA10.ARVORE;

public class Node<T> {
	
	private T valor;
	private Node<T> esq;
	private Node<T> dir;
	
	public Node () {
		
	}
	
	public Node (T valor) {
		this.valor = valor;
	}
	
	public void setEsq (Node<T> elemento) {
		this.esq = elemento;
	}
	
	public void setDir (Node<T> elemento) {
		this.dir = elemento;
	}
	
	public Node<T> getEsq () {
		return this.esq;
	}
	
	public Node<T> getDir () {
		return this.dir;
	}
	
	public T getValor() {
		return this.valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	
}
