package SEMANA9.EXERCICIOS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MapaEspalhamento<C, V> {
	private List<List<AssociacaoGeneric<C, V>>> tabela = new ArrayList<List<AssociacaoGeneric<C, V>>>();
	
	public MapaEspalhamento () {
		//Cria uma matriz com 100 elementos
		for (int i = 0; i < 100; i++) {
			this.tabela.add(new LinkedList<AssociacaoGeneric<C, V>>());
		}
	}
	
	private int calculaIndiceDaTabela(C chave) {
		return Math.abs(chave.hashCode()) % this.tabela.size();
	}
	
	public boolean contemChave (C chave) {
		int indice = this.calculaIndiceDaTabela(chave); //Indice gerado
		List<AssociacaoGeneric<C, V>> lista = this.tabela.get(indice); //Busca da lista aonde a chave está armazenada
		
		for (int i = 0; i < lista.size(); i++) { //Percorrer a lista dessa chave
			AssociacaoGeneric<C, V> associacao = lista.get(i);
			if (associacao.getChave().equals(chave)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void remove (C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<AssociacaoGeneric<C, V>> lista = this.tabela.get(indice);
		
		for (int i = 0; i < lista.size(); i++) {
			AssociacaoGeneric<C, V> associacao = lista.get(i);
			if (associacao.getChave().equals(chave)) {
				lista.remove(indice);
				return;
			}
		}
		
		throw new IllegalArgumentException("Chave não existe");
	}
	
	public void adiciona (C chave, V valor) {
		if (this.contemChave(chave)) {
			this.remove(chave);
		}
		int indice = this.calculaIndiceDaTabela(chave);
		List<AssociacaoGeneric<C, V>> lista = this.tabela.get(indice);
		lista.add(new AssociacaoGeneric(chave, valor));
	}
	
	public V pega (C chave) {
		
		int indice = this.calculaIndiceDaTabela(chave);
		List<AssociacaoGeneric<C, V>> lista = this.tabela.get(indice);
		for (int i = 0; i < lista.size(); i++) {
			AssociacaoGeneric<C, V> associacao = lista.get(i);
			if (associacao.getChave().equals(chave)) {
				return associacao.getValor();
			}
		}
		
		throw new IllegalArgumentException("Chave não existe");
	}
}
