// QUESTION 2: Accept file name from user and create that file
#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

void CreateFile(char *Filename)
{
    int fd = 0;

    fd = open(Filename, O_CREAT, 0777);

    if(fd == -1)
    {
        printf("Unable to create the file\n");
        return;
    }

    printf("File created successfully\n");
    close(fd);
}

int main()
{
    char Fname[20] = {'\0'};

    printf("Enter Filename :\n");
    scanf("%[^'\n']s", Fname);

    CreateFile(Fname);

    return 0;
}
