#include<stdio.h>
void main()
{
    int size, low, high, mid, value, pos = -1;
    
    printf("Enter the size of array: ");
    scanf("%d", &size);

    int arr[size];

    printf("\nEnter the array value: \n");
    for(int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    // binary search

    printf("Enter the search value : ");
    scanf("%d", &value);

    low = 0;
    high = size;

    while(low <= high) 
    {
        mid = (low + high) / 2;
        if(arr[mid] == value) {
            pos = mid;
            break;
        }
        else if(value < arr[mid]) 
        {
            high = mid - 1;
        }
        else {
            low = mid + 1;
        }
    }

    printf("\n");

    if(pos == -1) {
        printf("value not found");
    }
    else {
        printf("Value found in %d position\n", pos+1);
    }
}