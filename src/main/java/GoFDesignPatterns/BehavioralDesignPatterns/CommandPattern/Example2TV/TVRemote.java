package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV;

import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Receivers.ElectronicDevice;
import GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Receivers.Television;

public class TVRemote {
    public static ElectronicDevice getDevice() {
        return new Television();
    }
}
