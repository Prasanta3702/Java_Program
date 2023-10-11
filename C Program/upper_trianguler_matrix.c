#include<stdio.h>
void main() 
{
    int size, flag = 0;

    printf("Enter the size of matrix: ");
    scanf("%d", &size);

    int arr[size][size]; // initialize of size of matrix n x n

    // input the matrix value
    printf("Enter the array value");

    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            scanf("%d", &arr[i][j]);
        }
    }

    // display the matrix
    int pos = 0;
    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            printf("%5d", arr[i][j]);
        }
        printf("\n");
    }

    /*
        1 3 4
        0 9 3
        0 0 1
    */

    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            
        }        
        printf("\n");
    }
    
    if(flag == 0) printf("1");
    else printf("0");
}