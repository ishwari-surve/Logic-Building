#include<stdio.h>
int CountChar(char *str, char ch)
{
    int iCnt = 0;
    while(*str != '\0')
    {
        if((*str == ch )||(*str == ch-32 )||(*str == ch + 32))
        {
            iCnt++;
        }

        str++;
    }
    return iCnt;
}

int main()
{
    char arr[20];
    char cValue = '\0';
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^'\n']s",arr);

    printf("Enter character : ");
    scanf(" %c",&cValue);

    iRet = CountChar(arr,cValue);

    printf("Letter found  %d\n",iRet);

    return 0;
}
