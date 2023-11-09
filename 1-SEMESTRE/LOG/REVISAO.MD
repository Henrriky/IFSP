# DIAGRAMA


- INICIO
    - |N1, N2, N3, N100|

**Com vetor**
    - |VETOR[100], INDICE|
    - |INDICE <- 1, 100, 1|
**Em portugol**
    VETOR1: VETOR[1..10] DE INTEIRO
    INDICE: INTEIRO

    PARA INDICE DE 1 ATE 10 PASSO 1 FACA
        Escreva(INDICE, "º VALOR: ")
        Leia(VETOR1[INDICE])
    FIMPARA
    //OU

    ENQUANTO INDICE <= 10 FACA
        Escreva(INDICE:2, "VALOR: ")
        Leia(VETOR1[INDICE])
        INDICE <- INDICE+1
    FIMENQUANTO
**Em C**

    ```c
        int VETOR[100], INDICE;
        for (indice = 0; indice < 10; indice++) {
            printf("%.2d valor: ", indice);
            scanf("%d", &indice);
        }
    ```

# BIBLIOTECAS

```c
    #include <stdio.h> 
    /*
    - printf()
    - scanf()
        - Caso seja char nome[100];
            - Usa-se scanf("%s", &nome)
            - Usa-se printf("%s", nome)
        - Caso seja char sexo
            - Usa-se scanf("%c", &sexo)
            - Usa-se printf("%c", sexo)
    - fgets(string, tamanhoMaximo, sttdin);
    - gets(string);
    - puts(string) //Escreve a string na tela
    /*

    #include <string.h> 
    //strlen() Retorna o comprimento da string
    //strcpy(stringDestino, stringOrigem) Copia a string de origem para a de destino
    //strcmp(string1, string2) Compara a primeira string coma segunda
        /*
        - Retorna numero negativo se a string 1 for menor que a string 2
        - Retorna numero positivo se a string 1 for maior que a string 2
        - Retorna 0 se a string 1 for igual a string 2
        */
    #include <conio.h>
    /*
    - clrsrc() //Limpa a tela do console

    
    */

```
# ALGUNS CÓDIGOS

- Receber nome de 4 alunos e suas 5 notas
```c
    char nomes[4][30];
    float notas[4][5];
    int i;

    for (i = 0; i < 4; i++) {
        printf("Digite o nome do aluno %i: ", i);
        fflus(stdin);
        fgets(nomes[i], 30, stdin);
        for (j = 0; j < 5; j++) {   
            printf("Digite a nota do aluno %i: ", i);
            scanf("%f", &notas[i][j]);
        }
    }
```

**Struct em portugol**

```portugol
    Tipo
        CAD_ALUNO = REGISTRO
            nome: caractere
            turma: inteiro
            sala: inteiro
            notas: VETOR[1..4] DE INTEIRO
        FIM_REGISTRO
    VAR
        ALUNO: CAD_ALUNO;
        I: INTEIRO;
    INICIO
        LEIA(CAD_ALUNO.NOME);
        LEIA(CAD_ALUNO.TURMA);
        LEIA(CAD_ALUNO.SALA);
        PARA I DE 1 ATE 4 PASSO 1 FACA 
            LEIA(CAD_ALUNO.NOTAS[I]);
        FIM_PARA
```

```c
    //Tipo
    struct CAD_ALUNO {
        char nome[40];
        int turma;
        int sala;
        float notas[4];
    };

    //Var
    struct CAD_ALUNO aluno;
    fgets(alunos.nome, 40, stdin);
    scanf("%d", &alunos.turma);
    scanf("%d", &alunos.sala);
    for (int i = 0; i < 4; i++) {
        scanf("%f", &alunos.notas[i]);
    }
    getch();

```
