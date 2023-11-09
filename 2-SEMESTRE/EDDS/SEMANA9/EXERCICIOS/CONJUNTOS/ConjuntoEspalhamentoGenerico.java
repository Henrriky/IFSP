package SEMANA9.EXERCICIOS.CONJUNTOS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamentoGenerico {

	ArrayList<List<Object>> tabela = new ArrayList<List<Object>>();
	private int tamanho = 0;

	public ConjuntoEspalhamentoGenerico () {
		for (int i = 0; i < 26; i++) {
			LinkedList<Object> lista = new LinkedList<Object>();
			tabela.add(lista);	
		}
	}
	
	private void redimensionaTabela(int novaCapacidade) {
		List<Object> objects = this.pegaTodas();
		this.tabela.clear();
		
		for (int i = 0; i < novaCapacidade; i++) {
			this.tabela.add(new LinkedList<Object>());
		}
		
		for (Object object : objects) {
			this.adiciona(object);
		}
	}
	
	private void verificaCarga() {
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho / capacidade;
		
		if (carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		} else if (carga < 0.25) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}
	
	private int calculaIndiceDaTabela(Object object) {
		int codigoDeEspalhamento = Math.abs(object.hashCode());
		return codigoDeEspalhamento % this.tabela.size();
	}
	
	public void adiciona (Object object) {
		if (!this.contem(object)) {
			int indice = this.calculaIndiceDaTabela(object);
			List<Object> lista = this.tabela.get(indice);
			verificaCarga();
			lista.add(object);
			this.tamanho++;
		}
	}
	
	public void remove (Object object) {
		if (this.contem(object)) {
			int indice = this.calculaIndiceDaTabela(object);
			List<Object> lista = this.tabela.get(indice);
			lista.remove(object);
			this.tamanho--;
			verificaCarga();
			/*for (int i = 0; i < lista.size(); i++) {
				String p = lista.get(i);
				if (p.equals(palavra)) {
					lista.remove(indice);
				}
			}*/
		}
	}
	
	public boolean contem (Object object) {
		int indice = this.calculaIndiceDaTabela(object);
		List<Object> lista = this.tabela.get(indice);
		
		return lista.contains(object);
		
	}
	
	public List<Object> pegaTodas() {
		List<Object> objects = new ArrayList<Object>();
		for (int i = 0; i < this.tabela.size(); i++) {
			objects.addAll(this.tabela.get(i));
		}
		return objects;
	}
	
	public void imprimeTabela() {
		for (List<Object> lista: this.tabela) {
			System.out.println("[");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println("*");
			}
			System.out.println("]");
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}
}
