package LISTA2.PILHA;

import LISTA2.Animal;
import LISTA2.Aves;
import LISTA2.Mamifero;
import LISTA2.Peixes;

public class Teste {
	public static void main(String[] args) {
		ListaGenericsImplementacaoPilha<Animal> lista = new ListaGenericsImplementacaoPilha<Animal>();
		
		Animal elefante = new Mamifero();
		Animal leao = new Mamifero();
		Animal aguia = new Aves();
		Animal pardal = new Aves();
		Animal salmao = new Peixes();
		Animal tilapia = new Peixes();
		elefante.setPeso(2000);
		leao.setPeso(120);
		aguia.setPeso(6);
		pardal.setPeso(0.5);
		salmao.setPeso(5);
		tilapia.setPeso(2.4);
		
		lista.push(elefante);
		lista.push(aguia);
		lista.push(salmao);
		lista.push(tilapia);
		lista.push(pardal);
		lista.push(leao);
		System.out.println("Elementos adicionados a pilha:  \n" + lista);
		lista.pop();
		lista.pop();
		lista.pop();
		lista.pop();
		lista.pop();
		System.out.println("Ultimo elemento da pilha: " + lista.peek());
		lista.pop();
		System.out.println("Todos os elementos removidos da pilha: " + lista);
		System.out.println(lista.pop());
		System.out.println(lista.peek());
	}
}
