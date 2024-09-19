package AULA1.EXERCICIO6;

public class Cachorro implements Cloneable {

	private int idade;
	private String raca;
	private Float peso;
	private String sexo;
	private String nome;
	
	public Cachorro(int idade, String raca, Float peso, String sexo, String nome) {
		this.idade = idade;
		this.raca = raca;
		this.peso = peso;
		this.sexo = sexo;
		this.nome = nome;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
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
