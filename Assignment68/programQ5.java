/*
Student data is:
 
Amit 78
Pooja 92
Rahul 85
Neha 92
Kiran 67

Create a Student class and display students according to descending marks.

If two students have equal marks, sort them alphabetically.

Expected output:
Neha 92
Pooja 92
Rahul 85
Amit 78
Kiran 67
*/
import java.util.*;

class Student
{
    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
}

class programQ5
{
    public static void main(String A[])
    {
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("Amit",78));
        list.add(new Student("Pooja",92));
        list.add(new Student("Rahul",85));
        list.add(new Student("Neha",92));
        list.add(new Student("Kiran",67));

        Collections.sort(list, new Comparator<Student>()
        {
            public int compare(Student s1, Student s2)
            {
                if(s1.marks != s2.marks)
                {
                    return s2.marks - s1.marks;
                }
                else
                {
                    return s1.name.compareTo(s2.name);
                }
            }
        });

        for(Student s : list)
        {
            System.out.println(s.name + " " + s.marks);
        }
    }
}
