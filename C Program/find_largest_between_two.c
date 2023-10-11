#include<stdio.h>
void main()
{
    int num1, num2, big;

    printf("Enter the num1: ");
    scanf("%d", &num1);

    printf("Enter the num2: ");
    scanf("%d", &num2);

    big = num1 > num2 ? num1 : num2;
    
    printf("\nBiggest number is: %d", big);
}