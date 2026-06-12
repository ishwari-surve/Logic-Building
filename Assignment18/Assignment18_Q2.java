class Logic
{
    void printEvenNumbers(int n)
    {
        
        int i = 0;

        for(i = 2; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");   
            }
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}
