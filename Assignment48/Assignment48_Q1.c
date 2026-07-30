// QUESTION 1: Accept file name from user and open that file in read mode
#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

void OpenFile(char *Filename)
{
    int fd = 0;

    fd = open(Filename, O_RDONLY);

    if(fd == -1)
    {
        return;
    }

    printf("File opened successfully\n");
    close(fd);
}

int main()
{
    char Fname[20] = {'\0'};

    printf("Enter Filename :\n");
    scanf("%[^'\n']s", Fname);

    OpenFile(Fname);

    return 0;
}
