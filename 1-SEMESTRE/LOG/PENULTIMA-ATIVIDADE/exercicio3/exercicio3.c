
#include <stdio.h>

int main () {

    float notas[10];
    float media = 0;
    int i;

    for (i = 0; i < 10; i++) {
        printf("Digite a %i nota do aluno: ", i+1);
        scanf("%f", &notas[i]);
        media += notas[i];
    }

    media /= 10.0;

    printf("\n================SITUACAO==================");

    if (media >= 8) {
        printf("\nSua situacao eh Plenamente Satisfatorio (PS)");
    } else if (media >= 6) {
        printf("\nSua situacao eh Satisfatorio (S)");
    } else if (media >= 4) {
        printf("\nSua situacao eh Regular (R)");
    } else if (media < 4) {
        printf("\nSua situacao eh Insatisfatorio (I)");
    } else {
        printf("\nValor invalido");
    }

}