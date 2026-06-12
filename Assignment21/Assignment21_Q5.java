class Logic
{
    void printDivisibleBy2and3(int n)
    {
        int i = 0;

        System.out.print("Numbers divisible by 2 and 3 : ");

        for(i = 1; i <= n; i++)
        {
            if(i % 2 == 0 && i % 3 == 0)
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
        obj.printDivisibleBy2and3(30);
    }
}
