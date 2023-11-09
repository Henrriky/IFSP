#include <stdio.h>

int main() {

    int A[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int B[10] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int C[20];
    int i;
    int j = 0;  

    for (i = 0; i < 20; i += 2) {
        C[i]    = A[j];
        C[i+1]  = B[j];
        j += 1;
    }

    for (i = 0; i < 20; i++) {
        printf("\nC[%i] = %i", i, C[i]);
    }

}
