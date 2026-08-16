/*
Q1: Student Performance Analysis

The question asks you to analyze student marks using a 2D matrix where rows represent students 
and columns represent subjects. You need to calculate each student's total, find 
the topper, calculate subject-wise averages, and print students who failed in any subject. 
Marks must be between 0 and 100.

*/

import java.util.*;

class StudentPerformance
{
    public static void CalculateTotals(int Arr[][], int N, int M)
    {
        int Sum = 0;

        System.out.println("Student Totals:");

        for(int i = 0; i < N; i++)
        {
            Sum = 0;

            for(int j = 0; j < M; j++)
            {
                Sum = Sum + Arr[i][j];
            }

            System.out.println("Student " + (i + 1) + ": " + Sum);
        }
    }

    public static int FindTopper(int Arr[][], int N, int M)
    {
        int Max = 0;
        int Sum = 0;
        int Topper = 0;

        for(int i = 0; i < N; i++)
        {
            Sum = 0;

            for(int j = 0; j < M; j++)
            {
                Sum = Sum + Arr[i][j];
            }

            if(Sum > Max)
            {
                Max = Sum;
                Topper = i;
            }
        }

        return Topper;
    }

    public static void CalculateAverage(int Arr[][], int N, int M)
    {
        int Sum = 0;
        double Average = 0.0;

        System.out.println("Subject Averages:");

        for(int j = 0; j < M; j++)
        {
            Sum = 0;

            for(int i = 0; i < N; i++)
            {
                Sum = Sum + Arr[i][j];
            }

            Average = (double)Sum / N;

            System.out.printf("Subject %d: %.2f\n",
                              (j + 1), Average);
        }
    }

    public static void DisplayFailedStudents(int Arr[][], int N, int M)
    {
        boolean Failed = false;

        System.out.println("Students Failed:");

        for(int i = 0; i < N; i++)
        {
            Failed = false;

            for(int j = 0; j < M; j++)
            {
                if(Arr[i][j] < 35)
                {
                    Failed = true;
                    break;
                }
            }

            if(Failed == true)
            {
                System.out.println("Student " + (i + 1));
            }
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = 0;
        int M = 0;
        int Topper = 0;

        System.out.println("Enter number of students :");
        N = sobj.nextInt();

        System.out.println("Enter number of subjects :");
        M = sobj.nextInt();

        if(N <= 0 || M <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[N][M];

        System.out.println("Enter marks:");

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] < 0 || Arr[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        CalculateTotals(Arr, N, M);

        Topper = FindTopper(Arr, N, M);

        System.out.println("Topper: Student " + (Topper + 1));

        CalculateAverage(Arr, N, M);

        DisplayFailedStudents(Arr, N, M);
    }
}
