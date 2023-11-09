package OTHERS.GRAFOLISTAADJACENCIA;

import java.util.ArrayList;
import java.util.Iterator;

public class Grafo {

	private int numeroVertices;
	private ArrayList<ArrayList<Integer>> listaAdjacencia;
	
	public Grafo (int numeroDeVertices) {
		this.numeroVertices = numeroDeVertices;
		listaAdjacencia = new ArrayList(numeroDeVertices);
		
		for (int i = 0; i < numeroVertices; i++) {
			listaAdjacencia.add(new ArrayList<Integer>());
		}
	}
	
	public void adicionarAresta(int v1, int v2) {
		ArrayList<Integer> ve1 = listaAdjacencia.get(v1);
		ArrayList<Integer> ve2 = listaAdjacencia.get(v2);
		ve1.add(v2);
		ve2.add(v1);
	}
	
	public boolean saoVizinhos(int v1, int v2) {
		return listaAdjacencia.get(v1).contains(v2);
	}
	
	public ArrayList<Integer> vizinhos (int v) {
		return listaAdjacencia.get(v);
	}
	
}
