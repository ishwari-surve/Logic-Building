/*
Q4 — Water Bill with Progressive Slabs + Late Fee

A water company calculates the bill based on the number of units consumed using progressive slabs.
A fixed meter charge is also added.

Water usage is charged using progressive slabs.
Add the fixed meter charge.
If the bill is paid late, add 2% penalty per week.
Maximum late-payment penalty is 10%.

Input:
Units consumed
Weeks late
Units and weeks late must be valid.
  
Output: Bill amount
*/

import java.util.*;

class WaterBill
{
    public static int CalculateBill(int Units, int Late)
    {
        int Bill = 0;
        int Penalty = 0;

        if(Units <= 100)
        {
            Bill = Units * 5;
        }
        else if(Units <= 300)
        {
            Bill = (100 * 5) + ((Units - 100) * 8);
        }
        else
        {
            Bill = (100 * 5) + (200 * 8) + ((Units - 300) * 10);
        }

        Bill = Bill + 100;

        if(Late == 1)
        {
            Penalty = Bill * 10 / 100;
            Bill = Bill + Penalty;
        }

        return Bill;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int Late = 0;
        int Ret = 0;

        System.out.println("Enter water consumption in units :");
        Units = sobj.nextInt();

        System.out.println("Is payment late?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Late = sobj.nextInt();

        if(Units < 0)
        {
            System.out.println("Invalid input");
        }
        else if(Late != 1 && Late != 2)
        {
            System.out.println("Invalid input");
        }
        else
        {
            Ret = CalculateBill(Units, Late);

            System.out.println("Water Bill: Rs" + Ret);
        }
    }
}
