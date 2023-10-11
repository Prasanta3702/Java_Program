#include<stdio.h>
void main()
{
    int num, decimal = 0, rem, a= 1;

    printf("Enter the binary value : ");
    scanf("%d", &num);

    while(num > 0) 
    {
        rem = num % 10;
        decimal += rem * a;
        a *= 2;
        num /= 10;
    }
    printf("Decimal value is: %d", decimal);
}