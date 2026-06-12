class Logic
{
    void sumEvenNumbers(int n)
    {
        int i      = 0;
        int iSum   = 0;

        for(i = 2; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                iSum = iSum + i;    // add even number to sum
            }
        }

        System.out.println("Sum of even numbers up to " + n + " = " + iSum);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}
