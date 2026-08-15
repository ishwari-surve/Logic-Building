/*
Q2 — Loan

Check personal-loan eligibility.
Age: 21–60.
Monthly income ≥ ₹25,000.
Credit score ≥ 700.
No existing unpaid loan.
Display the specific rejection reason when rejected.
*/
import java.util.*;

class LoanCheck
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int Income = 0;
        int CreditScore = 0;
        int Loan = 0;

        System.out.println("Enter age :");
        Age = sobj.nextInt();

        System.out.println("Enter monthly income :");
        Income = sobj.nextInt();

        System.out.println("Enter credit score :");
        CreditScore = sobj.nextInt();

        System.out.println("Do you have existing unpaid loan?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Loan = sobj.nextInt();

        if(Age < 0 || Income < 0 || CreditScore < 0)
        {
            System.out.println("Invalid input");
        }
        else if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected: Age must be between 21 and 60");
        }
        else if(Income < 25000)
        {
            System.out.println("Loan Rejected: Monthly income must be at least ₹25,000");
        }
        else if(CreditScore < 700)
        {
            System.out.println("Loan Rejected: Credit score must be at least 700");
        }
        else if(Loan == 1)
        {
            System.out.println("Loan Rejected: Existing unpaid loan");
        }
        else if(Loan != 2)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Loan Approved");
        }
    }
}
