/*
Q3 — Weekly Fitness Steps

A fitness app records the user's steps for 7 days.

-Take 7 integer values representing daily steps.
-Count how many days the user achieved the goal.
-Find the highest step count during the week.
-Steps must be ≥ 0.

Expected Output:
-Goal Achieved Days: <count>
-Maximum Steps in Week: <value>
*/
import java.util.*;

class FitnessSteps
{
    public static int CountGoalDays(int Arr[])
    {
        int iCount = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 10000)
            {
                iCount++;
            }
        }

        return iCount;
    }

    public static int FindMaximum(int Arr[])
    {
        int Max = Arr[0];

        for(int i = 1; i < Arr.length; i++)
        {
            if(Arr[i] > Max)
            {
                Max = Arr[i];
            }
        }

        return Max;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[7];
        int Goal = 0;
        int Maximum = 0;

        System.out.println("Enter steps for 7 days :");

        for(int i = 0; i < 7; i++)
        {
            Arr[i] = sobj.nextInt();

            if(Arr[i] < 0)
            {
                System.out.println("Invalid input");
                return;
            }
        }

        Goal = CountGoalDays(Arr);
        Maximum = FindMaximum(Arr);

        System.out.println("Goal Achieved Days: " + Goal);
        System.out.println("Maximum Steps in Week: " + Maximum);
    }
}
