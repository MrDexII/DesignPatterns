package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Commands;

import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Receivers.ElectronicDevice;

public class TurnTVOff implements Command {

    ElectronicDevice device;

    public TurnTVOff(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.off();
    }

    @Override
    public void undo() {
        this.device.on();
    }
}
