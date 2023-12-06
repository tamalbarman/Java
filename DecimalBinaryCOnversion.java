import java.util.*;

/*Write 2 functions => decimalToBinary() & binaryToDecimal() to convert
a number from one number system to another.  */

public class DecimalBinaryCOnversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();

        System.out.println("Binaray Representation: "+ decimalToBinary(number));
        System.out.println("Decimal Representation: "+ binaryToDecimal(decimalToBinary(number)));
        sc.close();
    }
    public static String decimalToBinary(int number){
        return Integer.toBinaryString(number);
    }
    public static int binaryToDecimal(String binary){
        return Integer.parseInt(binary,2);
    }
}
