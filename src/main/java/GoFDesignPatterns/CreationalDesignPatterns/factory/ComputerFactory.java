package GoFDesignPatterns.CreationalDesignPatterns.factory;

public class ComputerFactory {
    public static Computer getComputer(ComputerTypes type, String ram, String hdd, String cpu) {
//        if ("PC".equalsIgnoreCase(type.toString())) return new PC(ram, hdd, cpu);
//        else if ("Server".equalsIgnoreCase(type.toString())) return new Server(ram, hdd, cpu);
//        return null;
        Computer com = null;
        switch (type) {
            case PC:
                com = new PC(ram, hdd, cpu);
                break;
            case SERVER:
                com = new Server(ram, hdd, cpu);
                break;
        }
        return com;
    }
}
