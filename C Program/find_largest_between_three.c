#include<stdio.h>
void main() 
{
    int num1, num2, num3, big;

    printf("Enter the num1: ");
    scanf("%d", &num1);

    printf("Enter the num2: ");
    scanf("%d", &num2);

    printf("Enter the num3: ");
    scanf("%d", &num3);

    if(num1 > num2 && num1 > num3) {
        big = num1;
    }
    else {
        if(num2 > num3 && num2 > num1) {
            big = num2;
        }
        else {
            big = num3;
        }
    }

    printf("Biggest number is: %d", big);
}