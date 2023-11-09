#include <stdio.h>

int main() {

}

/*

=====================================================================================
ENQUANTO (<condicao>) faça
    instruções
FimEnquanto

I, N, R: inteiro

I <- 1

 Enquanto (I <= 5) faca
    Leia N
    R <- N * 3
    Escreva(R);
    I <- I + 1
 FimEnquanto
FimAlgporitmo

=====================================================================================
Ex: Faça um algoritmo que leia, enquanto o usuário desejar, multiplique-os por três e exiba-os:
N, R: inteiro
RESP: caractere

RESP <- ‘S’

 Enquanto (RESP = ‘S’ ou RESP = ‘s’) faca
    Leia N;
    R <- N * 3;
    Escreva(R);
    Escreva(“Deseja Continuar?”);
    Leia(RESP)
FimEnquanto

FimAlgoritmo

=====================================================================================
Ex.: Faça um algoritmo que escreva os valores pares existentes de 1 a 100:

CONT : inteiro
CONT <- 1

 Enquanto (CONT <= 100) faca
    Se (CONT mod 2 = 0) entao
        Escreva CONT, “eh par”
    Fimse
    CONT <- CONT + 1
 Fimenquanto
FimAlgoritmo

=====================================================================================
Ex: Faça um algoritmo que calcule o fatorial de um número N.
FAT, CONT, N: inteiro
RESP: caractere
RESP <- ‘S’

 Enquanto (RESP = ‘S’ ou RESP = ‘s’) faça
    FAT <- 1
    CONT <- 1
    Escreva(“Informe o nº para calcular: ”)
    Leia(N)
    Enquanto (CONT <= N) faça
        FAT ç FAT * CONT
        CONT ç CONT + 1
    Fim_enquanto
    Escreva(“Fatorial de “, N, “ = “, FAT)
    Escreva(“Deseja Continuar?”)
    Leia(RESP)
 Fim_enquanto
=====================================================================================
Para X de 1 até 10 passo 1 faça
    Instrução
    Instrução
Fim_para


for (x=1; x<= 10; x++) {
    instrução1;
    instrução2;
}

for (VAL = 1; VAL<=1250;VAL++)
    printf(“Valor = %d”,VAL);
=====================================================================================
Ex.: mostrar todos os valores de 1 a 1250 que sejam múltiplos de 7:
VAL: inteiro
Para VAL de 1 até 1250 passo 1 faça
    Se(VAL mod 7 = 0) então
        Escreva(VAL, "É múltiplo de 7");
    Fim_se
Fim_se

for (...)
if (VAL % 7 == 0)
 printf(“....”);
=====================================================================================
RESP, N, FAT, VAL: inteiro
RESP <- 1
Enquanto (RESP = 1) faça
 FAT <- 1
 Escreva(“Numero para calculo: “);
 Leia(N)
    Para VAL de 1 até N passo 1 faça
        FAT <- FAT * VAL
    Fim_para
 Escreva(“Fatorial de “, N, “ = “, FAT)
 Escreva(“Digite [1] para continuar: “)
 Leia(RESP)
Fim_enquanto
Fim
*/