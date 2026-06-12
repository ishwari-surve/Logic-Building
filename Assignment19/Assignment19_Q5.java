class Logic
{
    void calculatePower(int base, int exp)
    {
        int i       = 0;
        int iResult = 1;

        for(i = 1; i <= exp; i++)
        {
            iResult = iResult * base;   
        }

        System.out.println(base + " ^ " + exp + " = " + iResult);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
    }
}
