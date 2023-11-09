package LIVROEDDS.BINARYSEARCHTREERANDOM;

public class Node<T> {
	int p;
	T x;
	Node<T> left;
	Node<T> right;
	Node<T> parent;
	
	public Node(T x) {
		this.x = x;
	}
	
	public Node() {
		
	}
}
