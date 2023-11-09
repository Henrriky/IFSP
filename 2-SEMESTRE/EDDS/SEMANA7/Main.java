package SEMANA7;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		/*
		Integer[] valores = new Integer[10];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = random.nextInt();
		}*/
		
		//System.out.println(Arrays.toString(valores));
		//UtilSort.bubble_sort(valores);
		//new UtilSortGenerics<Integer>();
		//UtilSortGenerics<Integer> utilSort = new UtilSortGenerics<Integer>();
		//utilSort.bubble_sort(valores);
		
		/*
		ListaGenerics<Integer> buble = new ListaGenerics<Integer>();
		for (int i = 0; i < 10; i++) {
			buble.add(random.nextInt()/10000);
		}
		System.out.println(buble.toString());
		buble.bubble_sort();
		*/
		
		/*
		ListaGenerics<NumeroComplexo> buble2 = new ListaGenerics<NumeroComplexo>();
		buble2.add(new NumeroComplexo(5, -1));
		buble2.add(new NumeroComplexo(5, 10));
		buble2.add(new NumeroComplexo(2, 10));
		buble2.add(new NumeroComplexo(3, -1));
		buble2.add(new NumeroComplexo(30, -1));
		System.out.println(buble2);
		buble2.bubble_sort();
		System.out.println(buble2);
		*/
		
		/*
		ListaGenerics<Integer> selectSort = new ListaGenerics<Integer>();
		selectSort.add(5);
		selectSort.add(7);
		selectSort.add(3);
		selectSort.add(1);
		selectSort.add(4);
		System.out.println(selectSort);
		selectSort.selection_sort();
		System.out.println(selectSort);
		*/
		
		ListaGenerics<Integer> insertionSort = new ListaGenerics<Integer>();
		insertionSort.add(5);
		insertionSort.add(7);
		insertionSort.add(3);
		insertionSort.add(1);
		insertionSort.add(4);
		System.out.println(insertionSort);
		insertionSort.insertion_sort();
		System.out.println(insertionSort);
		
		
		
	}
	
}
