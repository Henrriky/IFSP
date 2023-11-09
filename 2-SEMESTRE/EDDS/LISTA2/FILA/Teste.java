package LISTA2.FILA;

import LISTA2.Animal;
import LISTA2.Aves;
import LISTA2.Mamifero;
import LISTA2.Peixes;

public class Teste {

	public static void main(String[] args) {
		ListaGenericsImplementacaoFila<Animal> lista = new ListaGenericsImplementacaoFila<Animal>();
		
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
		
		lista.enqueue(elefante);
		lista.enqueue(aguia);
		lista.enqueue(salmao);
		lista.enqueue(tilapia);
		lista.enqueue(pardal);
		lista.enqueue(leao);
		System.out.println("Elementos adicionados a fila:  \n" + lista);
		System.out.println("========================================");
		System.out.println("Removendo elemento: " + lista.dequeue()); ;
		System.out.println(lista);
		System.out.println("========================================");
		System.out.println("Removendo elemento: " + lista.dequeue()); ;
		System.out.println(lista);
		System.out.println("========================================");
		System.out.println("Removendo elemento: " + lista.dequeue()); ;
		System.out.println(lista);
		System.out.println("========================================");
		System.out.println("Removendo elemento: " + lista.dequeue()); ;
		System.out.println(lista);
		System.out.println("========================================");
		System.out.println("Removendo elemento: " + lista.dequeue()); ;
		System.out.println(lista);
		System.out.println("========================================");
		System.out.println("Primeiro elemento da fila: " + lista.peek());
		System.out.println("Removendo elemento: " + lista.dequeue()); ;
		System.out.println("========================================");
		System.out.println(lista);
		System.out.println("Todos os elementos removidos da fila: " + lista);
		System.out.println(lista.dequeue());
		System.out.println(lista.peek());
	}
	
}
