package GoFDesignPatterns.CreationalDesignPatterns.builder.one;

public class TestBuilderPattern {

    public static void main(String[] args) {
        //Using GoFDesignPatterns.CreationalDesignPatterns.builder to get the object in a single line of code and
        // without any inconsistent state or arguments management issues

        Computer com = new Computer
                .ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(com);
    }
}
