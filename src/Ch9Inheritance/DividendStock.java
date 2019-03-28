package Ch9Inheritance;

public class DividendStock extends Stock {
    private double dividends;
    //amt of divdends paid
    public DividendStock(double dividends, String symbol,double currentPrice){
        super(symbol,currentPrice);
        dividends = 0.0;
    }


    @Override
    public double getMarketValue() {
        return super.getMarketValue() + dividends;
    }
    public void payDividend(double amountPerShares){
        dividends += getTotalShares() * amountPerShares;

    }
}
