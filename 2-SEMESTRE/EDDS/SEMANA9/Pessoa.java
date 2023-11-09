package SEMANA9;

import java.util.Objects;

public class Pessoa {

	Long id;
	String nome;
	String sobrenome;
	int idade;
	
	public Pessoa() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idade, nome, sobrenome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id) && idade == other.idade && Objects.equals(nome, other.nome)
				&& Objects.equals(sobrenome, other.sobrenome);
	}
	
	
	
}
