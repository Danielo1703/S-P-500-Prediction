public class StockPrediction {
    private String symbol;
    private double predictedPrice;
    private String sentiment;
    private double rsi;
    private double sma20;
    private double sma50;

    public StockPrediction(String symbol, double predictedPrice, String sentiment,
                           double rsi, double sma20, double sma50) {
        this.symbol = symbol;
        this.predictedPrice = predictedPrice;
        this.sentiment = sentiment;
        this.rsi = rsi;
        this.sma20 = sma20;
        this.sma50 = sma50;
    }

    @Override
    public String toString() {
        return String.format(
                "Prediction for %s:\n" +
                        "Predicted Price: $%.2f\n" +
                        "Sentiment: %s\n" +
                        "Technical Indicators:\n" +
                        "  RSI: %.2f\n" +
                        "  SMA20: %.2f\n" +
                        "  SMA50: %.2f",
                symbol, predictedPrice, sentiment, rsi, sma20, sma50
        );
    }
}