/*
A hospital receives patients with severity levels:

Rahul 2
Amit 5
Pooja 1
Neha 4

Higher severity should be treated first.

Expected order:
Amit
Neha
Rahul
Pooja

Create a Patient class containing:
String name;
int severity;
*/
import java.util.*;

class Patient
{
    String name;
    int severity;

    public Patient(String name, int severity)
    {
        this.name = name;
        this.severity = severity;
    }
}

class programQ3
{
    public static void main(String A[])
    {
        PriorityQueue<Patient> patients = new PriorityQueue<Patient>(
            new Comparator<Patient>()
            {
                public int compare(Patient p1, Patient p2)
                {
                    return p2.severity - p1.severity;
                }
            }
        );

        patients.add(new Patient("Rahul", 2));
        patients.add(new Patient("Amit", 5));
        patients.add(new Patient("Pooja", 1));
        patients.add(new Patient("Neha", 4));

        System.out.println("Treatment Order :");

        while(!patients.isEmpty())
        {
            Patient p = patients.remove();

            System.out.println(p.name + " " + p.severity);
        }
    }
}
