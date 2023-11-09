#include <stdio.h>

int main () {

    const int QTD_ALUNOS = 5;
    int i = 0, QTD_ALUNOS_APROVADOS = 0, QTD_ALUNOS_IFA = 0, QTD_ALUNOS_REPROVADOS = 0;
    float alunos[QTD_ALUNOS];
    
    
    printf("\n====================MEDIA DE NOTA DOS ALUNOS====================\n");
    for (i = 0; i < QTD_ALUNOS; i++) {
        printf("Digite a media de nota do aluno %i: ", i+1);
        scanf("%f", &alunos[i]);
    }

    printf("\n====================MEDIAS DIGITADAS====================\n");
    for (i = 0; i < QTD_ALUNOS; i++) {
        printf("Media de nota do aluno %i: %.2f\n", i+1, alunos[i]);
    }

    printf("\n====================ESTATISTICA DA SALA====================\n");
    for (i = 0; i < QTD_ALUNOS; i++) {
        if (alunos[i] >= 6) {
            QTD_ALUNOS_APROVADOS++;
        } else if (alunos[i] >= 4 && alunos[i] < 6) {
            QTD_ALUNOS_IFA++;
            QTD_ALUNOS_REPROVADOS++;
        } else if (alunos[i] < 4) {
            QTD_ALUNOS_REPROVADOS++;
        }
    }

    printf("-------------APROVADOS: %i\n", QTD_ALUNOS_APROVADOS);
    printf("-------------IFA: %i\n", QTD_ALUNOS_IFA);
    printf("-------------REPROVADOS: %i\n", QTD_ALUNOS_REPROVADOS);
    printf("-------------REPROVADOS SEM IFA: %i\n", QTD_ALUNOS_REPROVADOS-QTD_ALUNOS_IFA);
}