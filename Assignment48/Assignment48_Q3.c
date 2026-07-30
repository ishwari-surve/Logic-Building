// QUESTION 3: Accept file name and read all data from file and display contents
#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

void DisplayFile(char *Filename)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, fd = 0;

    fd = open(Filename, O_RDONLY);

    if(fd == -1)
    {
        return;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) > 0)
    {
        write(1,Buffer,iRet);
        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);
}

int main()
{
    char Fname[20] = {'\0'};

    printf("Enter  Filename :\n");
    scanf("%[^'\n']s", Fname);

    printf("Display all data of file :\n");
    DisplayFile(Fname);

    return 0;
}
