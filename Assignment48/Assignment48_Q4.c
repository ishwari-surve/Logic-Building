#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024
#define ERR_OPEN -1

int DisplayFileSize(char Fname[])
{
    int fd = 0 , iRet = 0;
    int iSize = 0;
    char Buffer[BUFFER_SIZE] = {'\0'};

    fd = open(Fname, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open the file\n");
        return ERR_OPEN;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) > 0)
    {
        iSize = iSize + iRet;
        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);
    return iSize;
}

int main()
{
    char FileName[20] = {'\0'};
    int iRet = 0;

    printf("Enter File Name: ");
    scanf("%[^'\n']s", FileName);

    iRet = DisplayFileSize(FileName);

    if(iRet != ERR_OPEN)
    {
        printf("File size is %d bytes\n", iRet);
    }

    return 0;
}
