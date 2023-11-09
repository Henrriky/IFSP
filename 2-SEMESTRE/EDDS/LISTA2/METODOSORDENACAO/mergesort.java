package LISTA2.METODOSORDENACAO;

import LISTA2.Animal;
import LISTA2.Aves;
import LISTA2.ListaGenerics;
import LISTA2.Mamifero;
import LISTA2.Peixes;

public class mergesort {
	public static void main(String[] args) {
		ListaGenerics<Animal> lista = new ListaGenerics<Animal>();
		
		Animal elefante = new Mamifero();
		Animal leao = new Mamifero();
		elefante.setPeso(2000);
		leao.setPeso(120);
		Animal aguia = new Aves();
		Animal pardal = new Aves();
		aguia.setPeso(6);
		pardal.setPeso(0.5);
		Animal salmao = new Peixes();
		Animal tilapia = new Peixes();
		salmao.setPeso(5);
		tilapia.setPeso(2.4);
		
		lista.add(elefante);
		lista.add(aguia);
		lista.add(salmao);
		lista.add(tilapia);
		lista.add(pardal);
		lista.add(leao);
		lista.mergeSort();
		System.out.println(lista);
	}
}
