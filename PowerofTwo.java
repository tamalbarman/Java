import java.util.*;

//Write a program to find if a number is a power of 2 or not.

public class PowerofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entetr a Number: ");
        int number = sc.nextInt();

        if((number & (number - 1)) == 0){
            System.out.println(number + " is a power of 2");
        }
        else{
            System.out.println(number + " is not a power of 2");
        }
        sc.close();
    }
}
