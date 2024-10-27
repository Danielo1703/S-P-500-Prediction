import com.company.Stock;

public class PredictionModel {
    private TechnicalAnalyzer analyzer;

    public PredictionModel() {
        this.analyzer = new TechnicalAnalyzer();
    }

    public StockPrediction predictNextDayPrice(Stock stock) {
        double[] prices = stock.getHistoricalPrices();
        double[] volumes = stock.getVolumes();

        // Calculate technical indicators
        double sma20 = analyzer.calculateSMA(prices, 20);
        double sma50 = analyzer.calculateSMA(prices, 50);
        double rsi = analyzer.calculateRSI(prices, 14);

        // Simple prediction logic
        double predictedChange = 0;
        String sentiment = "NEUTRAL";

        // Trend analysis
        if (sma20 > sma50) {
            predictedChange += 0.01; // Upward trend
        } else {
            predictedChange -= 0.01; // Downward trend
        }

        // RSI analysis
        if (rsi > 70) {
            predictedChange -= 0.02; // Overbought
            sentiment = "SELL";
        } else if (rsi < 30) {
            predictedChange += 0.02; // Oversold
            sentiment = "BUY";
        }

        double predictedPrice = stock.getCurrentPrice() * (1 + predictedChange);

        return new StockPrediction(stock.getSymbol(), predictedPrice, sentiment, rsi, sma20, sma50);
    }
}
