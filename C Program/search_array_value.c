#include<stdio.h>
void main()
{
    int size, value, pos = -1;

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

    printf("\n\nEnter the search vaue : ");
    scanf("%d", &value);

    for(int i = 0; i < size; i++) 
    {
        if(arr[i] == value) 
        {
            pos = i;
            break;
        }
    }
    if(pos==-1) 
    {
        printf("Value not found");
    }
    else 
    {
        printf("Value found in %d position", pos+1);
    }
}