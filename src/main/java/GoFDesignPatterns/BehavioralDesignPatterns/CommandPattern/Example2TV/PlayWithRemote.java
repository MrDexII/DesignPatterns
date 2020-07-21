package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV;

import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Commands.TurnItAllOff;
import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Commands.TurnTVOff;
import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Commands.TurnTVOn;
import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Commands.TurnTVUp;
import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Invokers.DeviceButton;
import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Receivers.ElectronicDevice;
import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Receivers.Radio;
import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Receivers.Television;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

    public static void main(String[] args) {
        //Gets the ElectronicDevice to use
        ElectronicDevice device = TVRemote.getDevice();

        //TurnTVOn contains the command to turn on the tv
        //When execute() is called on this command object
        //it will execute the method on() in Television
        TurnTVOn onCommand = new TurnTVOn(device);

        //Calling the execute() causes on() to execute in Television
        DeviceButton onPressed = new DeviceButton(onCommand);

        //When press() is called theCommand.execute(); executes
        onPressed.press();

        //-----------------------------------------------------------------

        //Now when execute() is called off() of Television executes
        TurnTVOff offCommand = new TurnTVOff(device);

        //Calling the execute() causes off() to execute in Television
        onPressed = new DeviceButton(offCommand);

        //When press() is called theCommand.execute(); executes
        onPressed.press();

        //-----------------------------------------------------------------

        //Now when execute() is called volumeUp() of Television executes
        TurnTVUp volUpCommand = new TurnTVUp(device);

        //Calling the execute() causes volumeUp() to execute in Television
        onPressed = new DeviceButton(volUpCommand);

        //When press() is called theCommand.execute(); executes
        onPressed.press();
        onPressed.press();
        onPressed.press();

        //-----------------------------------------------------------------

        //Creating a TV and Radio to turn off with 1 press
        Television theTV = new Television();
        Radio theRadio = new Radio();

        //Add the Electronic Device to a List
        List<ElectronicDevice> devices = new ArrayList<>();
        devices.add(theTV);
        devices.add(theRadio);

        //Send the List to Electronic Devices to TurnAllOff
        //where a call to run execute() on this function will
        //call off() for each device in the list
        TurnItAllOff turnItAllOff = new TurnItAllOff(devices);

        //This calls for execute() to run which calls for off() to
        //run for every ElectronicDevice
        DeviceButton turnThemOff = new DeviceButton(turnItAllOff);
        turnThemOff.press();
        //-----------------------------------------------------------------

        //It is common to be able to undo a command in a command pattern
        //To do so, DeviceButton will have a method called undo
        //Undo() will perform the opposite action that the normal
        //CommandPattern performs undo() needs to be added to every class
        //with an execute()
        turnThemOff.pressUndo();
    }
}
