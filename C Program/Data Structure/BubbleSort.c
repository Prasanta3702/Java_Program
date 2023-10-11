#include <stdio.h>
#include<conio.h>

void main()
{
    int size;
    int i;

    printf("Enter the size-> ");
    scanf("%d", &size);

    int arr[size];

    printf("\nEnter the %d array elements\n", size);

    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    // display
    for (i = 0; i < size; i++)
        printf("%5d", arr[i]);

    printf("\n\n");

    printf("Press any key to perform bubble sort-->");
    getch();

    for (i = size; i > 1; i--)
    {
        for (int j = 0; j < size - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    //display
    for(i = 0; i < size; i++)
        printf("%5d", arr[i]);
}