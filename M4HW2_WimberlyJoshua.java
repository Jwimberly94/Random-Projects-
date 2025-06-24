// Wimberly Joshua
// M4HW2
// 6/23/2025
// this program ask the user for input to decide if they can vote or not

import java.util.Scanner;


public class M4HW2_WimberlyJoshua 
{
    public static void main(String[] args) 
    {
       System.out.println("Welcome to the Voting Eligibility Checker!");
         
       Scanner input = new Scanner(System.in);

       System.out.println("Are you a U.S. citizen? (yes/no)");
       String iscitizen = input.nextLine();
         if (iscitizen.equals("yes")) {
            System.out.println("Have you lived in the country for at least 30 days? (yes/no)");
            String hasLived = input.nextLine();
            if (hasLived.equals("yes")) {
                System.out.println("Will you be 18 years old by the general election date? (yes/no)");
                String isEighteen = input.nextLine();
                if (isEighteen.equals("yes")) {
                    System.out.println("Are you currently serving a felony or are on probation? (yes/no)");
                    String isFelon = input.nextLine();
                    if (isFelon.equals("no")) {
                        System.out.println("Congratulations! you are eligible to vote in the upcoming election.");
                    }else {
                        System.out.println("Unfortunately, you are not eligible to vote due to felony status.");

                    }
                } else {
                    System.out.println("Unfortunately, you are not eligible to vote because you will not be 18 by the general election date.");

                    }
            } else {
                System.out.println("Unfortunately, you are not eligible to vote because you have not lived in the country for at least 30 days.");

                }
            } else {
                System.out.println("Unfortunately, you are not eligible to vote because you are not a U.S. citizen.");
            }
        
         input.close();
        
    }
    
}