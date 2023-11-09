package SEMANA9.EXERCICIOS;

import java.util.HashMap;
import java.util.Map;

public class Programa {

	public static void main(String[] args) {		
		
		MapList lista = new MapList();
		
		Carro carro1 = new Carro("");
		String placa1 = "K21SD13";
		carro1.setNome("Celta");
		
		Carro carro2 = new Carro("");
		String placa2 = "P21SD13";
		carro2.setNome("Ferrari");
		
		Carro carro3 = new Carro("");
		String placa3 = "N21SD13";
		carro3.setNome("Bugatti");

		lista.adiciona(placa1, carro1);
		lista.adiciona(placa2, carro2);
		lista.adiciona(placa3, carro3);
		
		System.out.println(lista.pega(placa1));
		System.out.println(lista.pega(placa2));
		System.out.println(lista.pega(placa3));
		//System.out.println(lista.pega("asdasd"));
		
		lista.remove(placa1);
		System.out.println(lista);
		System.out.println(lista.contemChave(placa3));
		
	}
	
}
