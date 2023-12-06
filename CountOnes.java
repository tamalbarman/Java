import java.util.*;

//Write a program to count the number of 1’s in a binary representation of the number.

public class CountOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();

        int count = 0;
        while(number > 0){
            count += number & 1;
            number >>= 1;
        }
        System.out.println("Number of 1's Binary Representation is: "+ count);
        sc.close();
    }
}
