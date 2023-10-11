#include<stdio.h>

void main()
{
    int size;
    int i;

    printf("Enter the size-> ");
    scanf("%d", &size);

    int arr[size];

    printf("\nEnter the %d array elements\n", size);

    for(i = 0; i < size; i++) 
    {
        scanf("%d", &arr[i]);
    }
    // display
    for(i = 0; i < size; i++)
        printf("%5d", arr[i]);

    printf("\n\n");

    int pos;
    printf("Enter the position that you want to delete-> ");
    scanf("%d", &pos);

    for(i = pos; i < size; i++)
        arr[i] = arr[i+1];
    
    size -= 1;

    // display
    for(i = 0; i < size; i++)
        printf("%5d", arr[i]);
}