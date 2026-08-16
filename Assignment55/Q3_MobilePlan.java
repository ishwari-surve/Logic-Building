/*
Q3 — Mobile Plan Recommendation

A user enters their monthly usage in terms of calls, data, and SMS. The app should recommend the cheapest suitable plan among 4 plans.

Input:
Calls (minutes)
Data (GB)
SMS count
Choose the cheapest plan that satisfies the user's usage.
If usage exceeds the selected plan's limits, add the applicable per-unit extra charges.
Output:
Recommended plan
Total cost
*/


import java.util.*;

class MobilePlan
{
    public static int CalculatePlan(int Call, int Data, int SMS)
    {
        int Plan = 0;

        if(Call <= 100 && Data <= 5 && SMS <= 100)
        {
            Plan = 1;
        }
        else if(Call <= 300 && Data <= 15 && SMS <= 300)
        {
            Plan = 2;
        }
        else if(Call <= 500 && Data <= 30 && SMS <= 500)
        {
            Plan = 3;
        }
        else
        {
            Plan = 4;
        }

        return Plan;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Call = 0;
        int Data = 0;
        int SMS = 0;
        int Ret = 0;

        System.out.println("Enter monthly call minutes :");
        Call = sobj.nextInt();

        System.out.println("Enter monthly data usage in GB :");
        Data = sobj.nextInt();

        System.out.println("Enter monthly SMS usage :");
        SMS = sobj.nextInt();

        if(Call < 0 || Data < 0 || SMS < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            Ret = CalculatePlan(Call, Data, SMS);

            if(Ret == 1)
            {
                System.out.println("Recommended Plan: Basic");
            }
            else if(Ret == 2)
            {
                System.out.println("Recommended Plan: Standard");
            }
            else if(Ret == 3)
            {
                System.out.println("Recommended Plan: Premium");
            }
            else
            {
                System.out.println("Recommended Plan: Unlimited");
            }
        }
    }
}
