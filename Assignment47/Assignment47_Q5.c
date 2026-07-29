// QUESTION 5: Accept file and count N, display first N characters from that file
#include<stdio.h>
#include<fcntl.h>
#include<unistd.h> 
#include<string.h>

#define BUFFER_SIZE 1024

void DisplayN(char *Filename, int iSize)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, fd = 0, iCount = 0, i = 0;

    fd = open(Filename, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open the file\n");
        return;
    }

    if((iRet = read(fd, Buffer, iSize)) > 0)
    {
        for(i = 0; i < iRet; i++)
        {
            printf("%c", Buffer[i]);
        }
    }

    printf("\n");
    close(fd);
    
}

int main()
{
    char Fname[30] = {'\0'};
    int iValue = 0;

    printf("Enter the Filename :\n");
    scanf("%[^'\n']s", Fname);

    printf("Enter the number of characters :\n");
    scanf("%d", &iValue);

    printf("Display first %d characters from %s :\n", iValue, Fname);
    DisplayN(Fname, iValue);

    return 0;
}
