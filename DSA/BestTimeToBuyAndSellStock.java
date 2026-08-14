package DSA;

//**Greedy tracking:** Making the best possible choice at each step using the information seen so far, while continuously updating that choice as you move through the data.

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] prices = {7, 1, 5, 3, 6, 4};
        //Think element in an array as the price of a stock at one day
        int minPrice = prices[0];
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
                buyDay = i;
            }
            int profit = prices[i] - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
                sellDay = i;
            }
        }
        System.out.println("Maxprofit: "+maxProfit);
        System.out.println("Buy day: "+buyDay);
        System.out.println("Sell day: "+sellDay);
    }    
}
//Time: O(n), Space:O(1)
//Edge case: prices strictly decreasing (answer is 0, never buy),single price (no transaction possible).