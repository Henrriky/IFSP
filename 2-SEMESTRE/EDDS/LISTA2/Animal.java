package LISTA2;

public abstract class Animal implements Comparable<Animal> {

	private double peso;
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public int compareTo(Animal o) {
		if (this.getPeso() < o.getPeso()) {
			return -1;
		}
		return this.getPeso() > o.getPeso() ? 1 : 0;
	}
	
	
	
	
}
