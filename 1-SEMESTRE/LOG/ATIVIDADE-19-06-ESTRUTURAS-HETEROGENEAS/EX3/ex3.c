#include <stdio.h>
#include <string.h>

int main () {

    struct banda {
        char NOME[70];
        char TIPO_MUSICA[40];
        int NUMERO_INTEGRANTES;
        int POSICAO_RANKING;
    };


    const int NUMERO_BANDAS = 10;
    int i, j;
    struct banda bandas[NUMERO_BANDAS], aux;

    for (i = 0; i < NUMERO_BANDAS; i++) {
        printf("\n====================BANDA %i====================\n", i+1);
        fflush(stdin);
        printf("Digite o nome da banda %i: ", i+1);
        gets(bandas[i].NOME);
        fflush(stdin);
        printf("Digite o tipo de musica da banda %i: ", i+1);
        gets(bandas[i].TIPO_MUSICA);
        fflush(stdin);
        printf("Digite o numero de integrantes da banda %i: ", i+1);
        scanf("%i", &bandas[i].NUMERO_INTEGRANTES);
        printf("Digite a posicao no ranking da banda especificada: ");
        scanf("%i", &bandas[i].POSICAO_RANKING);
    }

    for (i = 0; i < NUMERO_BANDAS - 1; i++) {
        for (j = i + 1; j <= NUMERO_BANDAS - 1; j++) {
            if (strcmp (bandas[i].NOME, bandas[j].NOME) > 0) {
                aux = bandas[i];
                // printf("%s", aux.NOME);
                bandas[i] = bandas[j];
                bandas[j] = aux;
            }
        }
    }

    printf("\n====================ORDENACAO POR NOME DAS BANDAS====================\n");

    for (i = 0; i < NUMERO_BANDAS; i++) {

        printf("\n=======BANDA %s=======\n", bandas[i].NOME);

        printf("\nNome da banda %i: %s", i+1, bandas[i].NOME);
        printf("\nTipo de musica que a banda toca %i: %s", i+1, bandas[i].TIPO_MUSICA);
        printf("\nNumero de integrantes da banda %i: %i", i+1, bandas[i].NUMERO_INTEGRANTES);
        printf("\nPosicao no ranking da banda %i: %i\n", i+1, bandas[i].POSICAO_RANKING);

    }

    

}
