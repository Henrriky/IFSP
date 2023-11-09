package LIVROEDDS.REDBLACKBINARYSEARCHTREE;


public class Node<T> {
	T x;
	Node<T> left;
	Node<T> right;
	Node<T> parent;
	byte colour;
	
	public Node(T x) {
		this.x = x;
	}
	
	public Node() {
		
	}
}
