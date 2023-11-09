package SEMANA9.EXERCICIOS;

import java.util.ArrayList;
import java.util.List;

public class MapList {

	private List<Associacao> associacoes = new ArrayList<Associacao>();
	
	public void adiciona (String placa, Carro carro) {
		if (!this.contemChave(placa)) {
			this.associacoes.add(new Associacao(placa, carro));
		}
		
	}
	
	public Carro pega (String placa) {
		for (Associacao associacao: this.associacoes) {
			if (placa.equals(associacao.getPlaca())) {
				return associacao.getCarro();
			}
		}
		throw new IllegalArgumentException("Chave inexistente");
	}
	
	public void remove (String placa) {
		if (this.contemChave(placa)) {
			for (int i = 0; i < this.associacoes.size(); i++) {
				Associacao associacao = this.associacoes.get(i);
				if (placa.equals(associacao.getPlaca())) {
					associacoes.remove(associacao);
					break;
				}
			}
		} else {
			throw new IllegalArgumentException("Chave inexistente");			
		}
	}
	
	public boolean contemChave (String placa) {
		for (Associacao associacao: this.associacoes) {
			if (placa.equals(associacao.getPlaca())) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho () {
		return this.associacoes.size();
	}
	
	@Override
	public String toString() {
		
		StringBuilder a = new StringBuilder("");
		a.append("[ ");
		for (Associacao associacao : associacoes) {
			a.append("\n");
			a.append(associacao);
		}
		a.append(" ]");
		
		return a.toString();
	}
	
}
