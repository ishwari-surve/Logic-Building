#include<stdio.h>

int WhiteSpace(char *str)
{
    static int iCnt = 0;

    if(*str != '\0')
    {
        if(*str == ' ')   
        {
            iCnt++;
        }

        WhiteSpace(str + 1);
    }

    return iCnt;
}

int main()
{
    char Arr[50];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^'\n']s",Arr);

    iRet = WhiteSpace(Arr);

    printf("White spaces are : %d\n",iRet);

    return 0;
}

