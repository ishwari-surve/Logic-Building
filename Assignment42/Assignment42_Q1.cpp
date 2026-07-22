#include<iostream>
using namespace std;

template<class T>
void Display(T value, int iSize)
{
    
    int i = 0;

    for(i = 1; i <= iSize; i++)
    {
        cout << value << " ";
    }
    cout << endl;
}

int main()
{
    Display('M', 7);
    Display(11, 3);
    Display(3.7, 6);

    return 0;
}
