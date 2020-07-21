package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Receivers;

public class Television implements ElectronicDevice {

    private int volume;

    public Television() {
        volume = 0;
    }

    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV volume is at: " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV volume is at: " + volume);
    }
}