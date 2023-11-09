package LIVROEDDS.BINARYTREE;

public class BinaryTree<T> {
	Node<T> r;
	
	public int depth (Node<T> u) {
		int d = 0;
		while (u != r) { //Enquanto o Node passado for diferente de r
			u = u.parent; //Vá mudando o endereço de memória para o parent Node
			d++; //incremente o valor da profundidade
		}
		return d;
	}
	
	public int size (Node<T> u) {
		if (u == null) { //Caso o node passado para calcular o tamanho da arvore seja nulo retorne 0
			return 0;
		}
		return 1 + size(u.left) + size(u.right);
	}
	
	public void transverse(Node u) {
		if (u == null) return;
		transverse(u.left);
		transverse(u.right);
	}
	
	public void transverse2() {
		Node u = r;
		Node prev = null;
		Node next;
		while(u != null) {															
			if (prev == u.parent) { 
				if (u.left != null) { // yes 2 exec: no
					next = u.left; // next = 2
				} else if (u.right != null) { // 2 exec: no
					next = u.right; 
				} else { // 2 exec: next = u.parent (voltar para o anterior)
					next = u.parent;
				}
			} else if (prev == u.left) { //Caso o anterior seja igual ao u.left 3 exec: 2 é igual a u.left yes
				if (u.right != null) {
					next = u.right;
				} else {
					next = u.parent;
				}
			} else {
				next = u.parent;
			}
			prev = u;
			u = next;
		}
		
	}
	
	public int size2() {
		Node u = r;
		Node prev = null;
		Node next;
		int n = 0;
		while(u != null) {
			if (prev == u.parent) {
				n++;
				if (u.left != null) {
					next = u.left;
				} else if (u.right != null) {
					next = u.right;
				} else {
					next = u.parent;
				}
			} else if (prev == u.left) {
				if (u.right != null) {
					next = u.right;
				} else {
					next = u.parent;
				}
			} else {
				next = u.parent;
			}
			prev = u;
			u = next;
		}
		return n;
	}
	
	/*
	public int height (Node<T> u) {
		if (u == null) return -1;
		return 1 + max(height(u.left), height(u.right));
	} */
	
}
