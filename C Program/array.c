#include<stdio.h>
void main()
{
    int size;

    printf("Enter the size of array: ");
    scanf("%d", &size);

    int arr[size];
    
    printf("Enter the array value:\n");

    for(int i = 0; i < size; i++) 
    {
        printf("Array [%d]: ", i);
        scanf("%d", &arr[i]);
    }

    printf("\n\nArray is: \n");
    for(int i = 0; i < size; i++) 
    {
        printf("%d\t", arr[i]);
    }
}