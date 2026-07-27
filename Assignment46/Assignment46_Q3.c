#include<stdio.h>

int Small(char *str)
{
    static int iCnt = 0;

    if(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            iCnt++;
        }

        Small(str + 1);
    }

    return iCnt;
}

int main()
{
    char Arr[50];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^'\n']s",Arr);

    iRet = Small(Arr);

    printf("Small characters are : %d\n",iRet);

    return 0;
}
