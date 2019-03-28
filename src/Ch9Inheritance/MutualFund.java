package Ch9Inheritance;

public class MutualFund extends ShareAsset {
    private double totalShares;
    public MutualFund(double totalShares, String symbol, double currentPrice){
        super(symbol,currentPrice);
        totalShares = 0;


    }
    public double getMarketValue() {
        return totalShares * getCurrentPrice() ;
    }
    public double getTotalShares(){
        return totalShares;
    }
    public void purchase(double price, int amount) {
        totalShares+=amount;
        addCost(amount * price);
    }

    }


