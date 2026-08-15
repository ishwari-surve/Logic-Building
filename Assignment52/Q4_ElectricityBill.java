/*
Assignment48 Q4: Implement progressive electricity bill calculation
Question 4 — Electricity Bill
An electricity board wants to calculate the electricity bill based on the number of units consumed.

The electricity bill uses progressive slabs:
-First 100 units       → ₹5/unit
-Next 100 units        → ₹7/unit
-Above 200 units       → ₹10/unit
-If the number of units is negative → Invalid input
*/

import java.util.*;

class Q4_ElectricityBill
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int Bill = 0;

        System.out.println("Enter units consumed :");
        Units = sobj.nextInt();

        if(Units < 0)
        {
            System.out.println("Invalid input");
        }
        else if(Units <= 100)
        {
            Bill = Units * 5;

            System.out.println("Total Units Consumed: " + Units);
            System.out.println("Total Electricity Bill: Rs" + Bill);
        }
        else if(Units <= 200)
        {
            Bill = (100 * 5) + ((Units - 100) * 7);

            System.out.println("Total Units Consumed: " + Units);
            System.out.println("Total Electricity Bill: ₹" + Bill);
        }
        else
        {
            Bill = (100 * 5) + (100 * 7) + ((Units - 200) * 10);

            System.out.println("Total Units Consumed: " + Units);
            System.out.println("Total Electricity Bill: Rs" + Bill);
        }
    }
}
