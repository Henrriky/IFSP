package LIVROEDDS.BINARYSEARCHTREE;

public class BinarySearchTree<T extends Comparable<T>> {

	Node<T> r;
	int n;
	
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
	
	public boolean add (T x) {
		/*
		 * No pior caso a adição de um elemento na binarySearchTree será a altura da árvore.
		 * */
		Node<T> p = findLast(x);
		Node<T> valor = new Node<T>(x);
		return addChild(p, valor);
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
	
}
