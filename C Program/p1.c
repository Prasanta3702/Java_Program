#include <stdio.h>
int factorial(int x)
{
    int fact = 1, i;
    for (i = 1; i <= x; i++)
    {
        fact = fact * i;
    }
    return fact;
}
int main()
{
    int fact = 1;
    int i, n,k;
    printf("enter the number");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        scanf("%d",&k);
        fact = factorial(k);
        printf("%d  ", fact);
    }
}