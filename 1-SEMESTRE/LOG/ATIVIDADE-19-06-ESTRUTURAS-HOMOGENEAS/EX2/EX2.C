#include <stdio.h>

int main () {

    const int QTD_PRODUTOS = 5;
    int i = 0;
    float produtos[QTD_PRODUTOS], preco_medio_produtos = 0;
    while (i < QTD_PRODUTOS) {
        printf("Digite o preco do produto %i: ", i+1);
        scanf("%f", &produtos[i]);
        preco_medio_produtos += produtos[i];
        i++;
    }

    i = 0;
    printf("\n====================PRECO DOS PRODUTOS====================\n");
    while (i < QTD_PRODUTOS) {
        printf("\n=========PRECO DO PRODUTO %i=========\n", i+1);
        printf("Preco do produto %i R$: %.2f \n", i+1, produtos[i]);
        i++;
    }

    preco_medio_produtos = preco_medio_produtos/QTD_PRODUTOS;
    printf("\nPRECO MEDIO DOS PRODUTOS ----------- R$: %.2f", preco_medio_produtos);


}