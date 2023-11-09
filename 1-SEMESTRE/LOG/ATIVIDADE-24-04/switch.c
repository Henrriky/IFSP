#include <stdio.h>
// #include <conio.h>
#include <locale.h>

int main() {
    // setLocale(LC_ALL, "Portuguese");
    char SEXO;
    printf("Informe o seu SEXO: ");
    scanf("%c", &SEXO);
    switch(SEXO){
        case 'M':
            printf("Masculino");
            break;
        case 'm':
            printf("Masculino");
            break;
        case 'F':
            printf("Feminino");
            break;
        case 'f': 
            printf("Feminino");
            break;
        default:
            printf("Sexo inválido");
    }
}

/*
SEXO: Caractere

Escreva("Informe o sexo: ")
Leia (SEXO)

Escolha(SEXO)
    Caso "M"
        Escreva("Masculino")
outrocaso
    Escreva("Sexo inválido")
*/