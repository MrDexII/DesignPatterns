package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Commands;

import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Receivers.ElectronicDevice;

public class TurnTVDown implements Command {

    ElectronicDevice device;

    public TurnTVDown(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.volumeDown();
    }

    @Override
    public void undo() {
        this.device.volumeUp();
    }
}
