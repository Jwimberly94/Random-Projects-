/*
 * Wimberly Joshua
 * M3HW1_Widgets 
 * 6/11/2025
 */
import java.util.Scanner;
public class M3HW1JSW 
{
    public static void main(String[] args)
    {
        
        int quarter1, quarter2, quarter3, quarter4, annualWidgets;
        double salesAmount, salesTax, totalAmount;

        final double WIDGET_COST = 4.79;
        final double TAX = .07;
    
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter sales for quarter one: ");
        quarter1 = keyboard.nextInt();
        System.out.print("Enter sales for quarter two: ");
        quarter2 = keyboard.nextInt();
        System.out.print("Enter sales for quarter three: ");
        quarter3 = keyboard.nextInt();
        System.out.print("Enter sales for quarter four: ");
        quarter4 = keyboard.nextInt();

        annualWidgets = quarter1 + quarter2 + quarter3 + quarter4;
        salesAmount = annualWidgets *WIDGET_COST;
        salesTax = salesAmount * TAX;
        totalAmount = salesTax + salesAmount;

        System.out.println("Annual Widgets Sold: " + annualWidgets);
        System.out.println("Widgets Sales Amount: " + salesAmount);
        System.out.println("Sales Tax Collected: " + salesTax);
        System.out.println("Total Amount: " + totalAmount);


     

    }
}