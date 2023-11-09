package LIVROEDDS.BINARYSEARCHTREERANDOM;

import java.util.Random;

public class BinarySearchTreeRandom<T extends Comparable<T>> {

	Node<T> r;
	int n;
	Random rand;
	
	public BinarySearchTreeRandom () {
		rand = new Random();
	}
	
	public T findValue (T value) {
		Node<T> u = r;
		while (u != null) {
			int comp = value.compareTo(u.x);
			if (comp < 0) { //Caso o valor passado seja menor que o u atual
				u = u.left;
			} else if (comp > 0) {
				u = u.right;
			} else {
				return u.x;
			}
		}
		return null;
	}
	
	public T find (T x) {
		Node<T> w = r;
		Node<T> z = null;
		while (w != null) {
			int comp = x.compareTo(w.x);
			if (comp < 0) {
				z = w;
				w = w.left;
			} else if (comp > 0) {
				w = w.right;
			} else {
				return w.x;
			}
		}
		return z == null ? null : z.x;
	}
	
	private Node<T> findLast (T x) {
		Node<T> w = r;
		Node<T> prev = null;
		while (w != null) {
			prev = w;
			int comp = x.compareTo(w.x);
			if (comp < 0) {
				w = w.left;
			} else if (comp > 0) {
				w = w.right;
			} else {
				return w;
			}
		}
		return prev;
	}
	
	private boolean addChild (Node<T> p, Node<T> value) {
		if (p == null) {
			r = value;
		} else {
			int comp = value.x.compareTo(p.x);
			if (comp < 0) {
				p.left = value;
			} else if (comp > 0) {
				p.right = value;
			} else {
				return false; //Valor que vai ser inserido ja existe
			}
			value.parent = p;
		}
		n++;
		return true;
	}
	
	public void splice (Node<T> nodeToRemove) {
		Node<T> s, parent;
		if (nodeToRemove.left != null) {
			s = nodeToRemove.left;
		} else {
			s = nodeToRemove.right;
		}
		if (nodeToRemove == r) { //Se o node para remover for igual a raiz
			r = s;
			parent = null;
		} else {
			parent = nodeToRemove.parent;
			if (parent.left == nodeToRemove) {
				parent.left = s; //Pai do elemento a ser removido recebe seus filhos a esquerda
			} else {
				parent.right = s; //Pai do elemento a ser removido recebe seus a direita
			}
		}
		if (s != null) {
			s.parent = parent;
		}
		n--;
	}
	
	public void rotateLeft(Node<T> u) {
		Node<T> w = u.right;
		w.parent = u.parent;
		if (w.parent != null) {
			if (w.parent.left == u) {
				w.parent.left = w;
			} else {
				w.parent.right = w;
			}
		}
		u.right = w.left;
		if (u.right != null) {
			u.right.parent = u;
		}
		u.parent = w;
		w.left = u;
		if (u == r) {
			r = w; 
			r.parent = null;
		}
	}
	
	public void rotateRight(Node<T> u) {
		Node<T> w = u.left;
		w.parent = u.parent;
		if (w.parent != null) {
			if (w.parent.left == u) {
				w.parent.left = w;
			} else {
				w.parent.right = w;
			}
		}
		u.left = w.right;
		if (u.left != null) {
			u.left.parent = u;
		}
		u.parent = w;
		w.right = u;
		if (u == r) {
			r = w;
			r.parent = null;
		}
	}
	
	boolean add (T x) {
		Node<T> u = new Node<T>();
		u.x = x;
		u.p = rand.nextInt();
		if (add(u)) {
			bubbleUp(u);
			return true;
		}
		return false;
	}
	
	public boolean add(Node<T> u) {
		Node<T> p = findLast(u.x);
		return addChild(p, u);		
	}
	
	boolean remove (T x) {
		Node<T> u = findLast(x);
		if (u != null && u.x.compareTo(x) == 0) {
			trickleDown(u);
			splice(u);
			return true;
		}
		return false;
	}
	
	void trickleDown (Node<T> u) {
		while (u.left != null || u.right != null) {
			if (u.left == null) {
				rotateLeft(u);
			} else if (u.right == null) {
				rotateRight(u);
			} else if (u.left.p < u.right.p) {
				rotateRight(u);
			} else {
				rotateLeft(u);
			}
			if (r == u) {
				r = u.parent;
			}
		}
	}
	
	void bubbleUp (Node<T> u) {
		while (u.parent != null && u.parent.p > u.p) {
			if (u.parent.right == u) {
				rotateLeft(u.parent);
			} else {
				rotateRight(u.parent);
			}
		}
		if (u.parent == null) {
			r = u;
		}
	}
}
