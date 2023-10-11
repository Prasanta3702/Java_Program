#include<stdio.h>
void main() 
{
    int arr[100];
    int value, i = 0, size = 0, count = 0;

    printf("Enter value...");

    do 
    {
        scanf("%d", &value);
        if(value != -1) 
        {
            arr[i] = value;
            i++;
            size++;
        }
    }
    while(value != -1);

    printf("\n\nArray is: ");
    for(int j = 0; j < size; j++) {
        printf("%5d", arr[j]);
    }

    // find the distinct value 
    for(int j = 0; j < size; j++) 
    {
        if(arr[j] != arr[j+1]) {
            count++;
        }
    }
    printf("\n\nDistinct value is: %d", count);
}