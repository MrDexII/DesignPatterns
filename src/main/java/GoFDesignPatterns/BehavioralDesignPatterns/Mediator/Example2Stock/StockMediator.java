package GoFDesignPatterns.BehavioralDesignPatterns.Mediator.Example2Stock;

import java.util.ArrayList;

public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockSaleOffers;
    private ArrayList<StockOffer> stockBuyOffers;

    private int colleagueCodes = 0;

    public StockMediator() {

        colleagues = new ArrayList<>();
        stockSaleOffers = new ArrayList<>();
        stockBuyOffers = new ArrayList<>();
    }

    @Override
    public void saleOffer(String stock, int shares, int colleagueCode) {
        boolean stockSold = false;
        for (StockOffer offer : stockBuyOffers) {
            if ((offer.getStackSymbol() == stock) && (offer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + stock + " sold to colleague code " + offer.getColleagueCode());

                stockBuyOffers.remove(offer);
                stockSold = true;
            }
            if (stockSold) {
                break;
            }
        }
        if (!stockSold) {
            System.out.println(shares + " share of " + stock + " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, colleagueCode);
            stockSaleOffers.add(newOffering);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int colleagueCode) {
        boolean stockBought = false;
        for (StockOffer offer : stockSaleOffers) {
            if ((offer.getStackSymbol() == stock) && (offer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + stock + " bought by colleague code " + offer.getColleagueCode());

                stockSaleOffers.remove(offer);
                stockBought = true;
            }
            if (stockBought) {
                break;
            }
        }
        if (!stockBought) {
            System.out.println(shares + " share of " + stock + " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, colleagueCode);
            stockBuyOffers.add(newOffering);
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
        colleagueCodes++;
        colleague.setCollCode(colleagueCodes);
    }

    public void getStockOfferings(){
        System.out.println("\nStock for Sale");
        for (StockOffer offer:stockSaleOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStackSymbol());
        }

        System.out.println("\nStock Buy Offers");
        for (StockOffer offer:stockBuyOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStackSymbol());
        }
    }
}
