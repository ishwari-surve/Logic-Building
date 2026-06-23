#include<stdio.h>

void Reverse(char *str)
{
    char *start = NULL;
    char *end= NULL;
    char temp = '\0';

    start = str;
    
    while(*str != '\0')
    {
        str++;
    }

    str--;
    end = str;

    while(START < END)
    {
        temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
}

int main()
{
    char arr[20];

    printf("Enter String:  ");
    scanf("%[^'\n']s",arr);

    Reverse(arr);
    printf("%s",arr);
    return 0;
}
