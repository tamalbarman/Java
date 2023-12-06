import java.util.*;

public class CandyDistribution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of boys
            int[] candies = new int[n]; // Array to store candies for each boy

            // Reading the candies for each boy
            for (int i = 0; i < n; i++) {
                candies[i] = scanner.nextInt();
            }

            // Calculating the total candies and the maximum number of candies held
            long totalCandies = 0;
            int maxCandies = 0;
            for (int candy : candies) {
                totalCandies += candy;
                maxCandies = Math.max(maxCandies, candy);
            }

            // Calculating the additional candies required
            long additionalCandies = maxCandies * (long) n - totalCandies;
            
            System.out.println(additionalCandies);
            scanner.close();
        }
    }
}
