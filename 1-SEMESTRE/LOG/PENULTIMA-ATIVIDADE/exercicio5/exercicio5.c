#include <stdio.h>

int main () {

    //Variaveis da aplicação
    char questaoGabarito[10];
    int numeroAlunos;
    int nota = 0;

    //Variaveis de controle
    int i;
    int j;

    printf("=============ALUNOS===============\n");
    printf("Digite o numero de alunos da turma: ");
    scanf("%i", &numeroAlunos);
    char questaoCartaoResposta[numeroAlunos][10];

    printf("\n");
    printf("\n============GABARARITO DA PROVA===============\n");
    for (i = 0; i < 10; i++) {
        printf("Resposta da Questao %i: ", i+1);
        scanf(" %c", &questaoGabarito[i]);
        getchar();
    }

    printf("\n");
    printf("\n==============CARTAO DE RESPOSTA DOS ALUNOS=============\n");
    for (i = 0; i < numeroAlunos; i++) {
        for (j = 0; j < 10; j++) {
            printf("Aluno %i - Digite a resposta da questao %i: ", i+1, j+1);
            scanf(" %c", &questaoCartaoResposta[i][j]);
            getchar();
        }
        printf("-----------------------------------------------");
    }

    printf("\n");
    printf("\n==============NOTA E CARTAO RESPOSTA DOS ALUNOS=============\n");
    for (i = 0; i < numeroAlunos; i++) {
        nota = 0;
        printf("Cartao de resposta do aluno %i: [", i+1);
        for (j = 0; j < 10; j++) {
            printf("%c", questaoCartaoResposta[i][j]);
            if (questaoGabarito[j] == questaoCartaoResposta[i][j]) {
                nota += 1;
            }
        }
        printf("]\n");
        printf("Nota do aluno %i eh: %i\n", i+1, nota);
        printf("---------------------------------------");
    }


}


