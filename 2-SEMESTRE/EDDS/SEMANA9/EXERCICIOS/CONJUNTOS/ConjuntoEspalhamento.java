package SEMANA9.EXERCICIOS.CONJUNTOS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	
	ArrayList<List<String>> tabela = new ArrayList<List<String>>();
	private int tamanho = 0;

	public ConjuntoEspalhamento () {
		for (int i = 0; i < 26; i++) {
			LinkedList<String> lista = new LinkedList<String>();
			tabela.add(lista);	
		}
	}
	
	private void redimensionaTabela(int novaCapacidade) {
		List<String> palavras = this.pegaTodas();
		this.tabela.clear();
		
		for (int i = 0; i < novaCapacidade; i++) {
			this.tabela.add(new LinkedList<String>());
		}
		
		for (String palavra : palavras) {
			this.adiciona(palavra);
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
	
	private int calculaCodigoDeEspalhamento (String palavra) {
		int codigo = 1;
		for (int i = 0; i < palavra.length(); i++) {
			codigo = 31 * codigo + palavra.charAt(i);
		}
		return codigo;
	}
	
	
	private int calculaIndiceDaTabela(String palavra) {
		int codigoDeEspalhamento = Math.abs(this.calculaCodigoDeEspalhamento(palavra));
		return codigoDeEspalhamento % this.tabela.size();
	}
	
	public void adiciona (String palavra) {
		if (!this.contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			verificaCarga();
			lista.add(palavra);
			this.tamanho++;
		}
	}
	
	public void remove (String palavra) {
		if (this.contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.remove(palavra);
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
	
	public boolean contem (String palavra) {
		int indice = this.calculaIndiceDaTabela(palavra);
		List<String> lista = this.tabela.get(indice);
		
		return lista.contains(palavra);
		
	}
	
	public List<String> pegaTodas() {
		List<String> palavras = new ArrayList<String>();
		for (int i = 0; i < this.tabela.size(); i++) {
			palavras.addAll(this.tabela.get(i));
		}
		return palavras;
	}
	
	public void imprimeTabela() {
		for (List<String> lista: this.tabela) {
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
