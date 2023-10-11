#include<stdio.h>
void partition(int[], int);
void main()
{
    int size;
    
    printf("Input...\n");

    scanf("%d", &size);

    // checking the size of array is compatible or not
    if(size >= 4) 
    {

    }
    else {
        printf("Size is not compatable");
        return;
    }

    int arr[size];

    for(int i = 0; i < size; i++) 
    {
        scanf("%d", &arr[i]);
    }

    partition(arr, size);
}
void partition(int arr[], int size) {

    int index=-1;

    // display the array
    for(int i = 0; i < size; i++) {
        printf("%5d", arr[i]);
    }

    printf("\n\n");
    printf("Partition indexes are: ");

    for(int i = 0; i < size; i++) {
        if(i!=0) {
            if(i % 4== 0) {
                index = i;
                
            }
        }
    }
}