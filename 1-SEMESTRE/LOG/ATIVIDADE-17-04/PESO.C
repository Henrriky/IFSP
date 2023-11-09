#include <stdio.h> 

#include <stdio.h> 
int main() {
    int PESO, PESO_GRAMAS;
    float NOVO_PESO_15;
    printf("Digite o seu peso em KG: ");
    scanf("%i", &PESO);
    PESO_GRAMAS = PESO * 1000;
    printf("Seu peso em gramas e: %i Gramas \n", PESO_GRAMAS);
    NOVO_PESO_15 = PESO_GRAMAS + (PESO_GRAMAS * 0.15);
    printf("Caso voce engorde em 15 porcento seu novo peso vai ser: %2.f", NOVO_PESO_15);
    // system("PAUSE");
}
