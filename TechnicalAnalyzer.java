public class TechnicalAnalyzer {
    public double calculateSMA(double[] prices, int period) {
        if (period > prices.length) return 0;

        double sum = 0;
        for (int i = prices.length - period; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum / period;
    }

    public double calculateRSI(double[] prices, int period) {
        if (period >= prices.length) return 50;

        double[] gains = new double[period];
        double[] losses = new double[period];

        for (int i = prices.length - period; i < prices.length - 1; i++) {
            double difference = prices[i + 1] - prices[i];
            if (difference > 0) {
                gains[i % period] = difference;
                losses[i % period] = 0;
            } else {
                gains[i % period] = 0;
                losses[i % period] = Math.abs(difference);
            }
        }

        double avgGain = calculateAverage(gains);
        double avgLoss = calculateAverage(losses);

        if (avgLoss == 0) return 100;
        double rs = avgGain / avgLoss;
        return 100 - (100 / (1 + rs));
    }

    private double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}