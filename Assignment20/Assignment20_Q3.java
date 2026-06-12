class Logic
{
    void checkPerfect(int num)
    {
        int i      = 0;
        int iSum   = 0;

        for(i = 1; i < num; i++)      // go from 1 to num-1 (exclude num itself)
        {
            if(num % i == 0)
            {
                iSum = iSum + i;       // add divisor to sum
            }
        }

        if(iSum == num)
        {
            System.out.println(num + " is a Perfect Number");
        }
        else
        {
            System.out.println(num + " is NOT a Perfect Number");
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}
