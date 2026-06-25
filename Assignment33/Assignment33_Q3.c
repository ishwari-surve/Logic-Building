#include<stdio.h>

int FirstChar(char *str, char ch)
{
    int ipos = 0;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            return ipos;
        }

        ipos++;
        str++;
    }

    return -1;
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

    iRet = FirstChar(arr,cValue);

    printf("Character location is %d\n",iRet);

    return 0;
}
