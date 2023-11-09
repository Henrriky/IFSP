public class Main {
    public static void main(String[] args) {

        Integer[][] matriz = new Integer[8][];

        gerarArrayBidimensionalDinamico(matriz);

    }

    public static void gerarArrayBidimensionalDinamico(Integer[][] a) {
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                a[i] = null;
            } else {
                a[i] = new Integer[i];
                for (int j = 0; j < a[i].length; j++) {
                    b += 1;
                    a[i][j] = b;
                }
            }
        }
        System.out.println(imprimeMatrizBidimensionalDinamica(a));
    }

	public static String imprimeMatrizBidimensionalDinamica(Integer[][] a) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			builder.append("[");
            if (i != 0) {
                for(int j = 0; j < a[i].length; j++) {
                    builder.append(a[i][j]);
                    if (j < a[i].length - 1) {
                        builder.append(", ");
                    }
                }
            } else {
                builder.append(a[0]);
            }
			builder.append("]\n");
		}
		return builder.toString();
	}
}
