class Logic
{
    void countFactors(int num)
    {
        int i      = 0;
        int iCount = 0;

        for(i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                iCount++;       // i is a factor → increase count
            }
        }

        System.out.println("Total factors of " + num + " = " + iCount);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}
