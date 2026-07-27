#include<stdio.h>

int Strlen(char *str)
{
    static int iCnt = 0;       

    if(*str != '\0')
    {
        iCnt++;
        Strlen(str + 1);
    }

    return iCnt;
}

int main()
{
    char Arr[20];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^'\n']s",Arr);

    iRet = Strlen(Arr);

    printf("Length is : %d\n",iRet);

    return 0;
}

