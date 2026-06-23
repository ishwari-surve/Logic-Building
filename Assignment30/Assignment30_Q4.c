#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkSpecial(char ch)
{
    if((ch >= 32 && ch <= 47) ||
    (ch >= 58 && ch <= 64) ||
    (ch >= 91 && ch <= 96) ||
    (ch >= 123 && ch <= 126))
    {
        return TRUE;
    }
    return FALSE;
}
int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter the character : ");
    scanf("%c",&cValue);

    bRet = ChkSpecial(cValue);

    if(bRet == TRUE)
    {
        printf("It is special Character\n");
    }
    else
    {
        printf("It is not a special Character\n");
    }

    return 0;
}
