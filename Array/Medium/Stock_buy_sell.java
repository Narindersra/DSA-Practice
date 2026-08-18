public class Stock_buy_sell {
    void stockBuySell(int price[], int n){
        int min_price = price[0];
        int max_profit = 0;

        for (int i = 1; i < n; i++) {
            if (price[i] < min_price) {
                min_price = price[i];
            }
            int current_profit = price[i] - min_price;
            if (current_profit > max_profit) {
                max_profit = current_profit;
            }
        }
        System.out.println("Maximum profit: " + max_profit);
    }

    public static void main(String[] args) {
        Stock_buy_sell stock = new Stock_buy_sell();
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        int n = price.length;
        stock.stockBuySell(price, n);
    }
}
