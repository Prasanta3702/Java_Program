#include<stdio.h>
#define capacity 5

// stack define
int stack[capacity];
int top = -1;
int length;

int Size()
{
    return top + 1;
}
void push(int data) 
{
    if(Size() == capacity) 
    {
        printf("--Stack is overflow.\n");
    }
    else
    {
        stack[++top] = data;
        length++;

        printf("--%d Insert\n", data);
    }
}
int pop() 
{
    if(top < 0)
    {
        printf("--Stack is Underflow.\n");
        return -1;
    }
    else 
    {
        int data = stack[top--];
        length--;
        return data;
    }
}
int peek()
{
    if(top < 0)
    {
        printf("--Stack is empty.\n");
        return -1;
    }
    else 
    {
        return stack[top];
    }
}
void toString() 
{
    if(top < 0) 
    {
        printf("--Stack is empty.\n");
    }
    else 
    {
        printf("Stack: ");
        for(int i = 0; i < length; i++) 
        {
            printf("%5d", stack[i]);
        }
        printf("\n");
    }
}
int isEmpty() {
    if(top < 0) {
        return -1;
    }
    else {
        return 1;
    }
}

void main() 
{
    printf("========== Stack ==========\n");
    for(int i = 0; i < 6; i++)
    {
        push(i+10);
    }

    toString();
    printf("Peek item is: %d\n", peek());

    for(int i = 0; i < 5; i++) {
        printf("Pop = %d\n", pop());
    }

    printf("\n");
    
    if(isEmpty())
    {
        printf("--Stack is empty");
    }
    else 
    {
        printf("Stack is not empty");
    }
}