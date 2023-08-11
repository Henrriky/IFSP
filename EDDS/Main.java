package br.edu.ifsp.spo.edda.exercicio.semana3;

public class Main {

	public static void main(String[] args) {
		
		NumeroComplexo n1 = new NumeroComplexo();
		NumeroComplexo n2 = new NumeroComplexo(1, 2);
	
		//Tentando printar o 
		System.out.println(n1);
		System.out.println(n2);

		
		//System.out.println(n1.equals("A"));
		System.out.println(n1.equals(n1));
		System.out.println(n1.equals(n2));
		NumeroComplexo n3 = new NumeroComplexo();
		System.out.println(n1.equals(n3));
		
		/*
		//[] referencia um array
		int[] a = new int[4];
		//outra maneira de declarar arrays
		int[] b;
		b = new int[10];
		//declarando multiplos arrays
		int[] r = new int[44], k = new int[23];
		
		//declarando o array e ja inicializando os valores
		int[] iniciaValores = {2, 3, 4, 6};
		//declarando um array de inteiros
		int[] myArray;
		//aloca memoria para 10 inteiros
		myArray = new int[10];
		//inicializa o primeiro elemento
		myArray[0] = 2;
		myArray[1] = 5;
		myArray[2] = 10;
		*/
		
		int[] a = { 2, 1, 3, 6, 7, 10 };
		
		NumeroComplexo[] objetos = { n1, n2};
		System.out.println(imprimeArray(objetos));;
		System.out.println(imprimeArray(objetos));;
		
		//int[][] arrayBidimensional = new int[1][5];
		int[][] array1 = {
				{1, 2, 3, 4, 5}, 
				{2, 3, 4, 5, 7, 8},
				{20, 21, 3, 90, 100},
				{10, 3, 4, 5, 6, 9, 10, 13, 14}
		};
		//System.out.println(imprimeArray(array1));
		System.out.println(imprimeMatrizBidimensional(array1));

		
		
	}

	public static String imprimeArray(NumeroComplexo[] a) {
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < a.length; i++) {
			builder.append(a[i]);
			if (i < (a.length - 1)) {
				builder.append(", ");
			}
		}
		builder.append("]");
		return builder.toString();
	}
	
	public static String imprimeMatrizBidimensional(int[][] a) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			builder.append("[");
			for(int j = 0; j < a[i].length; j++) {
				builder.append(a[i][j]);
				if (j < a[i].length - 1) {
					builder.append(", ");
				}
			}
			builder.append("]");
		}
		return builder.toString();
	}

}
