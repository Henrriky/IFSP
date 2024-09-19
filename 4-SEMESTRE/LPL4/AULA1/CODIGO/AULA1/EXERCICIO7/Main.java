package AULA1.EXERCICIO7;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws Exception {
		/**
		 * 7. Implemente um programa para cadastrar objetos Veiculo contendo as seguintes
			informações: modelo, marca, ano de fabricação, data de cadastro e preço. Os objetos
			devem ser armazenados em uma coleção ArrayList e o programa não deve permitir o
			cadastro de um veículo com as mesmas informações existentes em outro veículo já
			cadastrado. Para isso, sobrescreva o método equals na classe Veiculo, e utilize-o para fazer
			as verificações necessárias.
		 */
		//String marca, String modelo, int anoDeFabricacao, LocalDate dataCadastro, float preco
		Veiculo c = new Veiculo("onix", "joao", 2000, LocalDate.of(2020, 3, 3), 100000.0F);
		Veiculo c1 = new Veiculo("onix", "joao", 2000, LocalDate.of(2020, 3, 3), 100000.0F);
		Concessionaria con = new Concessionaria();
		con.adicionarVeiculo(c);
		con.adicionarVeiculo(c1);
		

		
		
		
	}
}
