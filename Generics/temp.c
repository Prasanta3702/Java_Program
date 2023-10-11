#include<stdio.h>
void main() 
{
    int size1, size2, value, flag = -1;
    int flag2 = -1;

    // first array

    scanf("%d", &size1);
    int arr[20];

    for(int i = 0; i < size1; i++) 
    {
        scanf("%d", &arr[i]);
    }

    // second array

    scanf("%d", &size2);
    int arr2[20];

    for(int i = 0; i < size2; i++)
    {
        scanf("%d", &arr2[i]);
    }

    // sort the first array
    int temp;
    for(int i = 0; i < size1; i++) 
    {
        for(int j = i+1; j < size1; j++) 
        {
            if(arr[i] < arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    // chech the subset value
    
    for(int i = 0; i < size1; i++)
    {
        int x = arr[i];

        for(int j = 0; j < size2; j++)
        {
            if(x == arr2[j]) 
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            value = x;
            flag2 = 1;
            break;
        }
        flag = 0;
    }

    if(flag2 == 1) {
        printf("%d", value);
    }
    else {
        printf("0");
    }
}