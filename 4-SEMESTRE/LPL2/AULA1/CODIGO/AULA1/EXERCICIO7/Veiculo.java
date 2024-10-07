package AULA1.EXERCICIO7;

import java.time.LocalDate;

public class Veiculo {

	private String marca;
	private String modelo;
	private int anoDeFabricacao;
	private LocalDate dataCadastro;
	private float preco;
	
	public Veiculo(String marca, String modelo, int anoDeFabricacao, LocalDate dataCadastro, float preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
		this.dataCadastro = dataCadastro;
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object obj) {

		Veiculo castingzin = (Veiculo) obj;
		
		return this.marca.equals(castingzin.marca) 
				&& this.anoDeFabricacao == castingzin.anoDeFabricacao 
				&& this.dataCadastro.equals(castingzin.dataCadastro)
				&& this.preco == castingzin.preco
				&& this.modelo.equals(castingzin.modelo)
		;
	}


	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
