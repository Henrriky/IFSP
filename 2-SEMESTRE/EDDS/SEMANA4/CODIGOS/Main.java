package semana4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[][] matriz = new Integer[8][];

        //gerarArrayBidimensionalDinamicoOrganizado(matriz);
        
        //int[] tamanho = {9, 10, 8, 12, 6, 2, 1, 8};
        
        //gerarArrayBidimensionalDinamicoDesorganizado(matriz, tamanho);
        //Arrays.toString(null)
        
        System.out.println(fibonacci(55, 34));

    }
    
    public static int fatorial(int fatorialN) {
    	
    	
    
    	if (fatorialN == 0 || fatorialN == 1) {
        	return 1;
    	}
    
    	return fatorialN * fatorial((fatorialN -1));
    }
    
    public static int fibonacci (int antecessor, int sucessor) {
    	
    	System.out.println(sucessor);
    	
    	if (sucessor == 1) {
    		return 1;
    	}
    	
    	int valor = antecessor - sucessor;
    	
    	return fibonacci(sucessor, valor); 
    	
    }

    public static void gerarArrayBidimensionalDinamicoOrganizado(Integer[][] a) {
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                a[i] = null;
            } else {
                a[i] = new Integer[i]; //Instanciando com o tamanho da coluna
                for (int j = 0; j < a[i].length; j++) {
                    b += 1;
                    a[i][j] = b;
                }
            }
        }
        //System.out.println(imprimeMatrizBidimensionalDinamica(a));
    }

    public static void gerarArrayBidimensionalDinamicoDesorganizado(Integer[][] a, int[] tamanho) {
    	int b = 0;
    	
    	for (int i = 0; i < a.length; i++) {
    		int T = tamanho[i];
    		a[i] = new Integer[T];
    		for (int j = 0; j < a[i].length; j++) {
    			b += 1;
    			a[i][j] = b;
    		}
    	}
    	for (int j = 0; j < a.length; j++) {
						
    		System.out.println(Arrays.toString(a[j]));
		}
//    	System.out.println(imprimeMatrizBidimensionalDinamica(a)); 
    }
    
	public static String imprimeMatrizBidimensionalDinamica(Integer[][] a) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			builder.append("[");
            //if (i != 0) {
                for(int j = 0; j < a[i].length; j++) {
                    builder.append(a[i][j]);
                    if (j < a[i].length - 1) {
                        builder.append(", ");
                    }
                }
            /*} else {
                builder.append(a[0]);
            }*/
			builder.append("]\n");
		}
		return builder.toString();
	}
}