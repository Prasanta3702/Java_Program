#include<stdio.h>
void main() 
{
    int num, i, flag = 0;

    printf("Enter the number: ");
    scanf("%d", &num);

    for(i = 2; i <= num / i; i++) {
        if(num % i == 0) {
            flag = 1;
            break;
        }
    }
    if(!flag) {
        printf("Prime number");
    }
    else {
        printf("Not Prime number");
    }
}