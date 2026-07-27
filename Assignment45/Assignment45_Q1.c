// Display Pattern Using Recursion
#include<stdio.h>

void Display(int iNo)
{
    if(iNo != 0)
    {
        printf("%d\t*\t",iNo);
        Display(iNo - 1);
    }

}
int main()
{
    int iValue = 0;
    
    printf("Enter number :");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;
}
