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

    int value, pos;
    printf("\nEnter the position-> ");
    scanf("%d", &pos);
    printf("Enter the value-> ");
    scanf("%d", &value);

    printf("\n");

    for(i = size; i >= pos; i--)
        arr[i+1] = arr[i];
    
    arr[pos] = value;
    size = size + 1;

    // display
    for(i = 0; i < size; i++)
        printf("%5d", arr[i]);
}