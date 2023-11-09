#include <stdio.h>

int main () {

    struct livro {
        char TITULO[40];
        int ANO_EDICAO;
        int NUMERO_PAGINAS;
        float PRECO;
    };

    struct livro livro_mais_barato;
    float media_paginas = 0;
    int i;
    const int NUMERO_LIVROS = 4;
    struct livro livros[NUMERO_LIVROS];

    for (i = 0; i < NUMERO_LIVROS; i++) {
        fflush(stdin);
        printf("\n====================LIVRO %i====================\n", i+1);
        printf("Digite o titulo do livro %i: ", i+1);
        gets(livros[i].TITULO);
        fflush(stdin);
        printf("Digite o ano de edicao do livro %i: ", i+1);
        scanf("%i", &livros[i].ANO_EDICAO);
        printf("Digite o numero de paginas do livro %i: ", i+1);
        scanf("%i", &livros[i].NUMERO_PAGINAS);
        printf("Digite o preco do livro %i: ", i+1);
        scanf("%f", &livros[i].PRECO);

        media_paginas += livros[i].NUMERO_PAGINAS;
    }

    media_paginas = media_paginas/NUMERO_LIVROS;
    
    for (i = 0; i < NUMERO_LIVROS; i++) {

        printf("\n====================INFORMACOES LIVRO %i====================", i+1);

        printf("\nTitulo do livro %i eh: %s", i, livros[i].TITULO);
        printf("\nAno de edicao do livro %i eh: %i", i, livros[i].ANO_EDICAO);
        printf("\nNumero de paginas do livro %i eh: %i", i, livros[i].NUMERO_PAGINAS);
        printf("\nPreco do livro %i eh: %.2f\n", i, livros[i].PRECO);
        
        if (i == 0) {
            livro_mais_barato = livros[i];
        } else {
            if (livros[i].PRECO < livro_mais_barato.PRECO) {
                livro_mais_barato = livros[i];
            }
        }
    }

    printf("\n====================MEDIA E LIVRO MAIS BARATO====================\n");
    printf("Media do numero de paginas dos livros: %.2f\n", media_paginas);
    printf("Titulo do livro mais barato: %s \n", livro_mais_barato.TITULO);
    printf("Preco do livro mais barato: %.2f", livro_mais_barato.PRECO);

}