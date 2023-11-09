package OTHERS.GRAFOLISTAADJACENCIA;

public class teste {

	public static void main(String[] args) {
		
		Grafo teste = new Grafo(5);
		teste.adicionarAresta(0, 1);
		teste.adicionarAresta(0, 2);
		teste.adicionarAresta(2, 3);
		
		System.out.println("0 eh vizinho do 1? " + teste.saoVizinhos(0, 1));
		System.out.println("0 eh vizinho do 2? " + teste.saoVizinhos(0, 2));
		System.out.println("0 eh vizinho do 3? " + teste.saoVizinhos(0, 3));
		System.out.println("2 eh vizinho do 3? " + teste.saoVizinhos(2, 3));
		
		System.out.print("0 -> ");
		System.out.print(teste.vizinhos(0));
		
	}
	
}
