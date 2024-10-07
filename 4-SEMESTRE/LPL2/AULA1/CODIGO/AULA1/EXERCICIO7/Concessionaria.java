package AULA1.EXERCICIO7;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

	private List<Veiculo> veiculos;
	
	
	
	public Concessionaria() {
		this.veiculos = new ArrayList<Veiculo>();
	}



	public void adicionarVeiculo (Veiculo veiculo) throws Exception {
		
		if (veiculos.contains(veiculo)) {
			throw new Exception("Pode nao rapaz");
		}
		
		veiculos.add(veiculo);
		
	}
	
	
	
}
