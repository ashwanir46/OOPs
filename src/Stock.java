public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String name, String symbol, double previousClosingPrice, double currentPrice) {
        this.name = name;
        this.symbol = symbol;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;

    }

    double getChangePercent() {
        double percent = 0;
        if (previousClosingPrice < currentPrice) {
            double increase = currentPrice - previousClosingPrice;
            percent = (increase * currentPrice) / 100;
            return percent;
        } else {
            double decrease = previousClosingPrice - currentPrice;
            percent = (decrease * currentPrice) / 100;
            return percent;
        }
    }
}
