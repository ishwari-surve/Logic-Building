/*
Q2 — Duplicate Vote Detection

An online election system stores votes using voter IDs. Every voter can vote only once.

-Take the number of votes N
-Take N voter IDs
-If the same voter ID appears again, reject it as a duplicate
-N must be ≥ 0
-Voter IDs must be non-negative integers

Expected Output:
-Valid Votes: <count>
-Rejected Duplicate Votes: <count>
*/
import java.util.*;

class VoteCount
{
    public static int CountValidVotes(int Arr[])
    {
        int Valid = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            int j = 0;

            for(j = 0; j < i; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    break;
                }
            }

            if(j == i)
            {
                Valid++;
            }
        }

        return Valid;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = 0;
        int Valid = 0;
        int Duplicate = 0;

        System.out.println("Enter number of votes :");
        N = sobj.nextInt();

        if(N < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int Arr[] = new int[N];

            System.out.println("Enter voter IDs :");

            for(int i = 0; i < N; i++)
            {
                Arr[i] = sobj.nextInt();

                if(Arr[i] < 0)
                {
                    System.out.println("Invalid input");
                    return;
                }
            }

            Valid = CountValidVotes(Arr);

            Duplicate = N - Valid;

            System.out.println("Valid Votes: " + Valid);
            System.out.println("Rejected Duplicate Votes: " + Duplicate);
        }
    }
}
