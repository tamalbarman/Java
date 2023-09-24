import java.util.Scanner;

public class StarPrint {

    public static void main(String[] args) {
        int n, i, j, k;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (k = i; k <= n; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
