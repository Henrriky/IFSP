package LISTA2;

public class insercaoEmOrdem {
	public static void main(String[] args) {
		ListaGenerics<Animal> lista = new ListaGenerics<Animal>();
		
		Animal elefante = new Mamifero();
		Animal leao = new Mamifero();
		elefante.setPeso(2000);
		leao.setPeso(120);
		Animal aguia = new Aves();
		Animal pardal = new Aves();
		aguia.setPeso(6);
		pardal.setPeso(0.5);
		Animal salmao = new Peixes();
		Animal tilapia = new Peixes();
		salmao.setPeso(5);
		tilapia.setPeso(2.4);
		
		lista.addEmOrdem(elefante);
		lista.addEmOrdem(aguia);
		lista.addEmOrdem(salmao);
		lista.addEmOrdem(tilapia);
		lista.addEmOrdem(pardal);
		lista.addEmOrdem(leao);
		System.out.println(lista);
	}
}
