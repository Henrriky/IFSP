package LISTA2.BUSCAS;

import LISTA2.Animal;
import LISTA2.Aves;
import LISTA2.Mamifero;
import LISTA2.Peixes;
import LISTA2.ListaGenerics;

public class binarySearchRec {
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
		Animal a = new Mamifero();
		a.setPeso(90);
		System.out.println(lista.buscaBinariaRecursiva(0, lista.getTamanho() - 1, tilapia));
		System.out.println(lista.buscaBinariaRecursiva(0, lista.getTamanho() - 1, a));
	}
}
