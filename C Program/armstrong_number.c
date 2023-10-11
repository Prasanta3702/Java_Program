#include<stdio.h>
void main() 
{
    int num, digit=0, n, rem, fact, res = 0;

    printf("Enter the number: ");
    scanf("%d", &num);

    // copy the number into n
    n = num;

    // calculate the digit
    while(n > 0) 
    {
        n /= 10;
        digit++;
    }
    n = num;

    // calculate armstrong
    while(n > 0) 
    {
        rem = n % 10;
        fact = 1;       // all time is reset 1
        for(int i = 1; i <= digit; i++) {
            fact *= rem;
        }
        res += fact;
        n /= 10;
    }

    if(res == num) 
    {
        printf("Armstrong number");
    }
    else 
    {
        printf("Not Armstrong number");
    }
}