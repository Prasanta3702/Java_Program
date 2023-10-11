#include<stdio.h>
void main()
{
    int size, maximum, minimum;

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

    maximum = minimum = arr[0];

    for(int i = 1; i < size; i++) 
    {
        if(maximum < arr[i]) 
        {
            maximum = arr[i];
        }
        if(minimum > arr[i])
        {
            minimum = arr[i];
        }
    }

    printf("\n\nMaximum value is: %d", maximum);
    printf("\nMinimum value is: %d", minimum);
    
}