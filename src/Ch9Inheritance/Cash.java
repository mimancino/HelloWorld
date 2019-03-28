package Ch9Inheritance;

public class Cash implements Asset{
    double amount;

    public Cash(double amount){
        this.amount = amount
    }
    @Override
    public double getMarketValue() {
        return amount
    }

    @Override
    public double getProfit() {
        return 0;
    }
    public void
}
