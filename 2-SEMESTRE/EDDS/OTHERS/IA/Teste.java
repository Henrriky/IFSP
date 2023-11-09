package OTHERS.IA;

public class Teste {

	
	public static void main(String[] args) {
        // Crie um neurônio com 2 entradas
        Neuronio neuronio = new Neuronio(2);

        // Dados de entrada
        double[] entrada = {0.5, 0.7};

        // Ative o neurônio com os dados de entrada
        double resultado = neuronio.ativar(entrada);

        // Imprima o resultado
        System.out.println("Resultado da classificacao: " + resultado);
	}
}
