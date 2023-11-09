package LIVROEDDS.REDBLACKBINARYSEARCHTREE;

public class RedBlackBinarySearchTree<T extends Comparable<T>> {

	Node<T> r;
	int n;
	
	static byte red = 0;
	static byte black = 1;
	
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
	
	
	public boolean add (Node<T> u) {
		Node<T> p = findLast(u.x);
		return addChild(p, u);
	}
	
	boolean add (T x) {
		Node<T> u = new Node<T>(x);
		u.colour = red;
		boolean added = add(u);
		if (added)
			addFixup(u);
		return added;
	}
	
	void addFixup(Node<T> u) {
		while (u.colour == red) {
			if (u == r) {
				u.colour = black;
				return;
			}
			Node<T> w = u.parent;
			if (w.left.colour == black) {
				flipLeft(w);
				u = w;
				w = u.parent;
			}
			if (w.colour == black)
				return; 
			Node<T> g = w.parent;
			if (g.right.colour == black) {
				flipRight(g);
				return;
			} else {
				pushBlack(g);
				u = g;
			}
		}
	}
	
	boolean remove(T x) {
		Node<T> u = findLast(x);
		if (u == null || u.x.compareTo(x) != 0)
			return false;
			Node<T> w = u.right;
		if (w == null) {
			w = u;
			u = w.left;
		} else {
			while (w.left != null) {
				w = w.left;				
			}
			u.x = w.x;
			u = w.right;
		}
		splice(w);
		u.colour += w.colour;
		u.parent = w.parent;
		removeFixup(u);
		return true;
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
	
	void remove (Node<T> nodeToRemove) {
		if (nodeToRemove.left != null || nodeToRemove.right != null) {
			splice(nodeToRemove); //Caso nao possua filhos chame a função que remove o elemento de forma simples
		} else {
			Node<T> w = nodeToRemove.right;
			while(w.left != null) {
				//Pegue o elemento mais profundo a esquerda do elemento de 
				//w e atribua ele para o novo valor de x
				w = w.left; 
			}
			nodeToRemove.x = w.x;
			splice(w); //Remove da memória o ultimo elemento da esquerda da subárvore a direita do valor a ser removido
		}
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
	
	private void rotateLeft(Node<T> u) {
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
	
	protected void rotateRight(Node<T> u) {
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
			r = w; r.parent = null; 
		}
	}
	
	
	private void pushBlack (Node<T> u) {
		u.colour--;
		u.left.colour++;
		u.right.colour++;
	}
	
	private void pullBlack (Node<T> u) {
		u.colour++;
		u.left.colour--;
		u.right.colour--;
	}
	
	private void swapColors (Node<T> u, Node<T> w) {
		byte tmp = u.colour;
		u.colour = w.colour;
		w.colour = tmp;
	}
	
	void flipLeft (Node<T> u) {
		swapColors(u, u.right);
		rotateLeft(u);
	}
	
	void flipRight(Node<T> u) {
		swapColors(u, u.left);
		rotateRight(u);
	}
	
	void removeFixup(Node<T> u) {
		while (u.colour > black) {
			if (u == r) {
				u.colour = black;
			} else if (u.parent.left.colour == red) {
				u = removeFixupCase1(u);
			} else if (u == u.parent.left) {
				u = removeFixupCase2(u);
			} else {
				u = removeFixupCase3(u);
			}
		}
		if (u != r) {
			Node<T> w = u.parent;
			if (w.right.colour == red && w.left.colour == black) {
				flipLeft(w);
			}
		}
	}
	
	Node<T> removeFixupCase1(Node<T> u) {
		flipRight(u.parent);
		return u;
	}
	
	protected Node<T> removeFixupCase2(Node<T> u) {
		Node<T> w = u.parent;
		Node<T> v = w.right;
		pullBlack(w);
		flipLeft(w);
		Node<T> q = w.right;
		if (q.colour == red) {
			rotateLeft(w);
			flipRight(v);
			pushBlack(q);
			if (v.right.colour == red)
				flipLeft(v);
			return q;
		} else {
			return v;
		}
	}
	
	Node<T> removeFixupCase3(Node<T> u) {
		Node<T> w = u.parent;
		Node<T> v = w.left;
		pullBlack(w);
		flipRight(w);
		Node<T> q = w.left;
		if (q.colour == red) {
			rotateRight(w);
			flipLeft(v);
			pushBlack(q);
			return q;
		} else {
			if (v.left.colour == red) {
				pushBlack(v);
				return v;
			} else {
				flipLeft(v);
				return w;
			}
		}
	}
}
