/*
Q2 — Cinema Hall Seating

The question asks you to manage cinema hall seating using a 2D array. 
Each seat is represented by 0 for empty and 1 for booked. You need to count booked seats, 
find the row with maximum bookings, check whether any row is completely full, and display the matrix.

*/

import java.util.*;

class CinemaSeating
{
    public static int CountBooked(int Arr[][], int Rows, int Cols)
    {
        int Count = 0;

        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                if(Arr[i][j] == 1)
                {
                    Count++;
                }
            }
        }

        return Count;
    }

    public static int MaximumRow(int Arr[][], int Rows, int Cols)
    {
        int Max = 0;
        int Count = 0;
        int Row = 0;

        for(int i = 0; i < Rows; i++)
        {
            Count = 0;

            for(int j = 0; j < Cols; j++)
            {
                if(Arr[i][j] == 1)
                {
                    Count++;
                }
            }

            if(Count > Max)
            {
                Max = Count;
                Row = i;
            }
        }

        return Row;
    }

    public static boolean CheckFullRow(int Arr[][], int Rows, int Cols)
    {
        for(int i = 0; i < Rows; i++)
        {
            boolean Full = true;

            for(int j = 0; j < Cols; j++)
            {
                if(Arr[i][j] == 0)
                {
                    Full = false;
                    break;
                }
            }

            if(Full == true)
            {
                return true;
            }
        }

        return false;
    }

    public static void Display(int Arr[][], int Rows, int Cols)
    {
        System.out.println("Seat Matrix:");

        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                System.out.print(Arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Rows = 0;
        int Cols = 0;
        int Booked = 0;
        int Maximum = 0;
        boolean Full = false;

        System.out.println("Enter number of rows :");
        Rows = sobj.nextInt();

        System.out.println("Enter number of columns :");
        Cols = sobj.nextInt();

        if(Rows <= 0 || Cols <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[Rows][Cols];

        System.out.println("Enter seat matrix:");

        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] != 0 && Arr[i][j] != 1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        Booked = CountBooked(Arr, Rows, Cols);

        Maximum = MaximumRow(Arr, Rows, Cols);

        Full = CheckFullRow(Arr, Rows, Cols);

        System.out.println("Total Booked Seats: " + Booked);
        System.out.println("Row With Maximum Bookings: Row " + (Maximum + 1));

        if(Full == true)
        {
            System.out.println("Full Row Exists: Yes");
        }
        else
        {
            System.out.println("Full Row Exists: No");
        }

        Display(Arr, Rows, Cols);
    }
}
