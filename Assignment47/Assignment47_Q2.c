// QUESTION 2: Accept file from user and count SMALL letters from that file
#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

int CountSmall(char *Filename)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, fd = 0, iCount = 0, i = 0;

    fd = open(Filename, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open the file\n");
        return 0;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) > 0)
    {
        for(i = 0; i < iRet; i++)
        {
            if((Buffer[i] >= 'a') && (Buffer[i] <= 'z'))
            {
                iCount++;
            }
        }
        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);
    return iCount;
}

int main()
{
    char Fname[30] = {'\0'};
    int iRet = 0;

    printf("Enter the Filename :\n");
    scanf("%[^'\n']s", Fname);

    iRet = CountSmall(Fname);

    printf("Number of Small letters : %d\n", iRet);

    return 0;
}
