#include <stdio.h>

int main () {

    struct carro {
        char MARCA[30];
        char MODELO[30];
        int ANO_FABRICACAO;
        float VALORES_OFERTA[3];
    };

    struct carro carros[10];

    int i, j;
    float maior_valor, valor_medio = 0, menor_valor;

    for (i = 0; i < 10; i++) {
        fflush(stdin);
        printf("Digite a marca do carro %i: ", i+1);
        gets(carros[i].MARCA);
        fflush(stdin);
        printf("Digite o modelo do carro %i: ", i+1);
        gets(carros[i].MODELO);
        fflush(stdin);
        printf("Digite o ano de fabricacao do carro %i: ", i+1);
        scanf("%i", &carros[i].ANO_FABRICACAO);
        for (j = 0; j < 3; j++) {
            printf("Digite a %i oferta do carro %i: ", j+1, i+1);
            scanf("%f", &carros[i].VALORES_OFERTA[j]);
        }
        printf("\n========================================================\n");
    }

    for (i = 0; i < 10; i++) {
        valor_medio = 0;
        menor_valor = 0;
        maior_valor = 0;
        printf("\nA marca do carro %i eh: %s", i+1, carros[i].MARCA);
        printf("\nO modelo do carro %i eh: %s", i+1, carros[i].MODELO);
        printf("\nO ano de fabricacao do carro %i eh: %i", i+1, carros[i].ANO_FABRICACAO);

        for (j = 0; j < 3; j++) {
            printf("\nOferta %i  do carro %i: %.2f", j+1, i+1, carros[i].VALORES_OFERTA[j]);
        }

        for (j = 0; j < 3; j++) {
            if (j == 0) {
                menor_valor = carros[i].VALORES_OFERTA[j];
                maior_valor = carros[i].VALORES_OFERTA[j];
            } else {
                if (carros[i].VALORES_OFERTA[j] < menor_valor) {
                    menor_valor = carros[i].VALORES_OFERTA[j];
                }
                if (carros[i].VALORES_OFERTA[j] > maior_valor) {
                    maior_valor = carros[i].VALORES_OFERTA[j];
                }
            }
            valor_medio += carros[i].VALORES_OFERTA[j];
        }

        valor_medio = valor_medio/3;
        printf("\nValor medio das ofertas do carro %i: %.2f", i+1, valor_medio);
        printf("\nMaior oferta do carro %i: %.2f", i+1, maior_valor);

        printf("\n========================================================");
    }

}