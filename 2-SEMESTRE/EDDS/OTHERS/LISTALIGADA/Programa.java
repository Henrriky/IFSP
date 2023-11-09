package OTHERS.LISTALIGADA;

public class Programa {
	public static void main(String[] args) {
		
		ListaLigada<String> lista = new ListaLigada<String>();
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("CE");
		lista.adicionar("DF");
		System.out.println("Tamanho: "  +  lista.getTamanho());
		System.out.println("Primeiro: " +  lista.getPrimeiro().getValor());
		System.out.println("Ultimo: "   +  lista.getUltimo().getValor());
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		//Remover elemento CE
		lista.remover("CE");
		System.out.println("Removeu estado CE");
		lista.remover("DF");
		System.out.println("Removeu estado DF");
		lista.remover("AC");
		System.out.println("Removeu estado AC");
		lista.remover("BA");
		System.out.println("Removeu estado BA");
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
	}
}
