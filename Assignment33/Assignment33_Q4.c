#include<stdio.h>

int LastChar(char *str, char ch)
{
    int ipos = 0;
    int ilast = -1;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            ilast = ipos;
        }

        ipos++;
        str++;
    }

    return ilast;
}

int main()
{
    char arr[50];
    char cValue = '\0';
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^'\n']s",arr);

    printf("Enter character : ");
    scanf(" %c",&cValue);

    iRet = LastChar(arr,cValue);

    printf("Character location is %d\n",iRet);

    return 0;
}
