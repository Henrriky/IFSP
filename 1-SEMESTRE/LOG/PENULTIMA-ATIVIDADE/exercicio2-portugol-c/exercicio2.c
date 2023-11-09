#include <stdio.h>

int main () {

    float F[2];
    float C[2];
    float conversao = 0;
    int i;


    for (i = 0; i < 2; i++) {
        printf("Digite a %i temperatura em farenheit: ", i);
        scanf("%f",&F[i]);
        C[i] = (5.0/9) * (F[i] - 32);
    }

    printf("\n================CONVERSAO==============");

    for (i = 0; i < 2; i++) {
        printf("\nF[%i] = %.1f ============= C[%i] = %.4f", i, F[i], i, C[i]);
    }

}