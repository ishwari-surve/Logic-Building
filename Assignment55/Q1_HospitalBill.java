/*
Hospital Bill Calculation - Q1

-Consultation + medicine + room charges
-Normal/ICU ward
-Insurance calculation
-Final payable amount
*/
import java.util.*;

class HospitalBill
{
    public static int CalculateBill(int Consultation, int Medicine,int Room, int Days, int Insurance)
    {
        int Bill = 0;
        int RoomCharge = 0;
        int InsuranceAmount = 0;

        Bill = Consultation + Medicine;

        if(Room == 1)
        {
            RoomCharge = 2000 * Days;
        }
        else
        {
            RoomCharge = 5000 * Days;
        }

        Bill = Bill + RoomCharge;

        InsuranceAmount = Bill * Insurance / 100;

        Bill = Bill - InsuranceAmount;

        return Bill;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Consultation = 0;
        int Medicine = 0;
        int Room = 0;
        int Days = 0;
        int Insurance = 0;
        int Ret = 0;

        System.out.println("Enter consultation charge :");
        Consultation = sobj.nextInt();

        System.out.println("Enter medicine charge :");
         Medicine = sobj.nextInt();

        System.out.println("Enter ward type :");
        System.out.println("1. Normal");
        System.out.println("2. ICU");
        Room = sobj.nextInt();

        System.out.println("Enter number of days :");
        Days = sobj.nextInt();

        System.out.println("Enter insurance percentage :");
        Insurance = sobj.nextInt();

        if(Consultation < 0 || Medicine < 0 ||Days <= 0 || Insurance < 0 || Insurance > 100)
        {
            System.out.println("Invalid input");
        }
        else if(Room != 1 && Room != 2)
        {
            System.out.println("Invalid input");
        }
        else
        {
            Ret = CalculateBill(Consultation, Medicine,
                                 Room, Days, Insurance);

            System.out.println("Final Payable Amount: Rs" + Ret);
        }
    }
}
