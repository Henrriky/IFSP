#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
main()
{
    setlocale(LC_ALL, "Portuguese");
    char operador; //Operador recebido
    float n1, n2; //Numero1 e numero2
    printf("==Calculadora Simples==\n\n");
    printf("Valor 1: ");
    scanf("%f", &n1); //Lendo valor do num1
    printf("Valor 2: ");
    scanf("%f", &n2); //Lendo valor do num2
    printf("Operação (+,-,*,/: )"); 
    fflush(stdin); // limpa o buffer do teclado
    scanf("%c", &operador); //Le o operador inserido pelo usuário
    switch (operador) { //Escolha caso
    case '+':
        printf("%.1f + %.1f = %.1f\n", n1, n2, (n1 + n2));
        break;
    case '-':
        printf("%.1f - %.1f = %.1f\n", n1, n2, (n1 - n2));
        break;
    case '*':
        printf("%.1f * %.1f = %.1f\n", n1, n2, (n1 * n2));
        break;
    case '/':
        if (n1 != 0)
            printf("%.1f / %.1f = %.1f\n", n1, n2, (n1 / n2));
        else
            printf("ERRO!!! o divisor deve ser diferente de ZERO\n");
        break;
    default:
        printf("\nOperador invalido");
    }                               
}