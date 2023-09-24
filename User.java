import java.util.*;

public class User {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt(); // error sc.
        String names[] = new String[size]; // error []

        System.out.println("Enter the names");

        for(int i=0;i<size;i++)
        {
            names[i]= sc.next();
        }
        for(int i=0; i<names.length;i++)
        {
            System.out.println("Name" + (i+1) +"is" + names[i]);
        }

    }
}
