package GoFDesignPatterns.BehavioralDesignPatterns.Interpreter.Example2;

public class ConversionContext {

    private String conversionQues = "";
    private String conversionResponse = "";
    private String fromConversion = "";
    private String toConversion = "";
    private double quantity;

    String[] partsOfQues;

    public ConversionContext(String input) {
        this.conversionQues = input;
        partsOfQues = getInput().split(" ");
        fromConversion = getCapitalized(partsOfQues[1]);
        toConversion = getLowercase(partsOfQues[3]);
        quantity = Double.valueOf(partsOfQues[0]);
        conversionResponse = partsOfQues[0] + " " + partsOfQues[1] + " equals";
    }


    private String getInput() {
        return conversionQues;
    }

    public String getFromConversion() {
        return fromConversion;
    }

    public String getToConversion() {
        return toConversion;
    }

    public String getResponse() {
        return conversionResponse;
    }

    public double getQuantity() {
        return quantity;
    }

    //Make String lowercase
    private String getLowercase(String wordToLowercase) {
        return wordToLowercase.toLowerCase();
    }

    //Capitalizes the first letter of a word
    private String getCapitalized(String wordToCapitalized) {
        //Make characters lower case
        wordToCapitalized = wordToCapitalized.toLowerCase();
        //Make the first character uppercase
        wordToCapitalized = Character.toUpperCase(wordToCapitalized.charAt(0)) +
                wordToCapitalized.substring(1);
        //Put s on the end if not there
        int lengthOfWord = wordToCapitalized.length();
        if ((wordToCapitalized.charAt(lengthOfWord - 1)) != 's') {
            wordToCapitalized = new StringBuffer(wordToCapitalized).insert(lengthOfWord, "s").toString();
        }
        return wordToCapitalized;
    }
}
