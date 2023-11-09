package OTHERS.IA;

import java.util.Random;

public class Neuronio {
    private double[] pesos; // Pesos das entradas
    private double bias;    // Bias (viés)
    
    public Neuronio(int numEntradas) {
        // Inicialize os pesos com valores aleatórios entre -1 e 1
        pesos = new double[numEntradas];
        Random random = new Random();
        for (int i = 0; i < numEntradas; i++) {
            pesos[i] = random.nextDouble() * 2 - 1;
        }

        // Inicialize o bias com um valor aleatório entre -1 e 1
        bias = random.nextDouble() * 2 - 1;
    }
    
    public double ativar(double[] entradas) {
        if (entradas.length != pesos.length) {
            throw new IllegalArgumentException("Número incorreto de entradas");
        }

        double soma = 0;
        for (int i = 0; i < entradas.length; i++) {
            soma += entradas[i] * pesos[i];
        }
        soma += bias;

        // Função degrau simples (se soma >= 0, retorna 1; senão, retorna 0)
        return (soma >= 0) ? 1 : 0;
    }
}
