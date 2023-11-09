package SEMANA10.ARVORE;

public class Arvore<T extends Comparable<T>> {
	
	private Node<T> raiz;
	
	public void adicionarMeu (T valor) {
		Node element = raiz;
		
		if (element == null) {
			raiz = new Node<T>(valor);
			return;
		}
		
		while (element != null) {
			if (valor.compareTo(raiz.getValor()) < 0) {
				element = element.getEsq();
			} else {
				element = element.getDir();
			}
		}
		
		element = new Node(valor);
	}
	
	public void setRaiz (Node<T> node) {
		this.raiz = node;
	}
	
	public void insere (T valor) {
		this.raiz = this.insere(raiz, valor);
	}
	
	public Node<T> insere(Node<T> raiz, T valor) {
		if (raiz == null) {
			return new Node<T>(valor);
		}
		if (valor.compareTo(raiz.getValor()) < 0) {
			Node<T> esquerdo = insere(raiz.getEsq(), valor);
			raiz.setEsq(esquerdo);
		} else {
			Node<T> direito = insere(raiz.getDir(), valor);
			System.out.println("oi");
			raiz.setDir(direito);
		}
		return raiz;
	}
	
	@Override
	public String toString() {
		StringBuilder a = new StringBuilder(); 
		imprime(a, raiz);
		return a.toString();
	}
	
	
	public void imprime(StringBuilder builder, Node<T> elemento) {
		if (elemento != null) {
			imprime(builder, elemento.getEsq());
			builder.append(elemento.getValor());
			builder.append('\n');
			imprime(builder, elemento.getDir());
		}
	}
	
	
	
	public String imprimeMeu (Node<T> elemento) {
		StringBuilder a = new StringBuilder("");
		if (elemento != null) {
			imprimeMeu(elemento.getEsq());
			a.append(elemento.toString());
			imprimeMeu(elemento.getDir());
		}
		return a.toString();
	}
			
			
	
}
