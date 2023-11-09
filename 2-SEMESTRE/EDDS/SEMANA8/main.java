package SEMANA8;

import java.util.Arrays;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		/*
		ListaGenerics<Integer> mergeSort = new ListaGenerics<Integer>();
		mergeSort.add(5);
		mergeSort.add(7);
		mergeSort.add(3);
		mergeSort.add(1);
		mergeSort.add(4);
		System.out.println(mergeSort);
		mergeSort.mergeSort();
		System.out.println(mergeSort);
		*/
		
		
		ListaGenerics<Integer> quickSort = new ListaGenerics<Integer>();
		quickSort.add(5);
		quickSort.add(7);
		quickSort.add(3);
		quickSort.add(1);
		quickSort.add(4);
		/*
		System.out.println(quickSort);
		quickSort.quicksort();
		System.out.println(quickSort);
		*/
		quickSort.bubble_sort();
		System.out.println(quickSort.buscaBinaria(0, quickSort.getTamanho() - 1, 5)); 
	}
	
}
