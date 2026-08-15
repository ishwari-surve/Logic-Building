/*
Q4 — Traffic Fine Calculation

Calculate the total traffic fine based on the violations:
-No helmet → ₹500
-No license → ₹1000
-Overspeeding → ₹1500
-Multiple violations → Add all applicable fines.
-Input must be Yes/No.
*/

import java.util.*;

class TrafficFine
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Helmet = 0;
        int License = 0;
        int Speed = 0;
        int Fine = 0;

        System.out.println("Do you have helmet?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Helmet = sobj.nextInt();

        System.out.println("Do you have license?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        License = sobj.nextInt();

        System.out.println("Are you overspeeding?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Speed = sobj.nextInt();

        if(Helmet != 1 && Helmet != 2)
        {
            System.out.println("Invalid input");
        }
        else if(License != 1 && License != 2)
        {
            System.out.println("Invalid input");
        }
        else if(Speed != 1 && Speed != 2)
        {
            System.out.println("Invalid input");
        }
        else
        {
            if(Helmet == 2)
            {
                Fine = Fine + 500;
            }

            if(License == 2)
            {
                Fine = Fine + 1000;
            }

            if(Speed == 1)
            {
                Fine = Fine + 1500;
            }

            System.out.println("Total Fine: Rs" + Fine);
        }
    }
}
