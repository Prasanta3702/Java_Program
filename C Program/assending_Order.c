#include<stdio.h>
void main()
{
    int size, temp;

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

    printf("\n\nAfter sorting Ascending order: \n");

    for(int i = 0; i < size; i++) {

        for(int j = i+1; j < size; j++) {
            
            if(arr[i] > arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    for(int i = 0; i < size; i++) 
    {
        printf("%d\t", arr[i]);
    }
}