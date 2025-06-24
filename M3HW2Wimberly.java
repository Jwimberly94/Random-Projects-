/*
 * Wimberly Joshua 
 * M3HW2
 * 6/11/2025
 */

import java.util.Scanner;
public class M3HW2Wimberly {

    public static void main(String[] args) 
    {
       // variables
       // declare real num1, num2, num3, average
       //java code
        double num1, num2, num3, average;
       //declare the keyboard variable to 
       //get input from the keyboard
       //java code
        Scanner keyboard = new Scanner(System.in);
       //input
       //display "Enter number one: "
       //input num1
       //display "Enter number two: "
       //input num2
       //display "Enter number three: "
       //input num3
         System.out.print("Enter number one: ");
         num1 = keyboard.nextDouble();
         System.out.print("Enter number two: ");
         num2 = keyboard.nextDouble();
         System.out.print("Enter number three: "); 
         num3 = keyboard.nextDouble();
        // calculations 
        //set average = num1 + num2 + num3
        //java code
         average = (num1 + num2 + num3) / 3;
        //output
        //display "The average is ", + average
        //java code
         System.out.println("The average is " + average); 
         // do not worry about how the average looks
    }
}