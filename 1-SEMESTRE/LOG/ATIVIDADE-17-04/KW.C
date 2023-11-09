#include <stdio.h>

int main() {
    float SALARIO_MIN, QTD_KW_RESIDENCIA, VALOR_REAL_POR_KW, VALOR_PAGO_RES, VALOR_PAG_ANTECIPADO, VALOR_PAG_ATRASO;


    printf("Digite o seu salario minimo: ");
    scanf("%f", &SALARIO_MIN);
    printf("Digite a quantidade quilowatt gasta na sua residencia: ");
    scanf("%f", &QTD_KW_RESIDENCIA);

    VALOR_REAL_POR_KW = 0.001 * SALARIO_MIN;
    VALOR_PAGO_RES = VALOR_REAL_POR_KW * QTD_KW_RESIDENCIA;
    VALOR_PAG_ANTECIPADO = VALOR_PAGO_RES - (VALOR_PAGO_RES * 0.08);
    VALOR_PAG_ATRASO = VALOR_PAGO_RES + (VALOR_PAGO_RES * 0.10);  

    printf("O valor em reais decada KW e R$: %.2f,00 \n", VALOR_REAL_POR_KW);
    printf("O valor a ser pago por sua residencia e: %.2f,00 \n", VALOR_PAGO_RES);
    printf("O novo valor a ser pago por essa residencia, a partir de um desconto de 8%% por pagamento antecipado e R$: %.2f,00 \n", VALOR_PAG_ANTECIPADO);
    printf("O novo valor a ser pago por essa residencia, a partir de um acréscimo de 10%% por pagamento atrasado e R$: %.2f,00 \n", VALOR_PAG_ATRASO);

}