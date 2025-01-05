package LeetCode;

public class BestTimetoBuyandSellStock121 {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }


    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[prices.length - 1];
        for (int i = 1; i < prices.length / 2; i++) {
            if (prices.length % 2 == 0) {
                if (prices[min] > prices[i])
                    min = prices[i];
                else if (prices[max] < prices[prices.length - i-1]) {
                    max = prices[prices.length - i];
                }
            } else {
                if (prices[min] > prices[i])
                    min = prices[i];
                else if (prices[max] < prices[prices.length - i-1]) {
                    max = prices[prices.length - i];
                }
            }



        }
        return max - min;
    }
}
