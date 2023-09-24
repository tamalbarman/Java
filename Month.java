/*2.	Ask the user to enter the number of the month & print the name of the month. 
For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.*/

import java.util.Scanner;

public class Month {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the month: ");
        int number = sc.nextInt();
        switch(number)
        {
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("Julay");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("Septembar");
            break;
            case 10: System.out.println("Octobar");
            break;
            case 11: System.out.println("Novembar");
            break;
            case 12: System.out.println("Decembar");
            break;
            default: System.out.println("only 12 month in a year, please enter accordingly");
        }
    }
}
