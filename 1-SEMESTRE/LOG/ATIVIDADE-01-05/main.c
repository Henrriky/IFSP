#include <stdio.h>
#include <string.h>

int main()
{
    char NOME_CLIENTE[41];
    char TIPO_CONSUMIDOR[12];
    float VALOR_CONTA = 0, CONSUMO_AGUA;

    printf("Digite o seu nome: ");
    scanf("%s", &NOME_CLIENTE);
    printf("Digite o consumo de agua em m3: ");
    scanf("%f", &CONSUMO_AGUA);
    printf("Digite qual consumidor voce e (Industrial, residencial ou comercial): ");
    scanf("%s", &TIPO_CONSUMIDOR);

    //0 == TRUE
    if(strcasecmp(TIPO_CONSUMIDOR, "RESIDENCIAL") == 0) {
        VALOR_CONTA = 5 + 0.05 * CONSUMO_AGUA;
    } else if (strcasecmp(TIPO_CONSUMIDOR, "COMERCIAL") == 0) {
        if (CONSUMO_AGUA > 80) {
            VALOR_CONTA = 500 + 0.25 * (CONSUMO_AGUA-80);
        } else {
            VALOR_CONTA = 500;
        }
    } else if (strcasecmp(TIPO_CONSUMIDOR, "INDUSTRIAL") == 0) {
        if (CONSUMO_AGUA > 100) {
            VALOR_CONTA = 500 + 0.04 * (CONSUMO_AGUA-100);
        } else {
            VALOR_CONTA = 800;
        }
    } else {
        printf("Tipo de consumidor invalido\n");
    }

    printf("NOME DO CLIENTE: %s\n", NOME_CLIENTE);
    printf("TIPO DE CONSUMIDOR: %s\n", TIPO_CONSUMIDOR);
    printf("CONSUMO DE AGUA: %.2fM3\n", CONSUMO_AGUA);
    printf( "VALOR A SER PAGO: R$ %.2f", VALOR_CONTA);

}