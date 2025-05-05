public class buySellStocks {

    public static int fun(int prices[]){
        int n = prices.length;
        int minPrice[] = new int[n];

        // find minimum price before currect day
        minPrice[0] = prices[0];
        for(int i=1;i<n;i++){
            minPrice[i] = Math.min(minPrice[i-1],prices[i]);
        }

        // find profit = sell Price - buy price (price[i] - minPrice[i])
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int todayProfit = prices[i] - minPrice[i];
            ans = Math.max(ans, todayProfit);
        }

        return ans;
    }
    public static void main(String[] args) {
        int prices[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(fun(prices));
    }
}
