import java.util.Scanner;

public class MakeXZero {
    public static int minMovesToMakeXZero(int[] arr, int X) {
        int n = arr.length;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < n; right++) {
            currentSum += arr[right];

            while (currentSum > X && left <= right) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= arr[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Size of the array
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt(); // Array elements
        }

        int X = scanner.nextInt(); // Special number X

        int minMoves = minMovesToMakeXZero(arr, X);
        System.out.println(minMoves);
        scanner.close();
    }
}
