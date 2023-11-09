package OTHERS.GRAFOMATRIZADJACENCIA;

import java.util.Iterator;

public class Grafo {

	private int numV;
	private int[][] mAdjacencia;
	
	public Grafo(int numV) {
		mAdjacencia = new int[numV][numV];
		this.numV = numV;
		
		for (int i = 0; i < mAdjacencia.length; i++) {
			for (int j = 0; j < mAdjacencia[i].length; j++) {
				mAdjacencia[i][j] = 0;
			}
		}
	}
	
	public void adicionarAresta(int v1, int v2) {
		int indiceInicio = v1;
		int indiceFim = v2;
		
		if (v1 < numV && v2 < numV) {
			mAdjacencia[indiceInicio][indiceFim] = 1;
			mAdjacencia[indiceFim][indiceInicio] = 1;
		}
	}
	
	public boolean existeAresta(int v1, int v2) {
		
		return mAdjacencia[v1][v2] == 1 || mAdjacencia[v2][v1] == 1 ? true : false;
		
	}
	
	public void imprimirMatrizAdj() {
	    for (int i = 0; i < numV; i++) {
	        for (int j = 0; j < numV; j++) {
	            System.out.print(mAdjacencia[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	
	
}
