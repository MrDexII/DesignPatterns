package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Commands;

import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Receivers.ElectronicDevice;

public class TurnTVUp implements Command {

    ElectronicDevice device;

    public TurnTVUp(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.volumeUp();
    }

    @Override
    public void undo() {
        this.device.volumeDown();
    }
}
