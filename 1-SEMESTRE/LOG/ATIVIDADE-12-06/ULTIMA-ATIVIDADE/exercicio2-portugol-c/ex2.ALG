Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/06/2023
Var
// Seção de Declarações das variáveis
F: VETOR[1..10] DE REAL
C: VETOR[1..10] DE REAL
I: INTEIRO

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Para I de 1 ate 10 faca
     Escreva("Digite a ", I,"º temperatura em farenheit: ")
     Leia(F[I])
     C[I] <- 5/9 * (F[I] - 32)
FimPara

Escreval("================CONVERSÃO==============")

Para I de 1 ate 10 faca
     Escreval("F[",I," ] = ", F[I], "  ====  ","C[",I," ] = ", C[I])
FimPara
     
     

Fimalgoritmo