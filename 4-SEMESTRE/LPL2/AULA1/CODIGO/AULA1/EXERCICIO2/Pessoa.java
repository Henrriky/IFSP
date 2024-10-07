package AULA1.EXERCICIO2;

public class Pessoa {

	int id;
	int idade;
	String sexo;
	String nome;
	
	public Pessoa(int id, int idade, String sexo, String nome) {
		this.id = id;
		this.idade = idade;
		this.sexo = sexo;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
