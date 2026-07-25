// Program 4
// Input : 6
// Output : A B C D E F

#include<stdio.h>

void Display(int iNo)
{
    if(iNo >= 1)
    {
        Display(iNo - 1);
        printf("%c\t", 'A' + iNo - 1);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}
