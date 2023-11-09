package OTHERS.GRAFOMATRIZADJACENCIA;

public class Tetse {
	public static void main(String[] args) {
		Grafo graph = new Grafo(5);
		graph.adicionarAresta(0, 1);
		graph.adicionarAresta(0, 2);
		graph.adicionarAresta(1, 2);
		
		System.out.println("Matriz de Adjacencia:");
		graph.imprimirMatrizAdj();
		System.out.println("");
		System.out.println("Existe ligacao entre o 0 e 1? " + graph.existeAresta(0, 1));
		System.out.println("Existe ligacao entre o 1 e 2? " + graph.existeAresta(1, 2));
	}
}
