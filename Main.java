import com.company.Stock;

public class Main {
    public static void main(String[] args) {
        // Sample historical data
        double[] historicalPrices = {
                150.25, 151.50, 149.75, 152.00, 153.25, 151.75, 152.50, 153.75,
                152.25, 151.00, 150.50, 151.25, 152.75, 153.50, 152.00, 151.50,
                150.75, 151.75, 152.25, 153.00, 152.50, 151.75
        };

        double[] volumes = {
                1000000, 1200000, 950000, 1100000, 1300000, 1150000, 1050000,
                1250000, 1175000, 1025000, 975000, 1125000, 1275000, 1325000,
                1075000, 1025000, 975000, 1125000, 1175000, 1225000, 1175000, 1100000
        };

        // Create a stock instance
        Stock appleStock = new Stock("AAPL", 153.00, historicalPrices, volumes);

        // Create prediction model and make prediction
        PredictionModel model = new PredictionModel();
        StockPrediction prediction = model.predictNextDayPrice(appleStock);

        // Print prediction
        System.out.println(prediction.toString());
    }
}
