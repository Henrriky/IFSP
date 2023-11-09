package OTHERS.GRAFO;

public class Grafos {
	public static void main(String[] args) {
		Grafo<String> grafo = new Grafo<String>();
		grafo.adicionarVertice("Joao");
		grafo.adicionarVertice("Lorenzo");
		grafo.adicionarVertice("Creuza");
		grafo.adicionarVertice("Creber");
		grafo.adicionarVertice("Craudio");
		
		grafo.adicionarAresta(2.0, "Joao", "Lorenzo");
		grafo.adicionarAresta(3.0, "Lorenzo", "Creber");
		grafo.adicionarAresta(1.0, "Creber", "Creuza");
		grafo.adicionarAresta(1.0, "Joao", "Creuza");
		grafo.adicionarAresta(2.0, "Craudio", "Lorenzo");
		grafo.adicionarAresta(3.0, "Craudio", "Joao");
		
		grafo.buscaEmLargura();
	}
}
