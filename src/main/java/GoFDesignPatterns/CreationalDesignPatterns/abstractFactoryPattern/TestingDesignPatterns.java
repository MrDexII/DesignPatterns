package GoFDesignPatterns.CreationalDesignPatterns.abstractFactoryPattern;

public class TestingDesignPatterns {

    public static void main(String[] args){
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB","500GB","2.4GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16GB","1TB","2.9GHz"));

        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
