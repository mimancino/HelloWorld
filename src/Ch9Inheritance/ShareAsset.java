package Ch9Inheritance;

public abstract class ShareAsset implements  Asset{
    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAsset(String symbol,double currentPrice){
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0;

    }
    public ShareAsset(){};

    @Override
    public double getProfit() {
        return totalCost - getMarketValue();
    }
    public abstract double getMarketValue();
    public double getTotalCost(){
        return totalCost;


    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }
    public void addCost(double cost){
        totalCost+=cost;


    }}
