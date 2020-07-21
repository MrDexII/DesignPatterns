package GoFDesignPatterns.StructuralDesignPatterns.Adapter.AdapterExample1;

public class Volt {

    private int volts;

    public Volt(int volts) {
        this.volts = volts;
    }

    public int getVolts(){
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
