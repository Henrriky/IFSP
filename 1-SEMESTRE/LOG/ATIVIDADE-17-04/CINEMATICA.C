#include <stdio.h>

int main() {
    float TEMPO_GASTO_HORA, VELOCIDADE_MEDIA, LITROS_USADOS, DISTANCIA;

    printf("Digite o tempo gasto na viagem em hora: ");
    scanf("%f", &TEMPO_GASTO_HORA);
    printf("Digite a velocidade media da viagem em KM: ");
    scanf("%f", &VELOCIDADE_MEDIA);

    DISTANCIA = TEMPO_GASTO_HORA * VELOCIDADE_MEDIA;
    LITROS_USADOS = DISTANCIA / 12;

    printf("Tempo gasto na viagem: %.2f Horas \n", TEMPO_GASTO_HORA);
    printf("Velocidade media da viagem: %.2f KM/H \n", VELOCIDADE_MEDIA);
    printf("Distancia percorrida: %.2f KM \n", DISTANCIA);
    printf("Voce gastou %.2f L de gasolina", LITROS_USADOS);

}