import java.util.*;

//Write a program to toggle a bit a position = apos" in a number

public class ToggleBit {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number: ");
     int number = sc.nextInt();
     System.out.println("Enter the bit Possition: ");
     int position = sc.nextInt();
     
     int mask = 1 << position;
     int result = number ^ mask;
     System.out.println(position + " is " + result);
     sc.close();
    }
}