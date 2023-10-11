#include<stdio.h>
int interpolationSearch(int[], int, int, int);
void main()
{
    int size, value, index;

    printf("Enter the size of array: ");
    scanf("%d", &size);

    int arr[size];
    
    printf("Enter the array value in order :\n");

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

    printf("\nEnter the search value: ");
    scanf("%d", &value);

    index = interpolationSearch(arr, 0, size, value);
    
    if(index != -1) {
        printf("Value found in %d position", index+1);
    }
    else 
    {
        printf("Value not found");
    }
}
int interpolationSearch(int arr[], int lo, int hi, int x)
{
    int pos;
    
    if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

        pos = lo
              + (((double)(hi - lo) / (arr[hi] - arr[lo]))
                 * (x - arr[lo]));
  
      
        if (arr[pos] == x)
            return pos;
  
     
        if (arr[pos] < x)
            return interpolationSearch(arr, pos + 1, hi, x);
  
      
        if (arr[pos] > x)
            return interpolationSearch(arr, lo, pos - 1, x);
    }
    return -1;
}