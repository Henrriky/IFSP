#include <stdio.h>

int main () {

    const int QTD_PRODUTOS = 5;
    int i = 0;
    float produtos[QTD_PRODUTOS], menor_valor = 0, maior_valor = 0;
    for (i = 0; i < QTD_PRODUTOS; i++) {
        printf("Digite o preco do produto %i: ", i+1);
        scanf("%f", &produtos[i]);
    }

    printf("\n====================PRECO DOS PRODUTOS DIGITADOS====================\n");
    for (i = 0; i < QTD_PRODUTOS; i++) {
        printf("\n=========PRECO DO PRODUTO %i=========\n", i+1);
        printf("Preco do produto %i R$: %.2f \n", i+1, produtos[i]);
        //Logica de menor e maior valor
        if (i == 0) {
            menor_valor = produtos[i];
            maior_valor = produtos[i];
        } else {
            if (produtos[i] < menor_valor) {
                menor_valor = produtos[i];
            }
            if (produtos[i] > maior_valor) {
                maior_valor = produtos[i];
            }
        }
    }

    printf("\n====================MENOR E MAIOR PRECO====================\n");

    printf("Maior preco dos produtos digitados: R$ %.2f\n", maior_valor);
    printf("Menor preco dos produtos digitados: R$ %.2f\n", menor_valor);
}