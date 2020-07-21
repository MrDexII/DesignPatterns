package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Invokers;

import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Commands.Command;

//This is known as the invoker
//It has a method press() that when executed
//causes the execute method to be called

//The execute method for the CommandPattern interface then calls
//the method assigned in the class that implements the
//CommandPattern interface
public class DeviceButton {

    Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    //Now the remote can undo past commands
    public void pressUndo() {
        command.undo();
    }
}
