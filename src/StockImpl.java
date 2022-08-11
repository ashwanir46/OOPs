public class StockImpl {
    public static void main(String[] args) {

        Stock obj = new Stock("Oracle", "ORCL", 34.5, 34.35);
        double percent = obj.getChangePercent();

        System.out.println("obj.name = " + obj.name);
        System.out.println("obj.symbol = " + obj.symbol);
        double pre = obj.previousClosingPrice;
        System.out.println("obj.previousClosingPrice = " + pre);
        double post = obj.currentPrice;
        System.out.println("obj.currentPrice = " + post);
        if (pre < post) {
            System.out.println("Increase Change percent = " + percent);
        } else {
            System.out.println("Decrease change percent = " + percent);
        }
    }
}
