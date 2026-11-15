public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] input = new int[] { 7, 1, 5, 3, 6, 4 };
        int result = findBestTimeToSellStock(input);
        System.out.println(result);
    }

    public static int findBestTimeToSellStock(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }

}