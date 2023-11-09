package SEMANA9.EXERCICIOS;

public class Associacao {

	private String placa;
	private Carro carro;
	
	public Associacao (String placa, Carro carro) {
		this.placa = placa;
		this.carro = carro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.carro + " Placa: " + this.placa;
	}
	
}
