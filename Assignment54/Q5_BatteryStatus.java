/*
Q5 — Battery Status
A phone OS displays the battery status based on the battery percentage.

Battery ≤ 5% → Critical
Battery ≤ 15% → Low
Otherwise → Normal
Battery percentage must be between 0 and 100

Expected Output:
-Battery Percentage: <value>%
-Status: <Critical/Low/Normal>
*/

import java.util.*;

class BatteryStatus
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Battery = 0;

        System.out.println("Enter battery percentage :");
        Battery = sobj.nextInt();

        if(Battery < 0 || Battery > 100)
        {
            System.out.println("Invalid input");
        }
        else if(Battery <= 5)
        {
            System.out.println("Battery Percentage: " + Battery + "%");
            System.out.println("Status: Critical");
        }
        else if(Battery <= 15)
        {
            System.out.println("Battery Percentage: " + Battery + "%");
            System.out.println("Status: Low");
        }
        else
        {
            System.out.println("Battery Percentage: " + Battery + "%");
            System.out.println("Status: Normal");
        }
    }
}
