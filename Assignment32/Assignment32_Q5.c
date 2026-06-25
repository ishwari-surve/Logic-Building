#include<stdio.h>

int CountWhite(char *str)
{
    int iCnt = 0;

    while(*str != '\0')
    {
        if(*str == ' ')
        {
            iCnt++;
        }

        str++;
    }

    return iCnt;
}

int main()
{
    char arr[50];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^'\n']s",arr);

    iRet = CountWhite(arr);

    printf("Number of white spaces are : %d\n",iRet);

    return 0;
}
