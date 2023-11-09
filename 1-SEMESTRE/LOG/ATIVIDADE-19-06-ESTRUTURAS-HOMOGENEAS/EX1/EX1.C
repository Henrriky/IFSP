#include <stdio.h>

int main () {

    const int QTD_PRODUTOS = 5;
    int i = 0;
    float produtos[QTD_PRODUTOS];
    while (i < QTD_PRODUTOS) {
        printf("Digite o preco do produto %i: ", i+1);
        scanf("%f", &produtos[i]);
        i++;
    }

    i = 0;
    printf("\n====================PRECO DOS PRODUTOS====================\n");
    while (i < QTD_PRODUTOS) {
        printf("\n=========PRECO DO PRODUTO %i=========\n", i+1);
        printf("Preco do produto %i R$: %.2f \n", i+1, produtos[i]);
        i++;
    }

    i = 0;
    printf("\n====================PRODUTOS COM PRECO MENOR QUE R$ 60.00====================\n");
    while (i < QTD_PRODUTOS) {
        if (produtos[i] < 60) {
            printf("\n=========PRECO DO PRODUTO %i=========\n", i+1);
            printf("Preco do produto %i R$: %.2f", i+1, produtos[i]);
        }
        i++;
    }
}