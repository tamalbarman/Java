import java.util.HashMap;
import java.util.Scanner;

public class CakePurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of cakes available
            int[] cakes = new int[n]; // Array to store cake costs

            for (int i = 0; i < n; i++) {
                cakes[i] = scanner.nextInt(); // Input cake costs
            }

            // Count occurrences of each cake cost using a HashMap
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int cost : cakes) {
                count.put(cost, count.getOrDefault(cost, 0) + 1);
            }

            // Find the minimum cost that appears only once
            int minCost = Integer.MAX_VALUE;
            for (int cost : count.keySet()) {
                if (count.get(cost) == 1) {
                    minCost = Math.min(minCost, cost);
                }
            }

            System.out.println(minCost);
            scanner.close();
        }
    }
}
