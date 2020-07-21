package GoFDesignPatterns.BehavioralDesignPatterns.Visitor.Example2Tax;

//Concrete Visitor Class

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TaxVisitor implements Visitor {

    //This formats the item prices to 2 decimal places

    DecimalFormat df = settingDF();


    //This is created so that each item is sent to the
    //right version of visit() which is required by the
    //visitor interface and defined below

    //Calculate total price based on this being taxed
    //as a liquor item
    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
    }

    //Calculate total price based on this being taxed
    //as a tobacco item
    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
    }

    //Calculate total price based on this being taxed
    //as a necessity item
    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(df.format(necessityItem.getPrice()));
    }

    private DecimalFormat settingDF() {
        DecimalFormatSymbols commaSymbol = new DecimalFormatSymbols(Locale.getDefault());
        commaSymbol.setDecimalSeparator('.');
        commaSymbol.setGroupingSeparator(',');
        return new DecimalFormat("#.##", commaSymbol);
    }
}
