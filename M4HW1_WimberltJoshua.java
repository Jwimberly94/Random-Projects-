// Wimberly Joshua 
// 6/23/2025
// M4HW1

import java.util.Scanner;
public class M4HW1_WimberltJoshua 
{
public static void main(String[] args) 
{
   Scanner input = new Scanner(System.in);
   
   final double WIDGET_PRICE = 4.79;
   double baseSalary = 2000.00;

   System.out.print("Enter Sales Person's Name: ");
   String name = input.nextLine();
   System.out.print("Enter Widget Sales: ");
   double widgetSales = input.nextDouble();
   System.out.print("Enter Widgets Returned: ");
   double widgetsReturned = input.nextDouble();

   double netWidgetsSold = widgetSales - widgetsReturned;
   double widgetSalesAmount = netWidgetsSold * WIDGET_PRICE;

   double commissionRate;
   if (netWidgetsSold <= 100) {
       commissionRate = 0.10;
   } else if (netWidgetsSold <= 199) {
       commissionRate = 0.15;
   } else if (netWidgetsSold <= 299) {
       commissionRate = 0.20;
   } else {
       commissionRate = 0.25;
   }

   double commissionAmount = widgetSalesAmount * commissionRate;
   double monthlySalary = commissionAmount + baseSalary;

   System.out.println("Sales Person: " + name );
   System.out.println("Net Widgets Sold: " + netWidgetsSold);
   System.out.println("Widget Sales Amount: " + widgetSalesAmount);
   System.out.println("Commission Amount: " + commissionAmount);
   System.out.println("Monthly Salary: " + monthlySalary);
}
}