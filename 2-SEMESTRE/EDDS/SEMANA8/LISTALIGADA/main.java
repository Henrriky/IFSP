package SEMANA8.LISTALIGADA;

import SEMANA7.NumeroComplexo;

public class main {

	public static void main(String[] args) {
		
		ListaLigada<NumeroComplexo> l = new ListaLigada<NumeroComplexo>();
		l.add(new NumeroComplexo(2, -1));
		l.add(new NumeroComplexo(3, -5));
		l.add(new NumeroComplexo(6, -1));
		System.out.println(l);
		
	}
	
}


