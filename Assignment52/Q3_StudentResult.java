/*
Question 3 — Student Result
Student Result Calculator

A university wants to generate student results automatically.

Each student has marks in five subjects, each out of 100. The result should clearly show whether 
the student failed in any subject and, if passed, the final classification based on average marks.

If marks in any subject < 35 → student is Fail
Otherwise calculate the average and classify:
-Average>= 75 → Distinction
-Average>= 60 → First Class
-Average>= 50 → Second Class
-Average< 50  → Pass
*/

import java.util.*;

class Q3_StudentResult
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int No1 = 0;
        int No2 = 0;
        int No3 = 0;
        int No4 = 0;
        int No5 = 0;

        int Total = 0;
        double Average = 0.0;

        System.out.println("Enter marks of 5 subjects :");

        No1 = sobj.nextInt();
        No2 = sobj.nextInt();
        No3 = sobj.nextInt();
        No4 = sobj.nextInt();
        No5 = sobj.nextInt();

        if(No1 < 0 || No1 > 100 ||
           No2 < 0 || No2 > 100 ||
           No3 < 0 || No3 > 100 ||
           No4 < 0 || No4 > 100 ||
           No5 < 0 || No5 > 100)
        {
            System.out.println("Invalid input");
        }
        else if(No1 < 35 || No2 < 35 || No3 < 35 ||
                No4 < 35 || No5 < 35)
        {
            System.out.println("Result: Fail");
        }
        else
        {
            Total = No1 + No2 + No3 + No4 + No5;

            Average = Total / 5.0;

            System.out.println("Average Marks: " + Average);

            if(Average >= 75)
            {
                System.out.println("Final Result: Distinction");
            }
            else if(Average >= 60)
            {
                System.out.println("Final Result: First Class");
            }
            else if(Average >= 50)
            {
                System.out.println("Final Result: Second Class");
            }
            else
            {
                System.out.println("Final Result: Pass");
            }
        }
    }
}
