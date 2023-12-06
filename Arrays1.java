import java.util.*;
// Take an array of names as input from the user and print them on the screen.
public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
// input
        for(int i = 0; i<size;i++){
            names[i] = sc.next(); //sc.next because of string
        }
//outpt
        for(int i = 0; i<size;i++){
            System.out.println("Name" + (i+1) + "is: " + names[i]); //(i+1) is for increment 1 2 3...
            sc.close();
        }

    }
}
