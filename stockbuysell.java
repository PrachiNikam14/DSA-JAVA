// Brute force: 


// public class stockbuysell{
//      public static int stockbuySell(int[] prices) {
//         // Initialize max profit to 0
//         int maxProfit = 0;

//         // Loop through each day as a potential buy day
//         for (int i = 0; i < prices.length; i++) {
//             // Loop through each future day as a potential sell day
//             for (int j = i + 1; j < prices.length; j++) {
//                 // Calculate profit
//                 int profit = prices[j] - prices[i];

//                 // Update max profit if higher
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//         }

//         // Return the maximum profit
//         return maxProfit;
//     }

//     public static void main(String[] args) {
//           int[] prices = {7, 5, 3, 6, 4};
//         System.out.println("Max Profit: " + stockbuySell(prices));
//     }
// }


// Optimized

public class stockbuysell{

    public static int stock(int prices[]){

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int price : prices){
        if(price<minPrice){
            minPrice = price;
        }
        else{
            maxProfit = Math.max(maxProfit, price-minPrice);
        }
    }

    return maxProfit;
}


    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(stock(prices));
    }
}