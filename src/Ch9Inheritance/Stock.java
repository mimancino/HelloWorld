package Ch9Inheritance;

public class Stock extends ShareAsset {
    int totalShares;
    public Stock(String symbol,double currentPrice){
        super(symbol,currentPrice);
    }
    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice() ;
    }
    public int getTotalShares(){
        return totalShares;
    }
    public void purchase(double price, int amount) {
        totalShares+=amount;
        addCost(amount * price);
    }

    }
