package com.company;

public class Stock {
    private String symbol;
    private double currentPrice;
    private double[] historicalPrices;
    private double[] volumes;

    public Stock(String symbol, double currentPrice, double[] historicalPrices, double[] volumes) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        this.historicalPrices = historicalPrices;
        this.volumes = volumes;
    }

    // Getters and setters
    public String getSymbol() { return symbol; }
    public double getCurrentPrice() { return currentPrice; }
    public double[] getHistoricalPrices() { return historicalPrices; }
    public double[] getVolumes() { return volumes; }
}
