package GoFDesignPatterns.BehavioralDesignPatterns.Mediator.Example2Stock;

public class StockOffer {

    private int stockShares;
    private String stackSymbol;
    private int colleagueCode;

    public StockOffer(int stockShares, String stackSymbol, int colleagueCode) {
        this.stockShares = stockShares;
        this.stackSymbol = stackSymbol;
        this.colleagueCode = colleagueCode;
    }

    public int getStockShares() {
        return stockShares;
    }

    public String getStackSymbol() {
        return stackSymbol;
    }

    public int getColleagueCode() {
        return colleagueCode;
    }
}
