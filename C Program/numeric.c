#include<stdio.h>
void main() {
    
    for(int i = 10; i <= 20; i++) {
        for(int j = 0; j < 10; j++) {
            printf("%d\t", i);
        }
        printf("\n");
        for(int j = 0; j < 10; j++) {
            printf("%d\t", j+1);
        }
        printf("\n");
        for(int j = 0; j < 20; j++) {
            printf("----");
        }
        printf("\n");
        for(int j = 1; j <= 10; j++) {
            printf("%d\t", (i*j));
        }
        
        printf("\n\n\n\n\n\n");
    }
}