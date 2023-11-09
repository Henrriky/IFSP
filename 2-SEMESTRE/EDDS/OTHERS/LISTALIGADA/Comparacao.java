package OTHERS.LISTALIGADA;

import java.util.ArrayList;
import java.util.Iterator;

public class Comparacao {
	public static void main(String[] args) {
		
		/*=============PERFOMANCE ADIÇÃO===============*/
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		//Adicionar elementos
		int limite = 10000;
		long tempoInicial = System.currentTimeMillis();
		for (int i = 0; i < limite; i++) {
			vetor.add(i);
		}
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Adicionou " + limite + " elementos no vetor");
		System.out.println(tempoFinal - tempoInicial);
		
		//Utiliza mais memória
		ListaLigada<Integer> lista = new ListaLigada<Integer>();
		tempoInicial = System.currentTimeMillis();
		for (int i = 0; i < limite; i++) {
			lista.adicionar(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("");
		System.out.println("");
		System.out.println("Adicionou " + limite + " elementos na lista");
		System.out.println(tempoFinal - tempoInicial);
		
		/*=============PERFOMANCE LEITURA===============*/
		//Ler valores
		tempoInicial = System.currentTimeMillis();
		for (int i = 0; i < vetor.size(); i++) {
			vetor.get(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("");
		System.out.println("");
		System.out.println("Tempo de leitura do vetor: " + (tempoFinal - tempoInicial) + " ms");
		
		/*
		tempoInicial = System.currentTimeMillis();
		for (int i = 0; i < lista.getTamanho(); i++) {
			lista.get(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("");
		System.out.println("");
		System.out.println("Tempo de leitura da lista ligada: " + (tempoFinal - tempoInicial) + " ms");
		*/
		
		tempoInicial = System.currentTimeMillis();
		IteratorListaLigada<Integer> iterator = lista.getIterator();
		while (iterator.temProximo()) {
			iterator.getProximo();
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("");
		System.out.println("");
		System.out.println("Tempo de leitura da lista ligada com iterator: " + (tempoFinal - tempoInicial) + " ms");
		
		
		
		
	}
}
