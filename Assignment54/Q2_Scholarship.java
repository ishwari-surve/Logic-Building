/*
Q2 — Scholarship Eligibility

A scholarship committee checks whether a student qualifies based on academic and financial conditions.

Marks ≥ 80%
Attendance ≥ 75%
Family income ≤ ₹3,00,000
Marks and attendance must be between 0 and 100
Family income cannot be negative
*/

import java.util.*;

class Scholarship
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int Attendance = 0;
        int Income = 0;

        System.out.println("Enter marks percentage :");
        Marks = sobj.nextInt();

        System.out.println("Enter attendance percentage :");
        Attendance = sobj.nextInt();

        System.out.println("Enter family income :");
        Income = sobj.nextInt();

        if(Marks < 0 || Marks > 100 ||
           Attendance < 0 || Attendance > 100 ||
           Income < 0)
        {
            System.out.println("Invalid input");
        }
        else if(Marks < 80)
        {
            System.out.println("Scholarship Rejected: Marks must be at least 80%");
        }
        else if(Attendance < 75)
        {
            System.out.println("Scholarship Rejected: Attendance must be at least 75%");
        }
        else if(Income > 300000)
        {
            System.out.println("Scholarship Rejected: Family income is too high");
        }
        else
        {
            System.out.println("Scholarship Approved");
        }
    }
}
