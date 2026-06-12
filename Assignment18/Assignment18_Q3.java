class Logic
{
    void printOddNumbers(int n)
    {
       
        int i = 0;

        for(i = 1; i <= n; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i + " ");   // print odd numbers
            }
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}
