package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Commands;

import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Receivers.ElectronicDevice;

import java.util.List;

public class TurnItAllOff implements Command {

    List<ElectronicDevice> devices;

    public TurnItAllOff(List<ElectronicDevice> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : devices)
            device.off();
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : devices)
            device.on();
    }
}
