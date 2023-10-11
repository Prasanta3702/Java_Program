#include<stdio.h>
#include<stdlib.h>

void main()
{
    int *ptr;
    int n;

    printf("Enter the size of array: ");
    scanf("%d", &n);

    ptr = (int *) malloc (n*sizeof(int));
    if(ptr == NULL)
    {
        printf("No memory are avilable");
        return;
    }

    for(int i = 0; i < n; i++)
    {
        printf("Enter value %d: ", (i+1));
        scanf("%d", (ptr * i + sizeof(int)));
    }
    printf("\n\nArray is: ");
    for(int i = 0; i < n; i++) {
        printf("%d ", ptr[i]);
    }
}