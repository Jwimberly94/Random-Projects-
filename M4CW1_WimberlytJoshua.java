// Wimberly Joshua
// M4CW1
// 6/22/2025




import java.util.Scanner;

public class M4CW1_WimberlytJoshua 
{
    public static void main(String[] args) 
    {
        int majors;
        int nonmajors;
        double total;
        double percentMajors;
        double percentNonMajors;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students majoring in CS: ");
        majors = input.nextInt();
        System.out.print("Enter the number of non-computer science students: ");
        nonmajors = input.nextInt();

        total = majors + nonmajors;
        percentMajors = (majors / total) * 100;
        percentNonMajors = (nonmajors / total) * 100;

        System.out.println("Majors: " + percentMajors + "%");
        System.out.println("Non-Majors: " + percentNonMajors + "%");
    }
}