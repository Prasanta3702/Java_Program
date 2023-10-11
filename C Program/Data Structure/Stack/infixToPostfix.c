#include<stdio.h>
#include<string.h>
#define capacity 100

// define the character arr for stack
char stack[capacity];
int top = -1;

int size() 
{
    return top+1;
}
void push(char ch)
{
    if(size() == capacity)
    {
        printf("--Stack overflow\n");
    }
    else
    {
        stack[++top] = ch;
        printf("--%c insert\n", ch);
    }
}
char pop()
{
    if(top < 0)
    {
        printf("--Stack underflow\n");
    }
    else
    {
        char ch = stack[top];
        printf("--%c pop\n", stack[top--]);
        return ch;
    }
}
int isEmpty()
{
    if(top < 0) 
        return 1;
    else
        return 0;
}
char peek()
{
    if(isEmpty())
        return (char)-1;
    else 
        return stack[top];
}
void display()
{
    if(isEmpty()) 
        printf("--Stack is empty\n");
    else
    {
        printf("Stack:");
        for(int i = 0; i <= top; i++)
        {
            printf("%5c", stack[i]);
        }
        printf("\n");
    }
}
int isOperand(char ch)
{
    if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') 
        return 1;
    else 
        return 0;
}
int Precedence(char ch)
{
    switch(ch)
    {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
    }
    return -1;
}
void infixToPostfix(char exp[]) 
{
    char output[capacity];
    int k = 0;

    for(int i = 0; i < strlen(exp); i++)
    {
        char ch = exp[i];
        if(isOperand(ch)) 
        {
            output[k++] = ch;
        }
        else if(ch == '(')
            push(ch);
        else if(ch == ')')
        {
            while(!isEmpty() && peek() != '(')
            {
                output[k++] = pop();
            }
            pop();
        }
        else 
        {
            while(!isEmpty() && Precedence(ch) <= Precedence(peek())) 
            {
                output[k++] = pop();
            }

            push(ch);
        }
    }

    while(!isEmpty())
    {
        output[k++] = pop();
    }

    printf("\nPostfix: ");
    for(int i = 0; i < k; i++)
    {
        printf("%c", output[i]);
    }
}
void main()
{
    char exp[] = "a*b-(c+d)+e";
    
    infixToPostfix(exp);
}