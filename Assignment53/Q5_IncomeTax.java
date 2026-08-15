/*
Q5 — Income Tax Calculation

Calculate annual income tax using progressive tax slabs:

Up to ₹2,50,000 → 0%
₹2,50,001 to ₹5,00,000 → 5%
₹5,00,001 to ₹10,00,000 → 20%
Above ₹10,00,000 → 30%
Negative income → Invalid input.
*/

import java.util.*;

class IncomeTax
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0;
        int Tax = 0;

        System.out.println("Enter annual income :");
        Income = sobj.nextInt();

        if(Income < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            if(Income <= 250000)
            {
                Tax = 0;
            }
            else if(Income <= 500000)
            {
                Tax = (Income - 250000) * 5 / 100;
            }
            else if(Income <= 1000000)
            {
                Tax = (250000 * 5 / 100) + 
                      ((Income - 500000) * 20 / 100);
            }
            else
            {
                Tax = (250000 * 5 / 100) +
                      (500000 * 20 / 100) +
                      ((Income - 1000000) * 30 / 100);
            }

            System.out.println("Annual Income: Rs" + Income);
            System.out.println("Income Tax: Rs" + Tax);
        }
    }
}
