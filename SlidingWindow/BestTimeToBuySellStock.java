public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
    public static int maxProfitOptimized(int prices[]) {
    	int left = 0;   // buy
        int right = 1;  // sell
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right; // new minimum
            }
            right++;
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        int ans = maxProfitOptimized(prices);
        System.out.println(ans);
    }
}