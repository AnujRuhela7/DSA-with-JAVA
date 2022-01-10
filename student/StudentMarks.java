package student;

import java.util.Scanner;

public class StudentMarks
{
    private int rollNo;
    private int marks;
    private String name;

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sort(StudentMarks obj)
    {

    }
}
class StudentMarksMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StudentMarks[] arr = new StudentMarks[10];
        int tempM = 0;
        int tempR = 0;
        String tempN = "";
        for (int i = 0; i < 10; i++)
        {
            arr[i] = new StudentMarks();
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Student " + (i+1) + " Details : ");
            if(i>0)
            {
                sc.nextLine();
            }
            System.out.print("Name : ");
            arr[i].setName(sc.nextLine());
            System.out.print("Roll No. ");
            arr[i].setRollNo(sc.nextInt());
            System.out.print("Marks : ");
            arr[i].setMarks(sc.nextInt());
        }
        tempM = arr[0].getMarks();
        tempN = arr[0].getName();
        tempR = arr[0].getRollNo();
        for (int i = 0; i < 10; i++)
        {
            for (int j = i+1; j < 10; j++)
            {
                if (arr[i].getMarks() > arr[j].getMarks())
                {
                    tempM = arr[j].getMarks();
                    arr[j].setMarks(arr[i].getMarks());
                    arr[i].setMarks(tempM);

                    tempN = arr[j].getName();
                    arr[j].setName(arr[i].getName());
                    arr[i].setName(tempN);

                    tempR = arr[j].getRollNo();
                    arr[j].setRollNo(arr[i].getRollNo());
                    arr[i].setRollNo(tempR);
                }
            }
        }
        System.out.println("Highest Marks Student Record : ");
        System.out.println("Name : " + arr[9].getName());
        System.out.println("Roll No. " + arr[9].getRollNo());
        System.out.println("Marks : " + arr[9].getMarks());
        System.out.println("");
        System.out.println("Lowest Marks Student Record : ");
        System.out.println("Name : " + arr[0].getName());
        System.out.println("Roll No. " + arr[0].getRollNo());
        System.out.println("Marks : " + arr[0].getMarks());
    }
}