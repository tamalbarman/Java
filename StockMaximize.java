public class StockMaximize {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) {
            return 0;
        }

        // Creating arrays to track the maximum profit at each day
        int[] leftProfit = new int[n];
        int[] rightProfit = new int[n];

        // Tracking the maximum profit if a transaction is made from left to right
        int minBuy = prices[0];
        for (int i = 1; i < n; i++) {
            minBuy = Math.min(minBuy, prices[i]);
            leftProfit[i] = Math.max(leftProfit[i - 1], prices[i] - minBuy);
        }

        // Tracking the maximum profit if a transaction is made from right to left
        int maxSell = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxSell = Math.max(maxSell, prices[i]);
            rightProfit[i] = Math.max(rightProfit[i + 1], maxSell - prices[i]);
        }

        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            // Finding the maximum profit by combining left and right transactions
            maxProfit = Math.max(maxProfit, leftProfit[i] + (i + 1 < n ? rightProfit[i + 1] : 0));
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        String input = "3,3,5,0,0,3,1,4";
        String[] pricesStr = input.split(",");
        int[] prices = new int[pricesStr.length];

        for (int i = 0; i < pricesStr.length; i++) {
            prices[i] = Integer.parseInt(pricesStr[i]);
        }

        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }
}
