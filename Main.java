package br.edu.ifsp.spo.edda.exercicio.semana3;

public class Main {

	public static void main(String[] args) {
		
		NumeroComplexo n1 = new NumeroComplexo();
		NumeroComplexo n2 = new NumeroComplexo(1, 2);
	
		System.out.println(n1);
		System.out.println(n2);

		
		//System.out.println(n1.equals("A"));
		System.out.println(n1.equals(n1));
		System.out.println(n1.equals(n2));
		NumeroComplexo n3 = new NumeroComplexo();
		System.out.println(n1.equals(n3));
		
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
		
			
			
		
	}

}
