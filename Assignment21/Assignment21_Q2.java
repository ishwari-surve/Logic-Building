class Logic
{
    void countEvenOddRange(int n)
    {
        int i          = 0;
        int iEvenCount = 0;
        int iOddCount  = 0;

        for(i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                iEvenCount++;       // number is even → increase even count
            }
            else
            {
                iOddCount++;        // number is odd  → increase odd count
            }
        }

        System.out.println("Even count = " + iEvenCount);
        System.out.println("Odd  count = " + iOddCount);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}
