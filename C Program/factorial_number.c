#include<stdio.h>
void main() 
{
    int num, fact = 1;

    printf("Enter the positive number: ");
    scanf("%d", &num);

    for(int i = 1; i <= num; i++) {
        fact = fact * i;
    }
    printf("Factorial is: %d", fact);
}