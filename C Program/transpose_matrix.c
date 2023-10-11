#include<stdio.h>
void main()
{
    int row, col;

    printf("Enter the row size: ");
    scanf("%d", &row);
    printf("Enter the column size: ");
    scanf("%d", &col);

    int arr[row][col];
    int temp[col][row];

    printf("Enter the matrix: (%d x %d)\n", row, col);

    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            scanf("%d", &arr[i][j]);
        }
    }

    // display
    printf("\n\nMatrix is: \n");
    for(int i = 0; i < row; i++) 
    {
        for(int j = 0; j < col; j++)
        {
            printf("%d\t", arr[i][j]);
        }
        printf("\n\n");
    }

    // transpose matrix
    
    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            temp[j][i] = arr[i][j];
        }
    }

    printf("\n\nTranspose matrix is: \n");

    for(int i= 0; i < col; i++) {
        for(int j = 0; j < row; j++) {
            printf("%d\t", temp[i][j]);
        }
        printf("\n\n");
    }
}