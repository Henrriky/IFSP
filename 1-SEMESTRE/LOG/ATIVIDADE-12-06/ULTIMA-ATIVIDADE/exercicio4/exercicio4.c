
#include <stdio.h>

int main () {

    int A[12];
    int B[12];
    int C[24];
    int variavelControle = 0;
    int i;
    int j = 0;
    int k = 0;

    //Verifica se o número é divisivel por 3 ou 7
    for (i = 0; i < 12; i++)  {
        variavelControle = 0;
        printf("Digite o %i valor: ", i+1);
        scanf("%i", &A[i]);
        
        while (variavelControle == 0) {
            if (A[i] % 3 != 0 && A[i] % 7 != 0) {
                printf("============ERRO===========");
                printf("\nO valor inserido deve ser um numero divisivel por 3 ou 7 \nTente novamente digitar o %i valor: ", i+1);
                scanf("%i", &A[i]);
                variavelControle = 0;
            } else {
                variavelControle = 1;
            }
        }
    }

    //Verifica se o número é múltiplo de 5    
    for (i = 0; i < 12; i++)  {
        if (A[i] % 5 != 0) {
            B[i] = A[i];
        } else {
            B[i] = 0;
        }
    }

    //Junta os dois vetores
    for (i = 0; i < 24; i++) {
        if (i < 12) {
            C[i] = A[j];
            j++;
        }
        else if (i >= 12) {
            C[i] = B[k];
            k++;
        }
    }
    
    //Exibe vetor A
    printf("\nVetor A = [");
    for (i = 0; i < 12; i++) {
        printf(", %i ", A[i]);
    }
    printf("]");

    //Exibe vetor B
    printf("\nVetor B = [");
    for (i = 0; i < 12; i++) {
        printf(", %i ", B[i]);
    }
    printf("]");
    
    //Exibe vetor C
    printf("\nVetor C = [");
    for (i = 0; i < 24; i++) {
        printf(", %i ", C[i]);
    }
    printf("]");

}