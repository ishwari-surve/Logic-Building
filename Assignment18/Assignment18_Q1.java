class Logic
{
    void checkPrime(int num)
    {
        
        int i = 0;
        int iCount = 0;

        for(i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                iCount++;       
            }
        }

        if(iCount == 2)
        {
            System.out.println(num + " is Prime");
        }
        else
        {
            System.out.println(num + " is NOT Prime");
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}
