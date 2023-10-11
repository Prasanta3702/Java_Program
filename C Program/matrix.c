#include <stdio.h>
void main()
{
    int n;

    printf("Enter the size matrix: "); scanf("%d", &n);
    int arr[n][n];

    for(int i = 0; i < n; i++) {

        for(int j = 0; j < n; j++) {

            scanf("%d", &arr[i][j]);
        }
    }

    // input matrix
    /*
        j =  0 1 2
      i = 0 [1 3 4]
      i = 1 [0 4 0]
      i = 2 [0 0 1]
    */
   int flag = 1;
    for(int i = 1; i < n; i++) {

        for(int j = 0; j < n; j++) {

            if(j < i) {
                if(arr[i][j] != 0) {
                    flag = 0;
                }
            }
        }
    }
    if(flag == 1) {
        printf("1");
    }
    else printf("0");
}