#include<stdio.h>
#include<string.h>

int Count(char s[]);

void main() {

    char s[100];

    // printf("Enter the string: ");
    scanf("%s", s);

    int res = Count(s);
    printf("%d", res);
}
int Count(char s[]) {

    int count = 0;

    for(int i = 0; i < strlen(s); ) {

        if(s[i] == s[i+1]) {
            count++;
            i+=2;
        }
        else {
            i++;
        }
    }
    return count;
}