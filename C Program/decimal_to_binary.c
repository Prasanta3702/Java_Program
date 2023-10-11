#include<stdio.h>
void main()
{
    int num, rem, binary = 0, a=1;

    printf("Enter the decimal number: ");
    scanf("%d", &num);

    while(num > 0) 
    {
        rem = num % 2;
        binary += rem * a;
        a *= 10;
        num /= 2;
    }

    printf("Binary value is: %d", binary);
}