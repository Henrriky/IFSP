package OTHERS.LISTALIGADA;

public class ProgramaCliente {
	public static void main(String[] args) {
		ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
		 
		Cliente cliente1 = new Cliente("123", "Jao");
		Cliente cliente2 = new Cliente("12345", "Juca");
		Cliente cliente3 = new Cliente("123", "Ze");
		
		clientes.adicionar(cliente1);
		clientes.adicionar(cliente2);
		clientes.adicionar(cliente3);
		
		System.out.println("Tamanho: "  + clientes.getTamanho());
		for (int i = 0; i < clientes.getTamanho(); i++) {
			System.out.println(clientes.get(i).getValor());
		}

		//Pegar o nome que queremos remover
		clientes.remover(cliente1);
		System.out.println("Tamanho: "  + clientes.getTamanho());
		for (int i = 0; i < clientes.getTamanho(); i++) {
			System.out.println(clientes.get(i).getValor());
		}
	}
}
