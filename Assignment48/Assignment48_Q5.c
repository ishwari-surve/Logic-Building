// QUESTION 5: Accept file name and string from user, write string at end of file
#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

void AppendString(char *Filename, char *String)
{
    int fd = 0;

    fd = open(Filename, O_WRONLY | O_APPEND);

    if(fd == -1)
    {
        return;
    }

    write(fd, str,strlen(str));
    close(fd);
}

int main()
{
    char Fname[30] = {'\0'};
    char String[50] = {'\0'};

    printf("Enter  Filename :\n");
    scanf("%[^'\n']s", Fname);

    printf("Enter the string :\n");
    scanf("%[^'\n']s", String);

    AppendString(Fname, String);

    return 0;
}
